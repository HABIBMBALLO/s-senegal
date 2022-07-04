package com.simplon.simplonsenegal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;



@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Formation {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFormation;
    private String titre;
    private String description;
    private String typeFormation;
    private String duree;

    @OneToMany(mappedBy = "formation")
    private List<Appelcandidature> appelCandidature;


}


