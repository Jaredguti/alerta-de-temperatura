public class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Current temperature: " + temperature + "°C");
    }
}
