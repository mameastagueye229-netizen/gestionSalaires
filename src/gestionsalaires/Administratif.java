/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author DELL
 */
    public class Administratif extends Employe {

    public Administratif(String nom, String prenom, int anciennete) {
        super(nom, prenom, anciennete, "administratif");
    }
 public double getSalaire(){
        return (1900+anciennete*100);
    }
 }
    
   

