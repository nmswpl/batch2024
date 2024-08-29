package in.co.nmsworks.week4.day4;

import java.util.*;
import java.util.Collections;

public class Dealer {

    Map<Integer, Cards> playersAndCards = new HashMap<>();
    static List<String> deck = new ArrayList<>();
    Dealer(){
        String[] cardPrefix = new String[]{"A", "B", "C", "D"};
        for (String prefix : cardPrefix) {
            for (int i = 1; i <= 13; i++) {
                deck.add(prefix + i);
            }
        }
    }

    public static void main(String[] args) {


        Dealer d =  new Dealer();
        System.out.println("Before Shuffling :: ");
        System.out.println(deck);

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Shuffle cards\n" +
                    "2. Show each player cards\n" +
                    "3. Exit");
            System.out.println("Enter your choice ::");
            choice = sc.nextInt();


            switch (choice){
                case 1:
                    d.dealCardsToPlayers();
                    break;

                case 2:
                    d.showPlayersCard();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }while(choice != 3);
    }

    private void dealCardsToPlayers()
    {
        int playersCount = getPlayersCount();

        Collections.shuffle(deck, new Random(playersCount));
        System.out.println("After Shuffling :: ");
        System.out.println(deck);



    }

    private static int getPlayersCount()
    {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the no. of players :: ");
        int players = sc.nextInt();
        return players;
    }

    private void showPlayersCard()
    {
        List<String> tempCards;
        int playersCount = getPlayersCount();
        int p = playersCount;
        Cards c;
        for (String card : deck)
        {
            p = (p % playersCount) + 1;
            if (playersAndCards.containsKey(p))
            {
                c = playersAndCards.get(p);
                tempCards = c.getCards();
                tempCards.add(card);

            }
            else {
                c = new Cards();
                tempCards = new ArrayList<>();
                tempCards.add(card);
            }

            c.setCards(tempCards);
            playersAndCards.put(p, c);
        }
        for(Integer player : playersAndCards.keySet())
        {
            System.out.println("Player " + player);
            System.out.println(playersAndCards.get(player).getCards().size());
            for (String card : playersAndCards.get(player).getCards()) {
                System.out.print(card + " ");
            }
            System.out.println();
        }
    }

}
