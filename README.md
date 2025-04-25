✨ Description:
AI Resume Analyzer is an AI-powered tool designed to help job seekers enhance their resumes based on specific job descriptions. It provides personalized feedback, a match score out of 100, and suggestions to optimize resumes for better visibility in ATS/RTS systems. The system is built with Java (Spring Boot), integrates AI APIs (OpenAI or Azure), and features a user-friendly frontend to display results.
Whether you're a fresh graduate or an experienced professional, our tool helps tailor your resume to stand out for the role you're applying to.

🎯 Key Features:
1) PDF Resume to Text Conversion using Apache PDFBox
2) AI-Powered Matching & Suggestions using OpenAI or Azure OpenAI
3) Resume Score indicating job match relevance
4) etailed Suggestions on skills, keywords, and content gaps

🧠 The Problem:
Many candidates are rejected by ATS (Applicant Tracking Systems) before a human even sees their resume. Why?
1) Missing keywords from the job description
2) Poor formatting or irrelevant experience
3) Lack of tailored content
Our AI Resume Analyzer solves this by bridging the gap between what you’ve written and what the job post expects.

🔧 Technology         Stack:
1) Layer:	                Technology Used
2) Backend:              Java, Spring Boot, Hibernate
3) PDF Processing:	      Apache PDFBox
4) AI Analysis:	          Azure OpenAI
5) Frontend:	            Bootstrap and javascript
6) DB:	                  MySQL

⚙️ How It Works:
1.	User uploads a PDF resume and enters a job description on the web interface.
2.	Java backend converts PDF to text using Apache PDFBox.
3.	Job description and resume text are sent to AI API, which analyzes similarity, highlights missing keywords, and gives a relevance score.
4.	Frontend displays the AI-generated score and suggestions, helping the user improve their resume and re-upload if needed.
________________________________________
🛠️ How to Set Up and Run AI Resume Analyzer

📦 Requirements:
1. Java 17 or 21 (JDK)
2. Maven
3. Spring Boot (v3+)
4. MySQL (set up using XAMPP) (make database named resumedb in your mysql database)
5. Apache PDFBox (for parsing resume PDFs)
6. OpenAI or Azure API Key (for AI analysis)
7. Bootstrap & JavaScript (for frontend)
8. XAMPP (for local MySQL server)
   

---
⚙️ Step-by-Step Setup Instructions:
1. ✅ Install Required Tools
    1. Download and install [Java JDK 17 or 21](https://www.oracle.com/java/technologies/javase-downloads.html)
    2. Download and install [Maven](https://maven.apache.org/download.cgi)
    3. Download and install [XAMPP](https://www.apachefriends.org/download.html)
    4. (Optional) Install IntelliJ IDEA or VSCode for development

---

2. 💾 Set Up MySQL Database with XAMPP
    1. Launch **XAMPP** and start the **Apache** and **MySQL** modules
    2. Go to [http://localhost/phpmyadmin](http://localhost/phpmyadmin)
    3. Create a new database named `resumedb`:
       ```sql
       CREATE DATABASE resumedb;


3. 🧠 Configure `application.properties`
    1. Open the file at `src/main/resources/application.properties`
    2. Update it with the following:
    # MySQL Database Configuration
   ```sql
      spring.datasource.url=jdbc:mysql://localhost:3306/resumedb
      spring.datasource.username=root
      spring.datasource.password=
   
   # Hibernate Configuration
      spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
      spring.jpa.hibernate.ddl-auto=update
      spring.jpa.show-sql=true

      # API Key for AI Integration
      openai.api.key=YOUR_OPENAI_API_KEY
      # or for Azure
      azure.api.key=YOUR_AZURE_API_KEY


5. 📥 Clone the Repository
    1. Open your terminal and run:
       ```bash
       git clone https://github.com/pranish9/AI-Resume-Analyzer-Smart-Resume-Insights-Scoring-Engine-Spring-boot-Hibernate-Spring-AI-Azure-OpenAI.git
       
       ```


6. 📦 Build and Run the Project
    1. Use Maven to build and run:
       ```bash
       mvn clean install
       mvn spring-boot:run
       ```
    2. Or, run `ResumeAnalyzerApplication.java` directly using IntelliJ IDEA.

7. 🌐 Access the App
    1. Open your browser and go to:
       ```
       http://localhost:8080/
       ```
    2. Upload a resume in PDF format and let the AI analyze and give suggestions.


Notes:
1. Make sure Apache PDFBox is included in your `pom.xml`:
   ```xml
   <dependency>
     <groupId>org.apache.pdfbox</groupId>
     <artifactId>pdfbox</artifactId>
     <version>2.0.27</version>
   </dependency>
   ```
2. Bootstrap, JS, and frontend assets should be located under `src/main/resources/static/`.

Note: You only need to make database resumedb and need required application. Many things are already defined dependency pom.xml and maven
________________________________________
💡 Business Use Case:
Career guidance platforms, university placement cells, and job portals can integrate this analyzer to help users prepare resumes optimized for ATS systems—improving job placement and user satisfaction.
________________________________________
🧠 Key Takeaways:
1. AI isn’t just a buzzword—it’s a practical tool to increase your job chances
2. Resume Analyzer gives concrete, actionable suggestions
3.	Integration with modern cloud tools like Azure ensures scalability and performance
________________________________________
👨‍💻 Contributors:
1.	Pranish Raj Tuladhar
2. Ryan Ratna Tuladhar
3.	Sanjil Shilakar
