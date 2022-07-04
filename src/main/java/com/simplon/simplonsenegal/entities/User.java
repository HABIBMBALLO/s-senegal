package com.simplon.simplonsenegal.entities;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int user_id;

    @Column(name = "login")
    private String login;

    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;

    @OneToOne(fetch = FetchType.EAGER)
    private Candidat candidat;

}
