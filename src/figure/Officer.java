package figure;

public class Officer extends Figure {

    public Officer(Enum<figure.Color> Color) {
        super(Color);
    }

    @Override
    public String toString() {
        return "|Сл";
    }
}


