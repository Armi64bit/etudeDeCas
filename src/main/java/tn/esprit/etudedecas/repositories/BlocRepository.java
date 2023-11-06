package tn.esprit.etudedecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.TypeChambre;

import java.util.Set;

public interface BlocRepository extends JpaRepository<Bloc,Long> {

    public Set<Bloc> findBlocByChambresTypeC(TypeChambre typeC);
}
