package petfactory;

/**
 * filename:
 * project: lambdafactory
 * author: https://github.com/vvmk
 * date: 2/27/18
 */
public class Demo {
    public static void main(String[] args) {
        Pet somePet = PetType.getPetInstance("cat");
        System.out.println(somePet.speak()); // meow
    }
}
