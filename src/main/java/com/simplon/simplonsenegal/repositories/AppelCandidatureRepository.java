package com.simplon.simplonsenegal.repositories;

import com.simplon.simplonsenegal.entities.Appelcandidature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
@RestController
public interface AppelCandidatureRepository extends JpaRepository<Appelcandidature, Long> {
    
}
