package tn.esprit.etudedecas.services;

import tn.esprit.etudedecas.entities.Foyer;

import java.util.List;

public interface IFoyer {
    public Foyer addFoyer(Foyer f);
    public Foyer updateFoyer(Foyer f);
    public List<Foyer> findAllFoyer();
    public Foyer findById(long idF);
    public void deleteFoyer(long idF);

}
