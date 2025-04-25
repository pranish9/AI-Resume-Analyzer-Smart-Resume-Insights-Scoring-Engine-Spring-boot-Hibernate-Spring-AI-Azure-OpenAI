package com.smart_resume_analyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart_resume_analyzer.model.ResumeAndDescription;

public interface ResumeRepository extends JpaRepository<ResumeAndDescription, Long> {
	

}
