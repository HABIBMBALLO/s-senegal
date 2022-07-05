package com.simplon.simplonsenegal.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.simplonsenegal.entities.Candidat;
import com.simplon.simplonsenegal.repositories.CandidatRepository;
import com.simplon.simplonsenegal.service.CandidatService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;



@RestController
public class CandidatController {

    @Autowired
    private CandidatRepository candidatRepository;
    @Autowired
    private CandidatService candidatService;
    public CandidatController(CandidatRepository candidatRepository, CandidatService candidatService) {
        this.candidatRepository = candidatRepository;
        this.candidatService = candidatService;
    }
    @PostMapping("/createCandidat")
    public Candidat createCandidat(@Valid @RequestBody Candidat candidat) {
        return candidatRepository.save(candidat);
    }
    @GetMapping("/candidats")
    public List<Candidat> getAllCandidates() {
        return candidatRepository.findAll();
}
    @GetMapping("/candidats/{id}")
    public Candidat getCandidatById(int id) {
        return candidatRepository.findById(id);
    }
//    @GetMapping("/candidat/{id}")
//	public ResponseEntity<Candidat> findById(@PathVariable("id") Long id) {
//		Optional<Candidat> emp = Optional.  ofNullable(candidatRepository.findById(id));
//		if (emp.isPresent())
//			return new ResponseEntity<Candidat>(emp.get(), HttpStatus.OK);
//		else
//			return new ResponseEntity<Candidat>(HttpStatus.NO_CONTENT);
//	}
//	 @DeleteMapping("/candidate/{id}")
//		void deleteNote(@PathVariable Long id) {
//			candidatRepository.deleteById(id);
//		  }

}
