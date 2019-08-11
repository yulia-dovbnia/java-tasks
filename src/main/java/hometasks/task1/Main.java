package hometasks.task1;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        //Creating instance from Prop
        String className = PropertiesLoader.properties.get("class").toString();
        Person p = (Person) Class.forName(className).newInstance();

        //Get Class instance
        Class<? extends Person> pClass = p.getClass();

        //Update field value
        System.out.println("Object before update = " + p);
        Field fieldName = pClass.getDeclaredField("name");
        fieldName.setAccessible(true);
        fieldName.set(p, "QA");
        System.out.println("Updated object = " + p);

        //Get annotation by type
        CustomAnnotation annotation = pClass.getAnnotation(CustomAnnotation.class);
        System.out.println("Value of annotation in class Person = " + annotation.value());
    }

}
