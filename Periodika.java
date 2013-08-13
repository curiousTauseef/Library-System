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
public class Periodika extends Anagnwsma {
    final static String type = "magazine";
    ArrayList<String> editors;
    int tomos;
    int doi;
    int teuxos;

    public Periodika(String[] editors,int tomos,int doi,int teuxos,int id,String title,int ekdosh,int antitupa,int ry,String tp){
        super(id,title,ekdosh,antitupa,ry,tp);
        
        this.tomos=tomos;
        this.doi=doi;
        this.teuxos=teuxos;
    }
    
    protected int getTomos(){ return this.tomos; }
    protected int getDOI(){return this.doi;}
    protected int getTeuxos(){return this.teuxos;}
    ///////////////////////////////////////////////
    
   
}
