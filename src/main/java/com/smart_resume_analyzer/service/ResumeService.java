package com.smart_resume_analyzer.service;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.smart_resume_analyzer.utility.TextExtractor;

@Service
public class ResumeService {
    public String extractText(MultipartFile file) throws IOException {
        // use utility to convert PDF to text
        return TextExtractor.extractTextFromPdf(file);
    }
}
