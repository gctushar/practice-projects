package annotation.processor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by shantonu on 6/19/16.
 */
public class RefUtils {
    public static Object getStaticField(final String aClass, final String aField) throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        Field field = Class.forName(aClass).getDeclaredField(aField);
        field.setAccessible(true);
        return field.get(Class.forName(aClass));
    }

    public static void setStaticField(final String aClass, final String aField, final Object value) throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        Field field = Class.forName(aClass).getDeclaredField(aField);
        field.setAccessible(true);
        Object old = field.get(Class.forName(aClass));
        field.set(old, value);
    }


    public static Object getField(final Object instance, final String fieldName) throws NoSuchFieldException, IllegalAccessException {
        Field field = instance.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(instance);
    }

    public static void setField(final Object instance, final String aField, final Object value) throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        Field field = instance.getClass().getDeclaredField(aField);
        field.setAccessible(true);
        field.set(instance, value);
    }

    public static Object createInstance(final Class<?> aClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return aClass.getConstructor().newInstance();
    }
}