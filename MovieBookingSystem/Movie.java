public class Movie {
    int id;
    String name;
    int durationInMin;
    
    public Movie(int id, String name, int durationInMin){
        this.id = id;
        this.name = name;
        this.durationInMin = durationInMin;
    }

    public int getID(){
        return id;
    }

    public String getMovieName(){
        return name;
    }

    public int getMovieDuration(){
        return durationInMin;
    }
}
