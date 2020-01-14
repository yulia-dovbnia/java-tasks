package hometasks.task1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {
    private PropertiesLoader() {
    }

    static Properties properties;

    static {
        try (InputStream input = PropertiesLoader.class.getClassLoader().getResourceAsStream("task1.properties")) {
            properties = new Properties();
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
