/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class GestionSalaires {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Developpeur d = new Developpeur("Durand", "Michel", 4,"java");
        Manager m = new Manager("Dupont", "Lucie", 2);
        Administratif a= new Administratif("Martin", "Claire", 3);
        Developpeur devJava = new Developpeur("Emma", "Baron", 2, "java");
        Developpeur devPython = new Developpeur("Fatima", "Gueye", 1, "python");
        DeveloppeurExpert devex = new DeveloppeurExpert("Mame asta", "Gueye", 1, "python");
        
        Service serviceInfo = new Service("Service Informatique");
        serviceInfo.ajouterEmploye(d);
        serviceInfo.ajouterEmploye(m);
        serviceInfo.ajouterEmploye(a);
        serviceInfo.ajouterEmploye(devJava);
        serviceInfo.ajouterEmploye(devPython);
        serviceInfo.ajouterEmploye(devex);


        
        serviceInfo.afficherEmployes();
        
        
        System.out.println("Salaire total du service : " + serviceInfo.calculerSalaireTotal());


    }
    
}
