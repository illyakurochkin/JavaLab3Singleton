import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        ReflectionSingleton instanceOne = ReflectionSingleton.getInstance();
        ReflectionSingleton instanceTwo = null;

        try {
            Constructor<ReflectionSingleton> constructor = ReflectionSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);

            instanceTwo = constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("instanceOne hash : " + instanceOne.hashCode());
        System.out.println("instanceTwo hash : " + instanceTwo.hashCode());
    }
}

class ReflectionSingleton {
    private static final ReflectionSingleton INSTANCE = new ReflectionSingleton();

    private ReflectionSingleton() {

    }

    public static ReflectionSingleton getInstance() {
        return INSTANCE;
    }
}
