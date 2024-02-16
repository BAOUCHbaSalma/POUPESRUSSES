import java.util.ArrayList;
import java.util.Scanner;

class Menu {
    public void listChoix(){
        int sizeDoll = 0;


        System.out.println("Entrer the size of the first Doll");
        sizeDoll = new Scanner(System.in).nextInt();
        PoupeeRusse doll1 = new PoupeeRusse(sizeDoll);





        System.out.println("Entrer the size of the second Doll");
        int sizeDoll2 = new Scanner(System.in).nextInt();
        PoupeeRusse doll2 = new PoupeeRusse(sizeDoll2);


        System.out.println("Entrer the size of the 3 Doll");
        int sizeDoll3 = new Scanner(System.in).nextInt();
        PoupeeRusse doll3 = new PoupeeRusse(sizeDoll3);



//    System.out.println(doll1.getTaille());
//    System.out.println(doll2.getTaille());
//    System.out.println(doll3.getTaille());





        int Choix;
        do{

            System.out.println("1--Ouvrir une Poupee");
            System.out.println("2--Fermer une Poupee");
            System.out.println("3--Placer une Poupee dans une autre");
            System.out.println("4--Sortir une Poupee ");
            System.out.println("5--Quitter ");
            System.out.println("Entrez votre Choix : ");
            Choix=new Scanner(System.in).nextInt();
            switch (Choix) {
                case 1:

                    break;
                case 2:
                    
                    break;

                case 3:

                    break;

                case 4:

                    break;
                case 5:
                    System.out.println("Fin!!!");
                    break;
                default:
                    System.out.println("Choix invalide");
            }


        }while (Choix!=5);


    }







}
















