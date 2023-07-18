package Synchronized;

class BookTheaterSeat {
    int total_Seats = 10;

    synchronized void bookSeat(int seats) {
        if (total_Seats >= seats) {
            System.out.println(seats + " Booked Successfully");
            total_Seats = total_Seats - seats;
            System.out.println("Seats Left: " + total_Seats);
        } else {
            System.out.println("Sorry Seats cannot be booked Due to Limit Exceed!..");
            System.out.println("Seats Left: " + total_Seats);
        }
    }
}

public class MovieShowApp extends Thread {
    static BookTheaterSeat b;
    int seats;

    public void run() {
        b.bookSeat(seats);

    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();

        MovieShowApp deepak = new MovieShowApp();
        deepak.seats = 17;
        deepak.start();

        MovieShowApp amit = new MovieShowApp();
        amit.seats = 10;
        amit.start();
    }

}
