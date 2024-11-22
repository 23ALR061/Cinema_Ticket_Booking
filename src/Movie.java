public class Movie {
    private int id;
    private String name;
    private String showTime;
    private int availableSeats;

    public Movie(int id, String name, String showTime, int availableSeats) {
        this.id = id;
        this.name = name;
        this.showTime = showTime;
        this.availableSeats = availableSeats;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShowTime() {
        return showTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookSeats(int seats) {
        availableSeats -= seats;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               "\nName: " + name +
               "\nShow Time: " + showTime +
               "\nAvailable Seats: " + availableSeats;
    }
}
