import java.util.NoSuchElementException;


public class LinkedList<ET> {
	Entry<ET> header = new Entry<ET>(null, null, null);
	int size = 0;
	
	// Konstruktor für eine leere LinkedList
	LinkedList() {
		header.next = header;
		header.previous = header;
	}
	
	//Letztes Element der Liste ausgeben
	ET getLast() {
		if(size == 0) throw new NoSuchElementException();
		return header.previous.element;
	}
	
	//Letztes Element der Liste ausgeben und entfernen
	ET removeLast() {
		Entry<ET> lastentry = header.previous;
		if(lastentry == header) throw new NoSuchElementException();
		lastentry.previous.next = lastentry.next;
		lastentry.next.previous = lastentry.previous;
		size--;
		return lastentry.element;
	}
	
	//Neues Element ans Ende der Liste anhängen
	void addLast (ET e) {
		Entry<ET> newEntry = new Entry<ET>(e, header, header.previous);
		header.previous.next = newEntry;
		header.previous = newEntry;
		size++;
	}
	
	//Anzahl Elemente in der Liste ausgeben
	int size() {
		return size;
	}
}
