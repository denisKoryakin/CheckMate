package figure;

public class King extends Figure {

    public King(Enum<figure.Color> Color) {
        super(Color);
    }

    @Override
    public String toString() {
        return "|_K";
    }
}
