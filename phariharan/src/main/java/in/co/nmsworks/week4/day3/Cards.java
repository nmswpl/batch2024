package in.co.nmsworks.week4.day3;

import java.util.*;

public class Cards {
    private List<String> cardSet = new ArrayList<>();

    public Cards() {
        List<String> cardTypes = new ArrayList<>(Arrays.asList(new String[]{"A", "B", "C", "D"}));
        for (int i = 1; i < 14; i++) {
            for (String cardType : cardTypes) {
                cardSet.add(cardType+String.valueOf(i));
            }
        }
    }

    public List<String> getCardSet() {
        return cardSet;
    }
}
