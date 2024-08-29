package in.co.nmsworks.week4.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer1 {

    List<Card> playerA = new ArrayList<>();
    List<Card> playerB = new ArrayList<>();
    List<Card> playerC = new ArrayList<>();
    List<Card> playerD = new ArrayList<>();

    List<Card> deckOfCards = new ArrayList<>();

    public static void main(String[] args) {

        Dealer1 dealer1 = new Dealer1();
        dealer1.cardCreation();
        dealer1.shuffleCards();
        dealer1.dealing(2);

    }

    public void cardCreation(){
        for(int i=1;i<=13;i++){
            Card a = new Card("a"+i);
            deckOfCards.add(a);
        }
        for(int i=1;i<=13;i++){
            Card a = new Card("b"+i);
            deckOfCards.add(a);
        }
        for(int i=1;i<=13;i++){
            Card a = new Card("c"+i);
            deckOfCards.add(a);
        }
        for(int i=1;i<=13;i++){
            Card a = new Card("d"+i);
            deckOfCards.add(a);
        }
    }

    public void shuffleCards(){
        for (int i=0;i<4;i++){
            Collections.shuffle(deckOfCards);
        }
    }

    public void dealing(int noOfPlayers){
        if(noOfPlayers == 1){
            System.out.println("No of players insufficient");
        }
        else if(noOfPlayers == 2) {
            shuffleCards();
            int index1 = 0;
            int index2 = 1;
            for (int i=1;i<=26;i++){
                playerA.add(deckOfCards.get(index1));
                playerB.add(deckOfCards.get(index2));
                index1+=2;
                index2+=2;
            }
            for (Card card : playerA){
                System.out.println(card);
            }
            System.out.println("--------------------------------------");
            for (Card card : playerB){
                System.out.println(card);
            }
        }
        else if(noOfPlayers == 3){
            shuffleCards();
        }
        else if(noOfPlayers == 4){
            shuffleCards();
        }
        else if (noOfPlayers == 5)
        {
            shuffleCards();
        }
        else if(noOfPlayers == 6){
            shuffleCards();
        }
        else {
            System.out.println("No of players exceeded");
        }
    }
}

