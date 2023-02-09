package com.example.sessionski.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Cours")
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCours")
    private Integer idCours;
    private Long numCours;
    private Integer niveau;
    private Float prix;
    private Integer creneau;

    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    private Support support;

}
