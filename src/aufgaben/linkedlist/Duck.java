package aufgaben.linkedlist;

class Meeple {

	String name;
	Meeple next;

	Meeple(String name) {
		this.name = name;
	}
}

public class Duck {
    
	static Meeple setup(String[] name) {
		Meeple head = new Meeple(name[0]);
		Meeple p = head;
		
		int i = 1;
		System.out.println("Head: "+head.name);
		while (i < name.length) {
			p.next = new Meeple(name[i]);
			System.out.println("Next Meeple: "+p.next.name); //Debug
			p = p.next;
			i++;
		}
		p.next = head;

		return head;
	}
	
	static void countThrough(Meeple head, int length) {
		Meeple p = head;
		
		do {
			for (int i = 1; i < length; i++) {
				p = p.next;
				System.out.println("Schleife: "+p.name); //Debug
			}
			
			System.out.println(p.next.name);
			p.next = p.next.next; //-1 Meeple
		} while (p.next != p); //Max 1 Meeple
		
		System.out.println(p.name + " wins!");
	}
	
	public static void main(String[] arg) {
		int len = 7;
		String[] names = {"Anna","Berta","Emil","Max","Otto"};
		Meeple ref = setup(names);
		
		countThrough(ref, len);
	}
}