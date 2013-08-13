/*
 * This is a university project written in Java. It would be used to
 * manage the university library. 
 * Works with books and Magazines.
 * Included methods: add,insert,search(byBOI or byTitle),delete,list.
 *
 * This project is published under the GPLv3 license.
 * For any circumstances faced,contact me at kostas [at] dtps [dot] unipi [dot] gr.
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Vivliothiki {
    private ArrayList<Vivlia> blist;
    private ArrayList<Periodika> plist;
    private Periodika p;
    private Vivlia b;
    
    public Vivliothiki(){
        this.blist = new ArrayList<Vivlia>();
        this.plist = new ArrayList<Periodika>();
    }
    protected void delete() {
    }

    protected void searchByTitle(String title) {
        Iterator<Vivlia> it = blist.iterator();
        while(it.hasNext()){
            b = it.next();
            System.out.println("");
            if(b.getTitle().equalsIgnoreCase(title)){
                  System.out.println("Title:"+b.getTitle());
                  System.out.println("Writer:"+b.getWriter());
                  System.out.println("Version:"+b.getEkdosh());
                  System.out.println("Copies:"+b.getAntitupa());
                  System.out.println("ID:"+b.getID());
                  System.out.println("Year:"+b.getReleaseYear());
                  System.out.println("Thema:"+b.getThematikiPerioxh());
            }
        }
    }
    
    protected void searchByDOI(int doi) {
        Iterator<Periodika> it = plist.iterator();
        while(it.hasNext()){
            p = it.next();
            System.out.println("");
            if (p.getDOI().equalsIgnoreCase(doi)){
                  System.out.println("Title:"+p.getTitle());
                  System.out.println("Tomos:"+p.getTomos());
                  System.out.println("Teuxos:"+p.getTeuxos());
                  System.out.println("Version:"+p.getEkdosh());
                  System.out.println("Copies:"+p.getAntitupa());
                  System.out.println("ID:"+p.getID());
                  System.out.println("Year:"+p.getReleaseYear());
                  System.out.println("Thematiki Perioxh:"+p.getThematikiPerioxh());
            }
        }
    }

    protected void addB(Vivlia b) {
        blist.add(b);
    }
    
    protected void addP(Periodika p) {
        plist.add(p);
    }

    protected String printData() {
        String s="";
        return s;
    }

    
}
