import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class TestClass extends AbstractCustomClass {
    private int age;
    private String name;
    private String password;


    @Override
    ArrayList<String> getFields() {
        return new ArrayList<String>(List.of("age", "name", "password"));
    }

    @Override
    ArrayList<AbstractCustomClass> readFromFile() {
        return null;
    }

    public void manualFill(int age, String name, String password) {
        this.age = age;
        this.name = name;
        this.password = password;
    }


}
