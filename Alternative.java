package mugColor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alternative {
	private enum MugColor {
		None, White, Black, Blue, Red, Yellow
	}

	private List<MugColor> mentioned = new ArrayList<MugColor>();

	public Alternative() {
	}

	public MugColor FindUnmentionedMug() {
		if (!mentioned.contains(MugColor.White))
			return MugColor.White;
		if (!mentioned.contains(MugColor.Black))
			return MugColor.Black;
		if (!mentioned.contains(MugColor.Blue))
			return MugColor.Blue;
		if (!mentioned.contains(MugColor.Red))
			return MugColor.Red;
		if (!mentioned.contains(MugColor.Yellow))
			return MugColor.Yellow;

		System.out.println("All mugs were mentioned!");
		return MugColor.None;
	}
	
	public static void main(String[] args) {
		Alternative problem = new Alternative();

		System.out.println("Number larger than 4");
		Scanner stdin = new Scanner(System.in);
		String line = stdin.nextLine();
		int numberOfMugs = Integer.parseInt(line);
		System.out.println(numberOfMugs);
		for (int i = 0; i < numberOfMugs; i++) {
			MugColor mugColor = MugColor.valueOf(line);
			problem.mentioned.add(mugColor);
			System.out.println(mugColor);
		}
		stdin.close();

		MugColor jaysMug = problem.FindUnmentionedMug();
		System.out.println(jaysMug);
		System.out.println("Number larger than 4");

		
	}
}
