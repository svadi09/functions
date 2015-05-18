import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Spalten {
  int[] bestimmenSpaltenbreiten(ArrayList<String> zeilen){
    int[] spaltenbreiten = new int [zeilen.size()];
    Iterator<String> zeilenIterator = zeilen.iterator();  
    Iterator<String> zweiterzeilenIterator = zeilen.iterator(); 
    
    if ( zeilenIterator.hasNext() ) { 
      int maxspaltenbreite = 0;
      String zeile = zeilenIterator.next();
      System.out.println(zeile);
      StringTokenizer st = new StringTokenizer(zeile,";");
      int index = 0;
      while (st.hasMoreTokens() ) { 
        String wort = st.nextToken();
        spaltenbreiten[index] = wort.length();
        ++index;
      }  
      
      while (zeilenIterator.hasNext()) {
        String naechstezeile = zeilenIterator.next();
        System.out.println(naechstezeile);
        StringTokenizer st2 = new StringTokenizer(naechstezeile,";"); 
        index = 0;
        while (st2.hasMoreTokens() ) { 
          String wort = st2.nextToken();
          System.out.println(wort);
          if ( wort.length() > spaltenbreiten[index] ) {
            spaltenbreiten[index] = wort.length();
          } 
          ++index;
        }
        
      }  
      // Test:
      
      System.out.println("Test");
      for ( int spbr : spaltenbreiten ) {
        System.out.println(spbr);
      } // end of for
      
    } 
    return spaltenbreiten;  
    
    
  }
}  