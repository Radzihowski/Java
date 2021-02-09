
package Spam;

import java.util.Random;

public class CoinToss {

    public String tossACoin() {
        Random rand = new Random();
        // taking random integer, make it absolute and devide by 2 result of expressiong below 0 or 1
        int toss = Math.abs(rand.nextInt()) % 2;
        if ( toss == 0 )
            return "HEADS";
        else {
            return "TAILS";
        }
    }

    public static void main(String[] args) {
        CoinToss game = new CoinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
    }
}
