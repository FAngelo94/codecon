package mugColor;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public List<Mug> mentioned = new ArrayList<Mug>();
	public static List<Mug> mugs = new ArrayList<Mug>();
	public static Random random = new Random();
	
	public static int find(int x) {
		int mug = 0;
		
		
		return mug;
	}

	
	public static void main(String[] args) {
		Mug white = new Mug("white");
		Mug black = new Mug("black");
		Mug blue = new Mug("blue");
		Mug yellow = new Mug("yellow");
		Mug red = new Mug("red");
		
		mugs.add(white);
		mugs.add(blue);
		mugs.add(black);
		mugs.add(yellow);
		mugs.add(red);
		
		System.out.println("Number larger than 4");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int numberOfMugs = Integer.parseInt(input);	
		
		int randomNum = 1 + random.nextInt((mugs.size() - 1) + 1);
		Mug jaysMug = mugs.get(randomNum);
		System.out.println("Jays Mug : " + jaysMug.color);

		mugs.remove(randomNum);
		
		for(int i = 0; i < mugs.size(); i++) {
			System.out.println(mugs.get(i).color);
		}
		
				
		sc.close();
	}
	
}