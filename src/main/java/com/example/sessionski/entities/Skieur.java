package com.example.sessionski.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Skieur")
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSkieur")
    private Integer idSkieur;
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Skieur")
    private Set<Inscription> Inscription;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Piste> Piste;
    @OneToOne
    private Abonnement abonnement;

}
