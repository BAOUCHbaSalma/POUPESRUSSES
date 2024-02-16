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
                    System.out.println("Entrez le numero de la poupee que voullez vous ouvrir (Poupee 1 , 2 ou 3)");
                    int choix = new Scanner(System.in).nextInt();
                    switch(choix){
                        case 1 :
                            doll1.ouvrir();

                            break;
                        case 2:

                            doll2.ouvrir();
                            break;
                        case 3:
                            doll3.ouvrir();
                            break;
                        default:
                            System.out.println("Choix invalide !!");

                    }



                    break;
                case 2:
                    System.out.println("Entrez le numero de la poupee que voullez vous fermer (Poupee 1 , 2 ou 3)");
                    int Resultat = new Scanner(System.in).nextInt();
                    switch(Resultat){
                        case 1 :
                            doll1.fermer();

                            break;
                        case 2:

                            doll2.fermer();
                            break;
                        case 3:
                            doll3.fermer();
                            break;
                        default:
                            System.out.println("Choix invalide !!");

                    }



                case 3:
                    System.out.println("1--> 1 dans 2");
                    System.out.println("2--> 1 dans 3");
                    System.out.println("3--> 2 dans 1");
                    System.out.println("4--> 2 dans 3");
                    System.out.println("5--> 3 dans 1");
                    System.out.println("6--> 3 dans 2");
                    System.out.println("Entrer votre choix: ");
                    int ch=new Scanner(System.in).nextInt();
                    switch (ch){
                        case 1:
                            doll1.placerDans(doll2);
                            break;
                        case 2:
                            doll1.placerDans(doll3);
                            break;
                        case 3:
                            doll2.placerDans(doll1);
                            break;
                        case 4:
                            doll2.placerDans(doll3);
                            break;
                        case 5:
                            doll3.placerDans(doll1);
                            break;
                        case 6:
                            doll3.placerDans(doll2);
                            break;
                        default:
                            System.out.println("Choix invalide");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("1--> 1 de 2");
                    System.out.println("2--> 1 de 3");
                    System.out.println("3--> 2 de 1");
                    System.out.println("4--> 2 de 3");
                    System.out.println("5--> 3 de 1");
                    System.out.println("6--> 3 de 2");
                    int Res=new Scanner(System.in).nextInt();
                    switch (Res){
                        case 1:
                            doll1.sortirDe(doll2);
                            break;
                        case 2:
                            doll1.sortirDe(doll3);
                            break;
                        case 3:
                            doll2.sortirDe(doll1);
                            break;
                        case 4:
                            doll2.sortirDe(doll3);
                            break;
                        case 5:
                            doll3.sortirDe(doll1);
                            break;
                        case 6:
                            doll3.sortirDe(doll2);
                            break;
                    }
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
















