/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author DELL
 */
public class DeveloppeurExpert extends Developpeur{
    

   public DeveloppeurExpert(String nom, String prenom, int anciennete,String langage) {
        super(nom,prenom,anciennete,langage);
        this.poste="Developpeur Expert";
    }
   
   @Override
   public double getSalaire(){
       double salaireB = super.getSalaire();
       return salaireB*1.1;
       
       

    }
  }
   
