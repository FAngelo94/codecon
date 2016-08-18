package laundry;

import java.util.ArrayList;

import java.util.List;


public class Laundry {
	public String name;
	public int count;
	private Type type;
	public int pair;
	public static List<Laundry> laundryList = new ArrayList<Laundry>();
	public enum Type {
		SOCK, SHIRT, JEANS
	}
	
	public Laundry(String name, int count, Type type) {
		this.name = name;
		this.count = count;
		this.type = type;
	}
	
	public Laundry(String name, int count, Type type, int pair) {
		this.name = name;
		this.count = count;
		this.type = type;
		this.pair = pair;
	}



	
	public static void addLaundry(Laundry l) {
		laundryList.add(l);
		l.count++;
		if(l.type == Type.SOCK && l.name == "Polka dot") {
			if(l.count == 0) {
				l.pair = 0;
			}
			else if(l.count%2==1 && l.count > 1) {
				l.pair = (l.count/2);
			} else if (l.count%2 == 0 && l.count > 1) {
				l.pair = (l.count/2);
			}
		}
		if(l.type == Type.SOCK) {
			System.out.println(l.pair + "|" + l.name +" "+ l.type);
		} else {
			System.out.println(l.count + "|" + l.name +" "+ l.type);
		}
	}

	
	public static void main(String[] args) {
		Laundry whiteShirt = new Laundry("white", 0, Type.SHIRT);
		Laundry polkaSock = new Laundry("Polka dot",0 , Type.SOCK, 0);
		Laundry redSock = new Laundry("Red", 0, Type.SOCK, 0);
		Laundry tornJeans = new Laundry("Torn", 0, Type.JEANS);
		Laundry superheroShirt = new Laundry("Super hero", 0, Type.SHIRT);

		//input
		addLaundry(whiteShirt);
		addLaundry(polkaSock);
		addLaundry(redSock);
		addLaundry(superheroShirt);
		addLaundry(tornJeans);
		addLaundry(polkaSock);
		addLaundry(whiteShirt);		
		addLaundry(polkaSock);
		addLaundry(polkaSock);

		
	}
	
	
}
