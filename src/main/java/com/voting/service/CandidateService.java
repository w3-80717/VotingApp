package com.voting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voting.entity.Candidate;
import com.voting.repository.CandidateRepository;

@Service
public class CandidateService {
  @Autowired
  private CandidateRepository candRepository;
  
	public List<Candidate> getAllCandidate() {
		//List<Candidate> list= candRepository.findAll();
		return candRepository.findAll();
	}

	public Candidate getCandidateById(int id) {
		// TODO Auto-generated method stub
		return candRepository.findById(id).get();
	}

	public Candidate saveCandidate(Candidate mb) {
		// TODO Auto-generated method stub
		return candRepository.save(mb);
	}

    

}
