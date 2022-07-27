package com.simplon.simplonsenegal.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;
    private String login;

    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;

    @OneToOne(fetch = FetchType.EAGER)
    private Candidat candidat;

}
