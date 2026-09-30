import java.util.ArrayList;

public class TestClass extends AbstractCustomClass {
    private int age;
    private String name;
    private String password;


    @Override
    String[] getFields() {
        return new String[]{"age", "name", "password"};
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
