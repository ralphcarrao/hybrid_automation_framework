package utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Property {
    private static final String SEPARATOR = "/";
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private final Properties properties;

    public Property() {
        properties = new Properties();
    }

    public Property load(String name) {
        try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            InputStream input = loader.getResourceAsStream(name);
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public Property load(String folder, String name) {
        try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            InputStream input = loader.getResourceAsStream(folder + SEPARATOR + name);
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public String getProperty(String key) {
        return properties.getProperty(key).toLowerCase();
    }
}
