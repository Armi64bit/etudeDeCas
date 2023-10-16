package tn.esprit.etudedecas.services;

import tn.esprit.etudedecas.entities.Etudiant;

import java.util.List;

public interface IEtudiant {
    public Etudiant addEtudiant(Etudiant e);
    public Etudiant updateEtudiant(Etudiant e);
    public List<Etudiant> findAllEtudiant();
    public Etudiant findById(long idE);
    public void deleteEtudiant(long idE);
}
