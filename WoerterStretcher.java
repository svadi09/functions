import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.ArrayList;

class WoerterStretcher {
  ArrayList<String> verlaengernAllewoerter(ArrayList<String> zeilen, int[] spaltenbreiten){
    ArrayList<String> neuezeilen = new ArrayList<String>();
    Iterator<String> zeilenIterator = zeilen.iterator();  
    StringTokenizer st = null;
    String zeile = "";
    while ( zeilenIterator.hasNext() ) { 
      zeile = zeilenIterator.next();
      st = new StringTokenizer(zeile,";");
      String eineZeile = new String("");
      int eineZeileIndex = 0;
      int index = 0;
      while (st.hasMoreTokens()) { 
        String wort = st.nextToken();
        wort = String.format("%1$-" + spaltenbreiten[index]+"s", wort)+"|";  
        eineZeile += wort;
        ++eineZeileIndex;
        ++index;
      }
      neuezeilen.add(eineZeile);
    }
    //Test
    for (String s: neuezeilen ) {
      System.out.println(s);
    } // end of for
    return neuezeilen;
  }
  
}  