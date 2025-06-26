public class Screen {
    protected ScreenType screenType;
    protected Movie movie;
    public ScreenType getScreenType(){
        return screenType;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }

    public Movie getMovie(){
        return movie;
    }
}

class Standard extends Screen{
    public Standard(){
        screenType = ScreenType.STANDARD;
    }
}

class Imax extends Screen{
    public Imax(){
        screenType = ScreenType.IMAX;
    }
}