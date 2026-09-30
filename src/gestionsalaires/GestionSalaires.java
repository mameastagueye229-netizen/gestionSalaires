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
        // Tests applicatifs
        Developpeur d = new Developpeur("Durand", "Michel", 4,"java");
        Manager m = new Manager("Dupont", "Lucie", 2);
        Administratif a= new Administratif("Martin", "Claire", 3);
        Developpeur devJava = new Developpeur("Emma", "Baron", 2, "java");
        Developpeur devPython = new Developpeur("Mame asta", "Gueye", 1, "python");
        
        System.out.println(d.getDescription());
        System.out.println(m.getDescription());
        System.out.println(a.getDescription());
        System.out.println (devJava.getDescription());
        System.out.println(devPython.getDescription());

    }
    
}
