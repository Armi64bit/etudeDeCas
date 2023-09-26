package tn.esprit.etudedecas.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity

public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long    idEtudiant;
    private String nomEt;
    private String prenomEt;

    private long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
}