package com.simplon.simplonsenegal.controller;

import com.simplon.simplonsenegal.entities.Appelcandidature;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.simplonsenegal.repositories.AppelCandidatureRepository;
import com.simplon.simplonsenegal.service.AppelCandidatureService;

import java.util.List;

@RestController
public class AppelCandidatureController {

    private AppelCandidatureRepository appelCandidatureRepository;
    private AppelCandidatureService appelCandidatureService;

    public AppelCandidatureController(AppelCandidatureRepository appelCandidatureRepository, AppelCandidatureService appelCandidatureService) {
        this.appelCandidatureRepository = appelCandidatureRepository;
        this.appelCandidatureService = appelCandidatureService;
    }

    @GetMapping("/appelCandidature")
    public List<Appelcandidature> getAllAppelCandidature() {
        return appelCandidatureRepository.findAll();
    }

}
