package petfactory;

/**
 * filename:
 * project: lambdafactory
 * author: https://github.com/vvmk
 * date: 2/27/18
 */
public class Cat extends Pet<Cat> {
    private static final String fDEFAULT_NAME = "Milo";
    private static final String fSOUND = "meow";

    public Cat() {
        this(fDEFAULT_NAME);
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return fSOUND;
    }
}
