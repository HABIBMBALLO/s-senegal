package com.simplon.simplonsenegal.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Data
//@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Candidat {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String prenom;
    private String nom;
    private Date dateOfBirth;
    private String phone;
    private String email;
    private String cin;
    private String adresse ;
    private String ville;
    private String nationality;
    private String niveauEtud;
    private String titreDiplome;
    private String university;


    @OneToOne(mappedBy = "candidat")
    private User user;

    @ManyToMany(fetch = FetchType.EAGER )
    private List<Appelcandidature> appelCandidatures;
}
