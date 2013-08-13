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

public class Vivlia extends Anagnwsma {
    final static String type = "book";
    String writer;
    
    public Vivlia(String writer,int id,String title,int ekdosh,int antitupa,int ry,String tp)
    {
        super(id,title,ekdosh,antitupa,ry,tp);
        this.writer=writer;
    }
    
    protected String getWriter(){return this.writer;}
    protected String getType(){return this.type;}
    protected String getTitle() {return this.title; }
    
    
    
}
