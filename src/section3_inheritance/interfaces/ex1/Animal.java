package section3_inheritance.interfaces.ex1;

public interface Animal {

    int noOfLegs = 4;

    public String getName();

    void eat();

    default void printNoOfLegs() {
        System.out.println("I have " + noOfLegs + " legs");
    }

    static void makeNoise() {
        System.out.println("I can make noises!");
    }
}
