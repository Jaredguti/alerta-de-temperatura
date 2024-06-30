public class WeatherWarning implements Observer {
    private static final int WARNING_THRESHOLD = 30;

    @Override
    public void update(int temperature) {
        if (temperature > WARNING_THRESHOLD) {
            System.out.println("Warning: High temperature! (" + temperature + "°C)");
        }
    }
}
