package Task10;

public class Task10_Day {
    private final String day;
    private Task10_Weather weather;
    private final String[] todayIsDay = new String[]{"Понеділок", "Вівторок", "Середа", "Четвер", "ПятницЯ", "Субота", "Неділя"};

    public Task10_Day(final int day) {
        this.day = this.todayIsDay[day];
        this.weather = new Task10_Weather();
    }

    public Task10_Day(final String day, final Task10_Weather weather) {
        this.day = day;
        this.weather = weather;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Task10_Day)) return false;
        final Task10_Day that = (Task10_Day) o;
        return this.day == that.day;
    }

    @Override
    public int hashCode() {
        int result = day.hashCode();
        result = 31 * result + todayIsDay.hashCode();
        return result;
    }

    public String getDay() {
        return this.day;
    }

    public String toString() {
        return "Weather of day { " + getDay() + " rain=" + weather.isRain() + ", sun=" + weather.isSun() + ", maxTemp=" + weather.getMaxTemp() + ", minTemp=" + weather.getMinTemp() + " }";
    }
}

