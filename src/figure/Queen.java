package figure;

public class Queen extends Figure {

    public Queen (Enum Color) {
        super(Color);
    }

    @Override
    public String toString() {
        return "|_Q";
    }
}
