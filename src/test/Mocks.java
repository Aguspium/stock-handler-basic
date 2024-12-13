package test;
import java.util.function.Consumer;

public class Mocks {

    public static void editaratributoMock(Consumer<Integer> set, int a) {
        set.accept(a);
    }
}
