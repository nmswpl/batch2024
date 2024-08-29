package in.co.nmsworks.week4.day4;

import java.util.*;

public class CardDealer1 {
    List<Card> cardsList=new ArrayList<>();
    public CardDealer1(){
        String[] arr={"spades","clubs", "diamonds", "hearts"};
        for (String card : arr) {
            for (int i = 2; i <=10 ; i++) {
                cardsList.add(new Card(card,String.valueOf(i)));
            }
            cardsList.add(new Card(card,"Ace"));
            cardsList.add(new Card(card,"King"));
            cardsList.add(new Card(card,"Queen"));
            cardsList.add(new Card(card,"Jack"));
        }
    }
    public Map<Integer,List<Card>> cardDealer(int noOfPlayers){
        Map<Integer,List<Card>> playersToCards=new HashMap<>();
        for (int i = 1; i <= noOfPlayers; i++) {
            playersToCards.put(i, new ArrayList<>());
        }
        shuffle();
        Iterator<Card> card = cardsList.iterator();
        int player = 1;
        while (card.hasNext()){
            List<Card> playerCardsList = new ArrayList<>();
            playerCardsList = playersToCards.get(player);
            playerCardsList.add(card.next());
            playersToCards.put(player, playerCardsList);
            if (player == noOfPlayers)
                player = 0;
            player++;
        }
        return playersToCards;
    }
    private void shuffle(){
        Collections.shuffle(cardsList);
        Collections.shuffle(cardsList);
        Collections.shuffle(cardsList);
        Collections.shuffle(cardsList);

    }

    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of players : ");
        int noOfPlayers = scanner.nextInt();
        Map<Integer, List<Card>> playerToCards = new CardDealer1().cardDealer(noOfPlayers);
        for (Integer player : playerToCards.keySet()) {
            System.out.println("player "+player);
            System.out.println("there cards are ::\n"+playerToCards.get(player).size());
        }
    }

}
