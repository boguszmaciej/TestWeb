package runners;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {
    public static String PropertyLoader(String property) {

        try (InputStream input = new FileInputStream("src/main/resources/test.properties")) {

            Properties prop = new Properties();

            prop.load(input);

            return prop.getProperty(property);

        } catch (IOException ex) {
            ex.printStackTrace();
            return "Property invalid name";
        }

    }


}
