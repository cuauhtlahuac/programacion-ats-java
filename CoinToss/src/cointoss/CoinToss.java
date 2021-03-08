package cointoss;

import java.util.Random;

/**
 *
 * @author Cuauhtlahuac
 */
public class CoinToss {

    public String tossACoin() {
        Random rand = new Random();

        int toss = Math.abs(rand.nextInt()) % 2;
        
        return toss == 0 ? "HEAD" : "TAIL";    

    }

    public static void main(String[] args) {
        CoinToss game = new CoinToss();
        System.out.println("Drop in: " + game.tossACoin());
        System.out.println("Drop in: " + game.tossACoin());
        System.out.println("Drop in: " + game.tossACoin());
    }

}
