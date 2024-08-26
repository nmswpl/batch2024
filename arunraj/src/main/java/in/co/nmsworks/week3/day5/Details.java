package in.co.nmsworks.week3.day5;

class ScreenDetails
{
    private int totalSeats;
    private int bookedSeat = 0;

    public ScreenDetails(int totalSeats)
    {
        this.totalSeats = totalSeats;
    }

    public int getTotalSeats()
    {
        return totalSeats;
    }

    public int getBookedSeat()
    {
        return bookedSeat;
    }

    public void bookSeats(int noOfSeats)
    {
        bookedSeat += noOfSeats;
    }

    public int getAvailableSeatCount()
    {
        return totalSeats - bookedSeat;
    }
}

