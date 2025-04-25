package com.smart_resume_analyzer.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "resume_analysis")
public class ResumeAndDescription {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Lob
	    @Column(columnDefinition = "MEDIUMBLOB")
	    private byte[] resume;

	    
	    @Column(name = "resume_text", columnDefinition = "TEXT")
	    private String resumeText;

	    @Column(name = "job_description", columnDefinition = "TEXT")
	    private String jobDescription;

	    private int score;

	    @Column(name = "suggestions", length = 50000)
	    private String suggestions;

	    @Column(name = "created_at")
	    private LocalDateTime createdAt = LocalDateTime.now();

	    
	    @PrePersist
	    protected void onCreate() {
	        this.createdAt = LocalDateTime.now();
	    }
 
	    // --- Getters and Setters ---

	    public Long getId() {
	        return id;
	    }

	    public byte[] getResume() {
			return resume;
		}

		public void setResume(byte[] resume) {
			this.resume = resume;
		}

		public void setId(Long id) {
	        this.id = id;
	    }

	    public String getResumeText() {
	        return resumeText;
	    }

	    public void setResumeText(String resumeText) {
	        this.resumeText = resumeText;
	    }

	    public String getJobDescription() {
	        return jobDescription;
	    }

	    public void setJobDescription(String jobDescription) {
	        this.jobDescription = jobDescription;
	    }

	    public int getScore() {
	        return score;
	    }

	    public void setScore(int score) {
	        this.score = score;
	    }

	    public String getSuggestions() {
	        return suggestions;
	    }

	    public void setSuggestions(String suggestions) {
	        this.suggestions = suggestions;
	    }

	    public LocalDateTime getCreatedAt() {
	        return createdAt;
	    }

	    public void setCreatedAt(LocalDateTime createdAt) {
	        this.createdAt = createdAt;
	    }
	}


