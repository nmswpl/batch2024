package in.co.nmsworks.week4.day4;
import java.util.*;

public class Dealer {

    List<Card> cards = new ArrayList<>();
    List<Card> eachPlayerCard = new ArrayList<>();
    Map<Integer, List<Card>> playerToCards = new HashMap<>();

    public Dealer(){
        createCards();
    }

    private void createCards() {

        for(int i ='A'; i<='D';i++){
        for( int j =1;j<=13;j++) {
            Card card = new Card((char)i, j);
            cards.add(card);
        }
        }

    }

    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        dealer.shuffle();
        dealer.deal();

    }


    public void shuffle(){
        for (int i=0;i<4;i++){
            Collections.shuffle(cards);
        }

    }

    public void deal(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Players :");
        int playerCount = sc.nextInt();
        int  player =1;
        for (Card card : cards) {

            eachPlayerCard.add(card);
            if(playerToCards.containsKey(player)){
                List<Card> currentList = playerToCards.get(player);
                currentList.add(card);
                playerToCards.put(player,currentList);

                player++;
                if(player > playerCount){
                    player =1;
                }
            }else {
                playerToCards.put(player,eachPlayerCard);

                player++;
                if(player > playerCount){
                    player =1;
                }
            }
            eachPlayerCard = new ArrayList<>();
        }

       for(Integer entry : playerToCards.keySet()){
           System.out.println(entry);
           System.out.println(playerToCards.get(entry).size());
           for(int j =0; j<playerToCards.get(entry).size();j++){

               System.out.println("Card Type:" +playerToCards.get(entry).get(j).getType());
               System.out.println("Card value:" +playerToCards.get(entry).get(j).getNumber());
           }

       }

    }


}
