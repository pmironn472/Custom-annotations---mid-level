package pattern;


import ca.DefaultValue;
import someclass.SomeClass;

import java.lang.reflect.Field;

public class SomeClassFactory {

    public static SomeClass getObject() throws Exception {
        SomeClass a = new SomeClass();

        Field field = SomeClass.class.getDeclaredField("xyz");
        Integer annotationValue = field.getAnnotation(DefaultValue.class).value();
        if (annotationValue != null) {
            a.setXyz(annotationValue);
            return a;
        } else
            throw new Exception("There is no such field in that object");
    }

}
