import java.util.Scanner;

public class Player extends GameItems {
	Scanner scan;
	
	public Player() {
		super();
		scan = new Scanner(System.in);
	}
	
	public CHOICES getChoice() {
		System.out.print("Select R=ROCK, P=PAPER, S=SCISSOR: ");
		char playerChoice = scan.next().toUpperCase().charAt(0);
		
		switch(playerChoice){
		case 'R':
			return CHOICES.ROCK;
		case 'P':
			return CHOICES.PAPER;
		case 'S':
			return CHOICES.SCISSOR;
		}
		System.out.println("Invalid selection. Please try again.");
		return getChoice();
	}
}
