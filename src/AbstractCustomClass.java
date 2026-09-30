import java.util.ArrayList;

public abstract class AbstractCustomClass {

    //должен вернуть список полей
    abstract ArrayList<String> getFields();

    //кастомные парсеры
    abstract ArrayList<AbstractCustomClass> readFromFile();
}
