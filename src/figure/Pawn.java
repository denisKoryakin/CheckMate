package figure;

public class Pawn extends Figure {

    public Pawn(Enum<figure.Color> Color) {
        super(Color);
    }

    @Override
    public String toString() {
        return "|_п";
    }
}
