package in.co.nmsworks.week3.Day5;
public class ScreenDetails {
    private int totalSeats;
    private int bookedSeat = 0;

    public ScreenDetails(int totalSeats)
    {
        this.totalSeats = totalSeats;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(int bookedSeat) {
        this.bookedSeat = bookedSeat;
    }

    public void bookSeats(int noOfSeats)
    {
        bookedSeat = bookedSeat + noOfSeats;
    }

    public int getAvailableCount()
    {
        return totalSeats - bookedSeat;
    }
}
