package jogoLP3;

public class Judge {
		public static void compareHands(Player p1, Player p2){
			String p1Hand=p1.getHand();
			String p2Hand=p2.getHand();
			
			if(p1Hand.equals(p2Hand))
				System.out.println("It's a tie!");
			else if(p1Hand.equals("Stone") && p2Hand.equals("Scissor"))
				System.out.println(p1.getName() +" wins! Congratulations!");
			else if(p1Hand.equals("Scissor") && p2Hand.equals("Paper"))
				System.out.println(p1.getName() +" wins! Congratulations!");
			else if(p1Hand.equals("Paper") && p2Hand.equals("Stone"))
				System.out.println(p1.getName() +" wins! Congratulations!");
			
			else if(p2Hand.equals("Stone") && p1Hand.equals("Scissor"))
				System.out.println(p2.getName() +" wins! Congratulations!");
			else if(p2Hand.equals("Scissor") && p1Hand.equals("Paper"))
				System.out.println(p2.getName() +" wins! Congratulations!");
			else if(p2Hand.equals("Paper") && p1Hand.equals("Stone"))
				System.out.println(p2.getName() +" wins! Congratulations!");
		}
}
