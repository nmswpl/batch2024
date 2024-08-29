package in.co.nmsworks.week4.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {

    public void shuffleCards(List<Card> cardsDeck){
        for (int i = 1; i <= 4 ; i++) {
            Collections.shuffle(cardsDeck);
        }
        System.out.println("Deck of Cards after shuffle : ");
        System.out.println(cardsDeck);
    }

    public List<List<Card>> dealTheCard(int noOfPlayers, List<Card> cardsDeck){
        int cardsPerPlayer = 0;
        switch (noOfPlayers) {
            case 2:
            case 3:
                cardsPerPlayer = 7;
                break;
            case 4:
            case 5:
                cardsPerPlayer = 5;
                break;
            case 6:
                cardsPerPlayer = 4;
                break;
        }

        List<List<Card>> cardsOfEachPlayer = new ArrayList<>();
        for (int i = 0; i < noOfPlayers; i++) {
            cardsOfEachPlayer.add(new ArrayList<>());
        }

        for (int i = 0; i < cardsPerPlayer; i++) {
            for (int j = 0; j < noOfPlayers; j++) {
                if (!cardsDeck.isEmpty()) {
                    cardsOfEachPlayer.get(j).add(cardsDeck.remove(0));
                }
            }
        }
        return cardsOfEachPlayer;
    }
}