package tn.esprit.etudedecas.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Reservation implements Serializable {
    @Id

    private String    idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean esValide;

}
