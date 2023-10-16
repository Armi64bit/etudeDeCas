package tn.esprit.etudedecas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.entities.Reservation;
import tn.esprit.etudedecas.services.ReservationServiceImp;

import java.util.List;

@RestController
@RequestMapping("/reservation")

public class ReservationController {
    @Autowired
    private ReservationServiceImp reservationServiceImp;
    @PostMapping("/add")
    public Reservation addFoyer(@RequestBody Reservation f) {
        return  reservationServiceImp.addReservation(f);
    }
    @PutMapping("/update")
    public Reservation updateFoyer(@RequestBody Reservation f) {
        return  reservationServiceImp.updateReservation(f);
    }
    @GetMapping("/getall")
    public List<Reservation> findAllFoyer() {
        return  reservationServiceImp.findAllReservation();
    }
    @GetMapping("/get/{idF}")

    public Reservation findById(@PathVariable String idF) {
        return  reservationServiceImp.findById(idF);
    }
    @DeleteMapping("/getall/{idF}")

    public void deleteFoyer(@PathVariable String idF) {
        reservationServiceImp.deleteReservation(idF);
    }
}
