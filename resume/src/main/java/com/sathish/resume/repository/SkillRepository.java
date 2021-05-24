package com.sathish.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathish.resume.model.Skills;

@Repository
public interface SkillRepository extends JpaRepository<Skills, Long>{

}
