import java.util.Arrays;
import java.util.ArrayList;
import java.util.StringTokenizer;

class TestCSVTabelle{
  public static void main(String[] args){
    ArrayList<String> zeilen = allezeilen();
    
    //int maximaleLaengeWort = new MaximaleWortLaenge().bestimmenMaximaleLaengeEinesWortes(zeilen);
    int[] spaltenbreiten = new Spalten().bestimmenSpaltenbreiten(zeilen);
    //System.exit(0);
    ArrayList<String> neuezeilen = new WoerterStretcher().verlaengernAllewoerter(zeilen, spaltenbreiten);
    Tabelle tabelle = new Tabelle(neuezeilen);
    tabelle.print();
    
  }
  
  static ArrayList<String> allezeilen(){
    String[] zeilen =   new String[] {
      "Name;Strasse;Ort;Alter",
      "Peter Pan;Am Hang 5;12345 Einsam;42",
      "Marie Schommer;Kölner Straße 45;50123 Köln;43",
    "Paul Meier;Münchener Weg 1;87654 München;65345"};
    //           1234567890123456
    return new ArrayList<String>(Arrays.asList(zeilen));
  }
    
}