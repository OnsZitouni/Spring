package com.example.sessionski.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Inscription")
public class Inscription implements Serializable {
    @ManyToOne
    Skieur Skieur;
    private Long numInscription;
    private Integer numSemaine;
    @ManyToOne
    Cours cours;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInscription")
    private Integer idInscription;
}
