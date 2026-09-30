/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class Developpeur extends Employe {
    private String langage;
    
    public Developpeur(String nom, String prenom, int anciennete,String langage) {
        super(nom,prenom,anciennete,"developpeur");
        this.langage=langage;
    }
     
    @Override
    public int getSalaire(){
       int salaireB=2200+anciennete*110;
       if(langage.equals("java")){
           return salaireB + 50;
       }
       if(langage.equals("python")){
           return salaireB + 70;
       }
       if(langage.equals("php")){
          
       }
       
return salaireB;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " en " + langage;
    }
}

  

