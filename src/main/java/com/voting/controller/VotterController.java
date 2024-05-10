package com.voting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.voting.entity.Candidate;

import com.voting.service.CandidateService;

@Controller
public class VotterController {
    @Autowired
    private CandidateService candService;
    @Autowired
   
    
    @GetMapping("candidates")
    public ModelAndView getAllCandidate() {
    	//ModelAndView mb = new ModelAndView();
    	List<Candidate> list = candService.getAllCandidate();
 	    return new ModelAndView("CandidateList","Candidate",list);
    }
 
    @GetMapping("candidateList") 
    public ModelAndView getAllCandidateList() {
    	//ModelAndView mb = new ModelAndView();
    	 List<Candidate> list = candService.getAllCandidate();
    	return new ModelAndView("CandidateCountingList","Candidate",list);
    }//canCountingService.findAll()
    
    @GetMapping("candidate/{id}") //ye sb same tha
    public String addCandidate(@PathVariable("id") int id) {
 	   Candidate c = candService.getCandidateById(id);//3.BookService ye line me change kiya 
 	   Candidate mb = new Candidate(c.getId(),c.getName(),c.getDescription(),c.getCount()+1);// or ye or ek method banai
 	   candService.saveCandidate(mb);//1.MyBookListService save 
 	   return "redirect:/candidateList"; 
    }//
}
