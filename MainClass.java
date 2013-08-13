/*
 * This is a university project written in Java. It would be used to
 * manage the university library. 
 * Works with books and Magazines.
 * Included methods: add,insert,search(byBOI or byTitle),delete,list.
 *
 * This project is published under the GPLv3 license.
 * For any circumstances faced,contact me at kostas [at] dtps [dot] unipi [dot] gr.
*/

package ergasia_java_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kostas
 */
public class MainClass {
    public static void main(String[] args) {
        int inp, i;
        String title,tp,writer;
        int id,doi,ekdosh,antitupa,ry,tomos,teuxos;
        Vivliothiki v = new Vivliothiki();
        ArrayList<String> editors;
        Vivlia b;
        Periodika p;

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        do {
            System.out.println("Welcome to Java library!");
            System.out.println("------------------------- :");
            System.out.println("1)Eisagwgh Vivliou");
            System.out.println("2)Eisagwgh Periodikou");
            System.out.println("3)Anazhthsh vivliou");
            System.out.println("4)Anazhthsh periodikou");
            System.out.println("5)Emfanisi vivliwn");
            System.out.println("6)Emfanisi periodikwn");
            System.out.println("7)Diagrafh vivliou");
            System.out.println("8)Diagrafh periodikou");

            inp = input.nextInt();

            switch (inp) {
                case 1:
                    System.out.println("Eisagwgh Onomatos Vivliou:");
                    title = input2.next();
                    System.out.println("Eisagwgh ID vivliou:");
                    id = Integer.parseInt(input2.next());
                    System.out.println("Eisagwgh ekdoshs:");
                    ekdosh = Integer.parseInt(input2.next());
                    System.out.println("Eisagwgh antitupwn:");
                    antitupa = Integer.parseInt(input2.next());
                    System.out.println("Eisagwgh Xronologias Ekdoshs:");
                    ry = Integer.parseInt(input2.next());
                    System.out.println("Eisagwgh thematikis perioxhs");
                    tp = input2.next();
                    System.out.println("Eisagwgh suggrafea:");
                    writer = input2.next();
                    System.out.println("|"+title+"|"+writer+"|"+id+"|"+ekdosh+"|"+antitupa+"|"+ry+"|"+tp+"|");
                    b= new Vivlia(writer,id,title,ekdosh,antitupa,ry,tp);
                    v.addB(b);
                    break;
                case 2:
                    System.out.println("PLhktrologeiste ton titlo:");
                    title=input2.next();
                    v.searchByTitle(title);
                    break;
                case 3:
                    System.out.println("PLhktrologeiste ton titlo:");
                    title = input2.next();                    
                    break;
                case 4:
                    System.out.println("Plhktrologeiste to DOI:");
                    doi = input2.nextInt();
                    
                    break;
                case 5:
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Plhktrologhste ton titlo tou vivliou pou tha diagrafei:");
                    title = input2.next();
                    
                    
                    
                    
            }

        } while (inp != 0);

    }
}
