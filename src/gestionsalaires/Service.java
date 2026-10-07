/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DELL
 */
public class Service {
    private String nom;
    private List<Employe> listeEmployes;    
public Service(String nom) {
        this.nom = nom;
        this.listeEmployes = new ArrayList<>();
    }
    public void ajouterEmploye(Employe e) {
        listeEmployes.add(e);
    }
    
public void afficherEmployes() {
        System.out.println("--- " + nom + " ---");
        for (Employe e : listeEmployes) {
            System.out.println(e.getDescription());
        }
    }
public int calculerSalaireTotal() {
        int total = 0;
        for (Employe e : listeEmployes) {
            total += e.getSalaire();
        }
        return total;
    }
}

