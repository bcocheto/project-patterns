package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ClassFactory {
    private static final Map<String, Class> classes = new HashMap<>();

    public  static Class getClass(String name, String region) {
        Class aClass = classes.get(name);
        if(aClass == null) {
            aClass = new Class(name, region);
            classes.put(name, aClass);
        }
        return aClass;
    }

    public static int getCountOfClasses() {
        return classes.size();
    }
}
