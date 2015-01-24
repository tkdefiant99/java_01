package browse;
import browse.util.ListElem;


public class W3Server {
	LinkedList adrSeitenListe = new LinkedList();
	static final W3Seite fehlerseite = new W3Seite("Fehler", "404 Seite nicht gefunden");
	
	void ablegenSeite(W3Seite s, String sadr) {
		
	}
	
	W3Seite holenSeite(String sadr) {
		LinkedList.ListIterator lit = adrSeitenListe.listInterator();
		while(lit.hasNext()) {
			ListElem adp = lit.next();
			if(adp.getAdr().equals(sadr)) return adp.getSeite();
		}
		return fehlerseite;
	}
}
