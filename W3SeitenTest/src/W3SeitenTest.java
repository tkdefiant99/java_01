
public class W3SeitenTest {

	public static void main(String[] args) {
		W3Seite meineSeite;
		meineSeite = new W3Seite("Abstraktion", "Anstraktion bedeutet...");
		
		(System.out).println(meineSeite.getInhalt());
		
		W3Seite meinAlias;
		meinAlias = meineSeite;
		meinAlias.inhalt = "Keine Ahnung";
		
		System.out.println(meineSeite.getInhalt());
	}
}
