package com.voting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voting.entity.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer>{

}
