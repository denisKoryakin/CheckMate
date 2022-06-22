package figure;

public abstract class Figure extends DeskObjects {

    public Enum<Color> Color;

    public Figure(Enum<Color> Color) {
        super(Color);
    }
}


