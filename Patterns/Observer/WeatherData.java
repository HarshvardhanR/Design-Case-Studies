import java.util.ArrayList;

public class WeatherData implements Subject {

    private double temperature;
    private double humidity;
    private double pressure;
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObservers(Observer o) {
        observers.add(o);
    }

    public void removeObservers(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(){
        for(Observer observer: observers){
            observer.update(temperature, humidity, pressure);
        }
    }
    
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
