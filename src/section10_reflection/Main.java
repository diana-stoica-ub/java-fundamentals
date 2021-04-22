package section10_reflection;

import section10_reflection.model.Goat;

public class Main {
    public static void main(String[] args) {
        Object object = getInstance();

        //get class
        Class<?> clazz = object.getClass();



    }

    public static Object getInstance() {
        return new Goat("goat");
    }
}
