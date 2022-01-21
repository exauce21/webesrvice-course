package com.groupeisi.m2gl.service;

import com.groupeisi.m2gl.domain.Etudiant;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EtudiantService {

    List<Etudiant> listEtudiant = new ArrayList<Etudiant>();

    public List<Etudiant> findAll() {
        Etudiant et = new Etudiant("Diop", "Djibril", 782372927);
        listEtudiant.add(et);
        Etudiant et2 = new Etudiant("Seck", "Sama", 782372927);
        listEtudiant.add(et);
        return listEtudiant;
    }

    public static List<Etudiant> updateEtudiant(String idEtudiant, Etudiant etudiant) {
        return null;
    }
    //for(int i = 0; i < l.size(); i++) System.out.println();

}
