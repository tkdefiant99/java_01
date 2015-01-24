package browse;
import java.util.NoSuchElementException;

import browse.util.ListElem;

public class LinkedList {
	private Entry header = new Entry(null, null, null);
	int size = 0;
	
	// Konstruktor für eine leere LinkedList
	LinkedList() {
		header.next = header;
		header.previous = header;
	}
	
	//Letztes Element der Liste ausgeben
	ListElem getLast() {
		if(size == 0) throw new NoSuchElementException();
		return header.previous.element;
	}
	
	//Letztes Element der Liste ausgeben und entfernen
	ListElem removeLast() {
		Entry lastentry = header.previous;
		if(lastentry == header) throw new NoSuchElementException();
		lastentry.previous.next = lastentry.next;
		lastentry.next.previous = lastentry.previous;
		size--;
		return lastentry.element;
	}
	
	//Neues Element ans Ende der Liste anhängen
	void addLast (ListElem e) {
		Entry newEntry = new Entry(e, header, header.previous);
		header.previous.next = newEntry;
		header.previous = newEntry;
		size++;
	}
	
	//Anzahl Elemente in der Liste ausgeben
	int size() {
		return size;
	}
	
	private static class Entry {
		private ListElem element;
		private Entry next;
		private Entry previous;
		
		Entry(ListElem element, Entry next, Entry previous) {
			this.element = element;
			this.next = next;
			this.previous = previous;
		}
	}
	
	class ListIterator {
		private int nextIndex = 0;
		private Entry next = header.next;
		
		boolean hasNext() {
			return nextIndex != size;
		}
		
		ListElem next() {
			if(nextIndex == size) throw new NoSuchElementException();
			ListElem elem = next.element;
			next = next.next;
			nextIndex++;
			return elem;
		}
	}
	
	ListIterator listInterator() {
		return new ListIterator();
	}
}
