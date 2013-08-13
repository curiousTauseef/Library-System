/*
 * This is a university project written in Java. It would be used to
 * manage the university library. 
 * Works with books and Magazines.
 * Included methods: add,insert,search(byBOI or byTitle),delete,list.
 *
 * This project is published under the GPLv3 license.
 * For any circumstances faced,contact me at kostas [at] dtps [dot] unipi [dot] gr.
*/
public class Anagnwsma {
    int id;
    String title;
    int ekdosh;
    int antitupa;
    int ry;//Release Year
    String tp;//Thematiki Perioxh
    
    public Anagnwsma(int id,String title,int ekdosh,int antitupa,int ry,String tp){
        this.id=id;
        this.title=title;
        this.ekdosh=ekdosh;
        this.antitupa=antitupa;
        this.ry=ry;
        this.tp=tp;
    }
    
    protected int getID(){ return this.id;}
    protected String getTitle(){return this.title;}
    protected int getEkdosh(){return this.ekdosh;}
    protected int getAntitupa(){return this.antitupa;}
    protected int getReleaseYear(){return this.ry;}
    protected String getThematikiPerioxh(){ return this.tp; }
}
