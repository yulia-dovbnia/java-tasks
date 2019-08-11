package hometasks.task1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {
    private PropertiesLoader() {
    }

    static Properties properties;

    static {
        try (InputStream input = new FileInputStream("src/main/resources/task1.properties")) {
            properties = new Properties();
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
