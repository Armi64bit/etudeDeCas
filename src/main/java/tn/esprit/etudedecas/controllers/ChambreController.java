package tn.esprit.etudedecas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.entities.Chambre;
import tn.esprit.etudedecas.services.ChambreServiceImp;

import java.util.List;

@RestController
@RequestMapping("/chambre")

public class ChambreController  {
    @Autowired
    private ChambreServiceImp chambreServiceImp;
    @PostMapping("/add")
    public Chambre addFoyer(@RequestBody Chambre f) {
        return  chambreServiceImp.addChambre(f);
    }
    @PutMapping("/update")
    public Chambre updateFoyer(@RequestBody Chambre f) {
        return  chambreServiceImp.updateChambre(f);
    }
    @GetMapping("/getall")
    public List<Chambre> findAllFoyer() {
        return  chambreServiceImp.findAllEtudiant();
    }
    @GetMapping("/get/{idF}")

    public Chambre findById(@PathVariable long idF) {
        return  chambreServiceImp.findById(idF);
    }
    @DeleteMapping("/delete/{idF}")

    public void deleteFoyer(@PathVariable long idF) {
        chambreServiceImp.deleteChambre(idF);
    }
}
