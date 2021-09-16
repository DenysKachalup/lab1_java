package Task10;

public class Main {
    public static void main(final String[] args) {
        final Task10_Day[] days = new Task10_Day[7];

        for (int i = 0; i < days.length; ++i) {
            days[i] = new Task10_Day(i);
            System.out.println(days[i].toString());
        }

    }
}
