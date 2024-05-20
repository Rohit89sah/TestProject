package com.pracice.testProj.repository;

import com.pracice.testProj.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {

}
