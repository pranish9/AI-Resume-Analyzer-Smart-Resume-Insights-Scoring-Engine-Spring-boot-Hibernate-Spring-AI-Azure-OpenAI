package com.smart_resume_analyzer.controller;


import com.azure.ai.openai.OpenAIClient;
import com.azure.ai.openai.OpenAIClientBuilder;
import com.azure.ai.openai.models.ChatChoice;
import com.azure.ai.openai.models.ChatCompletions;
import com.azure.ai.openai.models.ChatCompletionsOptions;
import com.azure.ai.openai.models.ChatMessage;
import com.azure.ai.openai.models.ChatRole;
import com.smart_resume_analyzer.controller.*;
import com.azure.core.credential.AzureKeyCredential;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PromptController {

    @Value("${azure.openai.api.key}")
    private String azureOpenaiKey;

    @Value("${azure.openai.endpoint}")
    private String endpoint;

    @Value("${azure.openai.deployment.model.id}")
    private String deploymentOrModelId;

    @PostMapping("/answer")
    public List<String> getMethodName(@RequestBody PromptQuestion promptQuestion) {
    	
        List<String> responseList = new ArrayList<>();
        try {
            OpenAIClient client = new OpenAIClientBuilder()
                    .endpoint(endpoint)
                    .credential(new AzureKeyCredential(azureOpenaiKey))
                    .buildClient();

            List<ChatMessage> messages = new ArrayList<>();
            messages.add(new ChatMessage(ChatRole.SYSTEM).setContent("You are an AI assistant agent that give resume score from 0 to 100 according to Applicant Tracking Systems (ATS) and "
            		+ "suggest improvement a prefect resume should have according to job description and standard of resume for that field "));
            messages.add(new ChatMessage(ChatRole.USER).setContent(getPrompt(promptQuestion)));

            ChatCompletionsOptions options = new ChatCompletionsOptions(messages)
                    .setTemperature(0.7)
                    .setTopP(0.95)
                    .setMaxTokens(1200);

            ChatCompletions completions = client.getChatCompletions(deploymentOrModelId, options);

            for (ChatChoice choice : completions.getChoices()) {
                responseList.add(choice.getMessage().getContent().trim());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            responseList.add("Exception Occurred");
        }
        return responseList;
    }

    private String getPrompt(PromptQuestion promptQuestion) {
        String input = promptQuestion.getQuestion().trim();        
        return input;
    }
}