package figure;

public class Horse extends Figure {

    public Horse(Enum<figure.Color> Color) {
        super(Color);
    }

    @Override
    public String toString() {
        return "|_2";
    }
}
