import Personnage.*;
import java.util.Scanner;


public class jeuPersonnage {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nom du premier personnage : ");
        String nomPerso1 = scanner.nextLine();

        System.out.println("Entrez le nom du deuxième personnage : ");
        String nomPerso2 = scanner.nextLine();



        Personnage perso1 = new Personnage(nomPerso1, 70);

        Personnage perso2 = new Personnage(nomPerso2, 100);



        
        System.out.println("Le nom du premier personnage = " + perso1.LeNom());
        System.out.println("Le nom du deuxieme personnage = " + perso2.LeNom());


        System.out.println("la vie de "  +  nomPerso1 +  " est à "  + perso1.LaVie());

        System.out.println("La vie du " + nomPerso2 +  "  est à "  + perso2.LaVie());


        // System.out.println("La vie de " + nomPerso1 + " augmente de  10 " + perso1.LaVie());
        perso1.AugmenterVie(10);

        System.out.println("Apres la vie de " + nomPerso1 + "  est passer à  " + perso1.LaVie());

        while (perso1.LaVie() > 0 && perso2.LaVie() > 0) {
        System.out.println("le jeu continue");

        // System.out.println("la vie de "  +  nomPerso1 +  " est à "  + perso1.LaVie());

        // System.out.println("La vie du " + nomPerso2 +  "  est à "  + perso2.LaVie());


      


        double random = Math.random();
        int degats  = (int) (Math.random()* 50 ) +1;
        if(random  == 30){
            System.out.println("le" + nomPerso1 + "attaque" + nomPerso2  );
            perso1.Attaque(perso2, degats);

        } else{
            System.out.println(" le "  + nomPerso2 + " attaque " +nomPerso1 );

           perso2.Attaque(perso1, degats);

        }

    }




    System.out.println("la vie de "  +  nomPerso1 +  " est à "  + perso1.LaVie());

    System.out.println("La vie du " + nomPerso2 +  "  est à "  + perso2.LaVie());

        // if (perso2 == 0) {


        //     // System.out.println(vie);

        // }

        // System.out.println("le magicien attaque le sorcier ...");
        // perso2.Attaque(perso1, 40);

        System.out.println("la vie de "  +  nomPerso1 +  " est à "  + perso1.LaVie());

        System.out.println("La vie du " + nomPerso2 +  "  est à "  + perso2.LaVie());


        if (perso1.LaVie() <= 0) {
            System.out.println("Le " + nomPerso2 + "gagne");
        } else {
            System.out.println(" Le " + nomPerso1 + " gagne " );
        }

}
}

