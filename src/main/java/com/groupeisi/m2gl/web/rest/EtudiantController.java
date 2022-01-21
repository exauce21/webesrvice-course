package com.groupeisi.m2gl.web.rest;

import com.groupeisi.m2gl.domain.Etudiant;
import com.groupeisi.m2gl.service.EtudiantService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EtudiantController {

    EtudiantService etServ = new EtudiantService();

    /* injection
    @Autowired
    EtudiantService etudiantService;
    */

    @GetMapping("/etudiants")
    public ResponseEntity<List<Etudiant>> getAllEtudiant() {
        List<Etudiant> result = etServ.findAll();
        return ResponseEntity.ok(result);
        //return ResponseEntity.notFound.uild() -- code erreur
    }
    /*
    @GetMapping("/add-etudiant")
    public ResponseEntity<Etudiant> addEtudiant(@RequestBody Etudiant etudiant){
        Etudiant result = EtudiantService.addEtudiant(etudiant);
        return ResponseEntity.ok(result);
    }*/

    /*
    @GetMapping("/update-etudiant/{id}")
    public ResponseEntity<Etudiant> addEtudiant(@RequestBody Etudiant etudiant, @PathVariable String idEtudiant){
        Etudiant result = EtudiantService.updateEtudiant(idEtudiant, etudiant);
        return ResponseEntity.ok(result);
    }*/
}
