public class Screen {
    protected ScreenType screenType;

    public ScreenType getScreenType(){
        return screenType;
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