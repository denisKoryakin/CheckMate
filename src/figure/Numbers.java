package figure;

public class Numbers extends DeskObjects {

    private String Num;

    public Numbers(Enum<Color> Color, String Num) {
        super(Color);
        this.Num = Num;
    }

    @Override
    public String toString() {
        return Num;
    }
}
