import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GameFunction game = new GameFunction();
		char quit = ' ';
		
		while(quit != 'N') {
			game.play();
			
			System.out.println("Play again? (Y/N): ");
			quit = scan.next().toUpperCase().charAt(0);
		}
		
		game.displayStats();
		scan.close();
	}

}
