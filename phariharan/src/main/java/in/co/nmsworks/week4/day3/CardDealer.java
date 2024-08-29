package in.co.nmsworks.week4.day3;

import java.util.*;

public class CardDealer {

    List<String> cardList = new ArrayList<>();

    public CardDealer() {
        Cards cards = new Cards();
        cardList = cards.getCardSet();
        System.out.println("Before Shuffling : " + cardList);
        Collections.shuffle(cardList);
        Collections.shuffle(cardList);
        Collections.shuffle(cardList);
        Collections.shuffle(cardList);
        System.out.println("After Shuffling : " + cardList);
    }

    public static void main(String[] args) {
        CardDealer dealer = new CardDealer();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the count of players between 2 and 6  : ");
        int playerCount = sc.nextInt();

        Map<Integer, List<String>> cardsMap = dealer.distributeCards(playerCount);
        int counter = 0;
        for (Integer player : cardsMap.keySet()) {
            System.out.print("Player " + ++counter + " :\t");
            for (String cards : cardsMap.get(player)) {
                System.out.print(cards + " ");
            }
            System.out.println("\nNo of cards : " + cardsMap.get(player).size() + "\n");
        }
    }

    private Map<Integer, List<String>> distributeCards(int i) {
        Map<Integer, List<String>> playersCards = new HashMap<>();
        for (int j = 0; j < i; j++) {
            playersCards.put(j, new ArrayList<>());
        }
        int cardIndex = 0;
        while (cardIndex < 52) {
            for (int k = 0; k < i; k++) {
                if (cardIndex == 52) {
                    break;
                } else {
                    playersCards.get(k).add(cardList.get(cardIndex++));
                }
            }
        }
        return playersCards;
    }
}
