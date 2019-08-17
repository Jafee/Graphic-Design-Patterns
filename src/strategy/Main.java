package strategy;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main seed1 seed2");
            System.out.println("Example: java Main 314 25");
            System.exit(0);
        }

        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);


        Player player1 = new Player("A", new WinningStrategy(seed1));
        Player player2 = new Player("b", new ProbStragety(seed2));

        Hand hand1;
        Hand hand2;

        for (int i = 0; i < 10000; i++) {
            hand1 = player1.nextHand();
            hand2 = player2.nextHand();

            if (hand1.isStrongerThan(hand2)) {
                System.out.println("Winner: Player1");
                player1.win();
                player2.lose();
            } else if (hand2.isStrongerThan(hand1)) {
                System.out.println("Winner: Player2");
                player2.win();
                player1.lose();
            } else {
                System.out.println("Even ...");
                player2.even();
                player1.even();
            }
        }

        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
