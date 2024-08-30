package in.co.nmsworks.week4.day4;

import java.util.*;

public class Dealer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dealer dealer = new Dealer();
        System.out.println("Enter the number of players : ");
        int playerCount = scanner.nextInt();
        scanner.nextLine();
        dealer.dealing(playerCount);
    }

    private void dealing(int playerCount) {
        Card card = new Card();
        card.fillValues();
        String[] a = card.a;
        String[] b = card.b;
        String[] c = card.c;
        String[] d = card.d;
        List<String> cards = new ArrayList<>();
        cards.addAll(Arrays.asList(a));
        cards.addAll(Arrays.asList(b));
        cards.addAll(Arrays.asList(c));
        cards.addAll(Arrays.asList(d));
        cards = card.suffleCards(cards);
        int count = 0;
        for (String string : cards) {
            System.out.println(string);
            count++;
        }
        System.out.println(count);
        Map<Integer, List<String>> playerToCards = new HashMap<>();

        for (int i = 1; i <= playerCount; i++) {
            List<String> caredForPlayer = new ArrayList<>();
            playerToCards.put(i, caredForPlayer);
        }
//        int counter = 0;
//        while (counter <= 51) {
//            for (int i = 1; i <= playerCount; i++) {
//                List<String> cardForPlayer1 = playerToCards.get(i);
//                cardForPlayer1.add(cards.get(counter));
//                if(counter == 51){
//                    return;
//                }
//                counter++;
//                playerToCards.put(i, cardForPlayer1);
//            }
//        }

        for (Map.Entry<Integer, List<String>> playerCardsEntry : playerToCards.entrySet()) {
            System.out.println("Player : " + playerCardsEntry.getKey() + "Cards : " + playerCardsEntry.getValue());
        }
    }
}
