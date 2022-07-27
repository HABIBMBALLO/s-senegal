package com.simplon.simplonsenegal.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.management.AttributeNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public Candidat findById(@PathVariable("id") Long id) {
        Optional<Candidat> emp = candidatRepository.findById(id);
        return emp.orElse(null);
    }

    @DeleteMapping("/candidats/{id}")
    public void deleteCandidat(@PathVariable Long id) {
        candidatRepository.deleteById(id);
    }

    @PutMapping("/candidats/update/{id}")
    public Candidat updateCandidat(@PathVariable("id") long id, @RequestBody Candidat candidat) {
        candidat.setId(id);
        return candidatRepository.save(candidat);
    }


    //delete Candidat
//    @DeleteMapping("/candidat/{id}")
//    public Map<String, Boolean> deleteCandidat(@PathVariable(value = "id") Long candidatId)
//            throws AttributeNotFoundException {
//        Candidat candidat = candidatRepository.findById(candidatId)
//                .orElseThrow(() -> new AttributeNotFoundException("Candidat not found for this id :: " + candidatId));
//
//        candidatRepository.delete(candidat);
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("deleted", Boolean.TRUE);
//        return response;
//    }

}
