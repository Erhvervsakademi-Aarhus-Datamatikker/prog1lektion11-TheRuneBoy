package opgave02;

public class Timetable {
    public static void main(String[] args) {
        Departure[] departures = getDepartures();
        printDepartures(departures);
    }

    private static void printDepartures(Departure[] departures) {
        // TODO: Write your code here
    }

    private static Departure[] getDepartures() {
        Departure[] departures = new Departure[10];
        departures[0] = new Departure(1, "København H", "07:57", "08:04");
        departures[1] = new Departure(2, "Aalborg", "08:03", "08:10");
        departures[2] = new Departure(1, "København H", "08:32", "08:40");
        departures[3] = new Departure(2, "Skjern", "08:46", "08:52");
        departures[4] = new Departure(1, "København H", "08:57", "09:04");
        departures[5] = new Departure(2, "Aalborg", "09:03", "09:10");
        departures[6] = new Departure(1, "København H", "09:32", "09:40");
        departures[7] = new Departure(2, "Skjern", "09:46", "09:52");

        return departures;
    }
}
