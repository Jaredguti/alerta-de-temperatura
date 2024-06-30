public class Main {
    public static void main(String[] args) {
        // Crear instancia de WeatherStation
        WeatherStation weatherStation = new WeatherStation();

        // Crear instancias de los observadores
        TemperatureDisplay tempDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        // Agregar observadores a la estación meteorológica
        weatherStation.addObserver(tempDisplay);
        weatherStation.addObserver(weatherWarning);

        // Cambiar la temperatura de la estación
        weatherStation.setTemperature(25);  // No debería haber advertencia
        weatherStation.setTemperature(35);  // Debería haber advertencia
    }
}
