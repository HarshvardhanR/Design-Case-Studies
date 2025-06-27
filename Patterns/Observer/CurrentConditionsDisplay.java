public class CurrentConditionsDisplay implements Observer, Display {

    private double temperature;
    private double humidity;

    public CurrentConditionsDisplay(Subject weatherData){
        weatherData.registerObservers(this);
    }
    
    public void update(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Current Conditions: Temperature: " + temperature + " Humidity: " + humidity );
    }
}
