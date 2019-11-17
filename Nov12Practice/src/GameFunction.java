
public class GameFunction extends GameItems{
	private Computer computer;
	private Player player;
	private CHOICES computerChoice;
	private CHOICES playerChoice;
	private RESULT result;
	private static int wins;
	private static int loses;
	private static int ties;
	
	public GameFunction() {
		super();
		computer = new Computer();
		player = new Player();
	}
	
	public void play() {
		computerChoice = computer.getChoice();
		playerChoice = player.getChoice();
		result = getResult();
		displayResult();
		stats();
	}
	
	// method for getting the result (win, lose, tie)
	private RESULT getResult() {
		if(computerChoice == playerChoice) {
			return RESULT.TIE;
		}
		
		switch(playerChoice) {
		case ROCK:
			return(computerChoice == CHOICES.SCISSOR ? RESULT.WIN : RESULT.LOSE);
		case PAPER:
			return(computerChoice == CHOICES.ROCK ? RESULT.WIN : RESULT.LOSE);
		case SCISSOR:
			return(computerChoice == CHOICES.PAPER ? RESULT.WIN : RESULT.LOSE);
		}
		
		// it will never reach this point. kailangan lang para may i return hehehe
		return RESULT.WIN;
	}
	
	private void displayResult() {
		switch(result) {
		case WIN: 
			System.out.println("You win! You chose " + playerChoice + " while the computer generated " + computerChoice + ".");
			break;
		case LOSE:
			System.out.println("You lose! You chose " + playerChoice + " while the computer generated " + computerChoice + ".");
			break;
		case TIE:
			System.out.println("It's a tie! You chose " + playerChoice + " while the computer generated " + computerChoice + ".");
			break;
		}
	}
	
	private void stats() {
		if(result == RESULT.WIN)
			wins++;
		else if(result == RESULT.LOSE)
			loses++;
		else 
			ties++;
	}
	
	public void displayStats() {
		System.out.println("You have played " + (wins + loses + ties) + " times.");
		System.out.println("You won " + wins + " times, lose " + loses + " times and tied " + ties + " times.");
		System.out.println("Good bye!");
	}
}
