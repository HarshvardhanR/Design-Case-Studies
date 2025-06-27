import java.util.Observer;
import java.util.Observable;

public class CurrentConditionsDisplay implements Observer, Display {

    private double temperature;
    private double humidity;

    public CurrentConditionsDisplay(Observable observable){
        observable.addObserver(this);
    }
    
    public void update(Observable observable, Object arg){
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
            }
    }

    public void display(){
        System.out.println("Current Conditions: Temperature: " + temperature + " Humidity: " + humidity );
    }
}
