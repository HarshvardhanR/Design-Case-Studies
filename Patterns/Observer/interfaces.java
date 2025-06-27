interface Subject{
    public void notifyObservers();
    public void registerObservers(Observer o);
    public void removeObservers(Observer o);
}

interface Display{
    public void display();
}

interface Observer{
    public void update(double temperature, double humidity, double pressure);
}