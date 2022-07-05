package com.simplon.simplonsenegal.service;

import com.simplon.simplonsenegal.entities.Candidat;
import org.springframework.stereotype.Service;

@Service
public class CandidatService {
    public Candidat createCandidat(Candidat candidat) {
        return candidat;
    }

    public Candidat updateCandidat(Candidat candidat) {
        return candidat;
    }

    public void deleteCandidat(Candidat candidat) {
    }

    public Candidat getCandidat(Long id) {
        return new Candidat();
    }

    public Candidat getCandidatByEmail(String email) {
        return new Candidat();
    }

    public Candidat getCandidatByLogin(String login) {
        return new Candidat();
    }

    public Candidat getCandidatByLoginAndPassword(String login, String password) {
        return new Candidat();
    }

    public Candidat getCandidatByLoginAndPasswordAndRole(String login, String password, String role) {
        return new Candidat();
    }

}
