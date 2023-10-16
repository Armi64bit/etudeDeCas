package tn.esprit.etudedecas.services;

import tn.esprit.etudedecas.entities.Bloc;

import java.util.List;

public interface IBloc {
    public Bloc addBloc(Bloc b);
    public Bloc updateBloc(Bloc b);
    public List<Bloc> findAllBloc();
    public Bloc findById(long idB);
    public void deleteBloc(long idB);
    public Bloc updateBloc(long idb ,String nomBloc) ;
    }
