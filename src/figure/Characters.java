package figure;

public class Characters extends DeskObjects {

    private Enum<Chars> Name;

    public Characters(Enum<Color> Color, Enum<Chars> Name) {
        super(Color);
        this.Name = Name;
    }

    @Override
    public String toString() {
        return Name.name();
    }
}
