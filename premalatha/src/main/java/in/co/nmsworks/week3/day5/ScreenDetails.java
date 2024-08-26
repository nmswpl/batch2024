package in.co.nmsworks.week3.day5;

public class ScreenDetails {
    private static int totalSeats;
    private static int bookedSeat = 0;


    public int getTotalSeats() {
        return totalSeats;
    }

    public int getBookedSeat() {
        return bookedSeat;
    }

    public void bookSeats(int noOfSeats) {
        bookedSeat += noOfSeats;
    }

    public static int getAvailableSeatCount() {
        return totalSeats - bookedSeat;
    }
}
