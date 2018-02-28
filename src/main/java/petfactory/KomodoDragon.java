package petfactory;

/**
 * filename:
 * project: lambdafactory
 * author: https://github.com/vvmk
 * date: 2/27/18
 */
public class KomodoDragon extends Pet<KomodoDragon> {
    private static final String fDEFAULT_NAME = "Phillip";
    private static final String fSOUND = "hiss";

    public KomodoDragon() {
        this(fDEFAULT_NAME);
    }

    public KomodoDragon(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return fSOUND;
    }
}
