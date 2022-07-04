package com.simplon.simplonsenegal.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Appelcandidature {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAppelCandidature;
    private String titre;
    private String description;
    private Date expirationDate;


    @ManyToOne(fetch = FetchType.EAGER)
    private Formation formation;

}
