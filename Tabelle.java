import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Tabelle {
  ArrayList<String> zeilen; 
  Tabelle(ArrayList<String> zeilen){
    this.zeilen = zeilen;
  }
  
  void print(){
    Iterator<String> zeilenIterator = zeilen.iterator();  
    if (zeilenIterator.hasNext()) {
      String einezeile = zeilenIterator.next();
      System.out.println(einezeile);
      int n = einezeile.length();
      StringTokenizer st = new StringTokenizer(einezeile,"|");
      String zweiteZeile = "";
      while (st.hasMoreTokens()) { 
        String wort = st.nextToken();
        String striche = new String(new char[wort.length()]).replace("\0", "-")+"+";
        //System.out.println(striche);
        zweiteZeile = zweiteZeile + striche;
      }
      //String zweitezeile = new String(new char[n]).replace("\0", "-");     
      System.out.println(zweiteZeile);
    }
    while (zeilenIterator.hasNext()) {
      System.out.println(zeilenIterator.next());
    }
  }
}















