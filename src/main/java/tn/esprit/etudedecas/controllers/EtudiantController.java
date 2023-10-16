package tn.esprit.etudedecas.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.entities.Etudiant;
import tn.esprit.etudedecas.services.EtudiantServiceImp;

import java.util.List;
@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor
public class EtudiantController {

    //@Autowired
    private EtudiantServiceImp etudiantServiceImp;
    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant f) {
        return  etudiantServiceImp.addEtudiant(f);
    }
    @PutMapping("/update")
    public Etudiant updateEtudiant(@RequestBody Etudiant f) {
        return  etudiantServiceImp.updateEtudiant(f);
    }
    @GetMapping("/getall")
    public List<Etudiant> findAllEtudiant() {
        return  etudiantServiceImp.findAllEtudiant();
    }
    @GetMapping("/get/{idF}")

    public Etudiant findByIdE(@PathVariable long idE) {
        return  etudiantServiceImp.findById(idE);
    }
    @DeleteMapping("/getall/{idF}")

    public void deleteEtudiant(@PathVariable long idE) {
        etudiantServiceImp.deleteEtudiant(idE);
    }

}
