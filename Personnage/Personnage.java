package Personnage;

public class Personnage {
    private int vie;
    private String nom;
    

    public Personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
    }

    public int LaVie(){

        return this.vie;
    }



    public String LeNom(){

        return this.nom;
    }
    

    public void AugmenterVie(int vie){

        this.vie += vie;
    }
    


 public void Attaque(Personnage asssailant, int dommage) {
        asssailant.vie =  asssailant.vie - dommage  / 2 ;  
        this.vie = this.vie - dommage;  

    }


   
}







