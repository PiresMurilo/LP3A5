package jogoLP3;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player p1 = new Player();
		Player p2 = new Player();
		
		p1.setHand("Paper");
		p1.setName("George");
		
		p2.setHand("Scissor");
		p2.setName("Steve");

		Judge.compareHands(p1, p2);
	}

}
