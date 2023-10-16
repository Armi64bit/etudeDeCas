package tn.esprit.etudedecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudedecas.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
