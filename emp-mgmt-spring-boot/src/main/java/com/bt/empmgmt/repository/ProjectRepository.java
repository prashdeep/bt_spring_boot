package com.bt.empmgmt.repository;

import com.bt.empmgmt.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}