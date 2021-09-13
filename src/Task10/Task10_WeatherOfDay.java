package Task10;

public class Task10_WeatherOfDay extends Task10_Day {
    final private Task10_Weather weather = new Task10_Weather();

    public Task10_WeatherOfDay(final int day) {
        super(day);
    }

    public String toString() {
        return "Weather of day { " + getDay() + " rain=" + this.weather.isRain() + ", sun=" + this.weather.isSun() + ", maxTemp=" + this.weather.getMaxTemp() + ", minTemp=" + this.weather.getMinTemp() + " }";
    }

    public static void main(final String[] args) {
        Task10_WeatherOfDay[] days = new Task10_WeatherOfDay[7];

        for(int i = 0; i < days.length; ++i) {
            days[i] = new Task10_WeatherOfDay(i);
            System.out.println(days[i].toString());
        }

    }
}

