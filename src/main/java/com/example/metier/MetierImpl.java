package com.example.metier;

import com.example.dao.IDao;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
    private final IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double valeur = dao.getValue();
        // Logique métier simple : double la valeur
        return valeur * 2.0;
    }
}