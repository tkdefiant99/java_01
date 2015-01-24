
public class Main {

	public static void main(String[] args) {
		W3Seite kap2	= new W3Seite (
				"Objekte, Klassen, Kapselung",
				"Dieses Kapitel erläuter , wie Objekte "
				+"beschruieben werden können. <BR> "
				+ " und so weiter und so weiter... <BR>"
				+ " und dann geht es weiter, erl\u00E4blabla <BR>"
				);
		
		W3Seite kap3	= new W3Seite (
				"Vererbung und Subtyping",
				"Dieses Kapite und baö nbla..."
				);
		W3Seite abs21	= new W3Seite (
				"Objekte und Klassen",
				"Dieser ABschnitt behandelt die Frage..."
				);
		W3Seite abs22	= new W3Seite (
				"Kaüselung und Strukturoerung von Klassen",
				"Der vorangegangene Abschnitt..."
				);
		
		W3Server testServer	= new W3Server();
		testServer.ablegenSeite ( kap2, "kap2" );
		testServer.ablegenSeite ( kap3, "kap3" );
		testServer.ablegenSeite ( abs21, "abs21" );
		testServer.ablegenSeite ( abs22, "abs22" );
		
		new Browser ( testServer );
	}
}
