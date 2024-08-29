package in.co.nmsworks.week4.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayGame {
    public List<Card> getDeckOfCards(){
        List<Card> cardsDeck = new ArrayList<>();
        for (char i = 'A'; i <= 'D' ; i++) {
            for (int j = 1; j <= 13; j++) {
                Card card = new Card(i +""+j);
                cardsDeck.add(card);
            }
        }
        System.out.println("Deck of Cards before shuffle : ");
        System.out.println(cardsDeck);
        return cardsDeck;
    }

    public static void main(String[] args) {
        PlayGame playGame = new PlayGame();
        Dealer dealer = new Dealer();
        dealer.shuffleCards(playGame.getDeckOfCards());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Players (2 to 6) : ");
        int noOfPlayers = sc.nextInt();
        List<List<Card>> cardsOfEachPlayer = dealer.dealTheCard(noOfPlayers, playGame.getDeckOfCards());

        for (int i = 0; i < noOfPlayers; i++) {
            System.out.print("Player " + (i + 1) + " cards: ");
            List<Card> playerCards = cardsOfEachPlayer.get(i);
            for (Card card : playerCards) {
                System.out.print(card + " ");
            }
            System.out.println();
        }
    }
}