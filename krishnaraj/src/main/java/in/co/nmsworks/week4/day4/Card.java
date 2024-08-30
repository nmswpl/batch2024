package in.co.nmsworks.week4.day4;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Card {
    String[] a = new String[13];
    String[] b = new String[13];
    String[] c = new String[13];
    String[] d = new String[13];

    public void fillValues(){
        for (int i = 0; i < 13; i++) {
            int temp = i+1;
            a[i]= "a"+temp;
            b[i]="b"+temp;
            c[i]="c"+temp;
            d[i]="d"+temp;
        }
    }
    public List<String> suffleCards(List<String> cardsSuffle){
        Collections.shuffle(cardsSuffle);
        Collections.shuffle(cardsSuffle);
        Collections.shuffle(cardsSuffle);
        Collections.shuffle(cardsSuffle);
        return cardsSuffle;
    }
}
