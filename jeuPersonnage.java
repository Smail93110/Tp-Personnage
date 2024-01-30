import Personnage.*;

public class jeuPersonnage {
    public static void main(String args[]) {
        Personnage UnSorcier = new Personnage("Sorcier", 70);

        Personnage UnMagicien = new Personnage("Magicien", 100);

        while (UnSorcier.LaVie() >0 && UnMagicien.LaVie() > 0) {
        System.out.println("le jeu continue");

        System.out.println("La vie du sorcier est " + UnSorcier.LaVie());

        System.out.println("La vie du magicien est " + UnMagicien.LaVie());

        // System.out.println("Le nom du sorcier = " + UnSorcier.LeNom());
        // System.out.println("Le nom du magicien = " + UnMagicien.LeNom());

        // System.out.println("La vie du sorcier est " + UnSorcier.LaVie());
        // UnSorcier.AugmenterVie(10);

        // System.out.println("Apres la vie du sorcier est " + UnSorcier.LaVie());


        double random = Math.random();
        if(random == 0){
            System.out.println("le magicien attaque le sorcier ...");
            UnMagicien.Attaque(UnSorcier, 40);

        } else{
            System.out.println("le sorcier attaque le magicien ...");
           UnSorcier.Attaque(UnMagicien, 40);

        }


        // if (UnMagicien == 0) {


        //     // System.out.println(vie);

        // }

        // System.out.println("le magicien attaque le sorcier ...");
        // UnMagicien.Attaque(UnSorcier, 40);
        System.out.println("Atak La vie du magicien est " + UnMagicien.LaVie());
        System.out.println("Atak La vie du sorcier est " + UnSorcier.LaVie());

    }
}
}
