package figure;

public class Rook extends Figure {

    public Rook(Enum<figure.Color> Color) {
        super(Color);
    }

    @Override
    public String toString() {
        return "|_Л";
    }
}
