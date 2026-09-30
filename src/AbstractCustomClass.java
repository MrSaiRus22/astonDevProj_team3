import java.util.ArrayList;

public abstract class AbstractCustomClass {

    //должен вернуть список полей
    abstract String[] getFields();

    //кастомные парсеры
    abstract ArrayList<AbstractCustomClass> readFromFile();
}
