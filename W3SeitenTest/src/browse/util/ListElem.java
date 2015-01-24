package browse.util;
import browse.W3Seite;


public class ListElem {
	private String adr;
	private W3Seite seite;
	
	ListElem(String a, W3Seite s) {
		adr = a;
		seite = s;
	}
	
	String getAdr() {
		return adr;
	}
	
	W3Seite getSeite() {
		return seite;
	}
	
	void setSeite(W3Seite s) {
		seite = s;
	}
}
