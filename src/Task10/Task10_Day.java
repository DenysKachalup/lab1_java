package Task10;

public class Task10_Day {
    private final String day;
    private final String[] todayIsDay = new String[]{"Понеділок", "Вівторок", "Середа", "Четвер", "ПятницЯ", "Субота", "Неділя"};

    public Task10_Day(final int day) {
        this.day = this.todayIsDay[day];
    }

    public String getDay() {
        return this.day;
    }
}

