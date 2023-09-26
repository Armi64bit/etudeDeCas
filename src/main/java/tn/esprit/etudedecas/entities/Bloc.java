package tn.esprit.etudedecas.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Bloc implements Serializable  {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long    idBloc;
        private String nomBloc;
        private long capaciteBloc;


}
