package browse;

public class W3Seite {
	private String seite;
	
	public W3Seite(String titel, String inhalt) {
		seite = "<TITLE>" + titel + "</TITLE>" + inhalt;
	}

	public String getTitel() {
		int trennIndex = seite.indexOf("</TITLE>");
		return new String(seite.toCharArray(), 7, trennIndex - 7);
	}

	public String getInhalt() {
		int trennIndex = seite.indexOf("</TITLE>");
		return new String(seite.toCharArray(), trennIndex + 8, seite.length() - (trennIndex +8));
	}	
}
