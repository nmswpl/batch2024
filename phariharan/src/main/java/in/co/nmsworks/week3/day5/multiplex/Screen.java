package in.co.nmsworks.week3.day5.multiplex;

import java.util.Arrays;

public class Screen {
    private boolean[] seatArray;
    private int availableSeats;
    private int seatStarts;


    public Screen(int maxCapacity) {
        this.seatArray = new boolean[maxCapacity];
        setSeatStarts(0);
    }

    public boolean[] getSeatArray() {
        return seatArray;
    }

    public void setSeatArray() {
        Arrays.fill(seatArray, false);
    }

    public int getAvailableSeats() {
        availableSeats = 0 ;
        for (boolean i : seatArray) {
            if (!i){
                availableSeats +=1;
            }
        }
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getSeatStarts() {
        return seatStarts;
    }

    public void setSeatStarts(int seatStarts) {
        this.seatStarts = seatStarts;
    }

    public void setArrayValues(int i){
        seatArray[i]=true;
    }
}
