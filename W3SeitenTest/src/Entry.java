
public class Entry<ET> {
	ET element;
	Entry<ET> next;
	Entry<ET> previous;
	
	Entry(ET element, Entry<ET> next, Entry<ET> previous) {
		this.element = element;
		this.next = next;
		this.previous = previous;
	}
}
