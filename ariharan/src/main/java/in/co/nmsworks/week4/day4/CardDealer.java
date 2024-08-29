package in.co.nmsworks.week4.day4;

import java.util.*;

public class CardDealer {
    static List<String> cards = new ArrayList<>();

    public CardDealer(){
        for (int i = 1; i <= 13; i++) {
            cards.add("A" + i);
            cards.add("B" + i);
            cards.add("C" + i);
            cards.add("D" + i);
        }
        System.out.println("card deck :: " + cards);
    }

    public Map<Integer, List<String>> cardDealer( int noOfPlayers ){
        Map<Integer, List<String>> playerTocards = new HashMap<>();
        for (int i = 1; i <= noOfPlayers; i++) {
            playerTocards.put(i, new ArrayList<>());
        }
        Collections.shuffle(cards);
        Collections.shuffle(cards);
        Collections.shuffle(cards);
        Collections.shuffle(cards);
        Iterator<String> card = cards.iterator();
        int player = 1;
        while (card.hasNext()){
            List<String> playerCardsList = new ArrayList<>();
            playerCardsList = playerTocards.get(player);
            playerCardsList.add(card.next());
            playerTocards.put(player, playerCardsList);
            if (player == noOfPlayers)
                player = 0;
            player++;
        }
        return playerTocards;
    }

    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of players : ");
        int noOfPlayers = scanner.nextInt();
        Map<Integer, List<String>> cardsToPlayer = new CardDealer().cardDealer(noOfPlayers);
        for (Integer player : cardsToPlayer.keySet()) {
            System.out.println("player "+player);
            System.out.println("there cards are ::\n"+cardsToPlayer.get(player));
        }
    }

}
