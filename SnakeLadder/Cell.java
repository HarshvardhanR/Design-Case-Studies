package SnakeLadder;

public class Cell {
    Prop prop;

    public Cell(){
        prop = null;
    }

    public Prop getProp(){
        return prop;
    }

    public void setProp(Prop prop){
        this.prop = prop;
    }
}
