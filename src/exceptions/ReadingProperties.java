package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Source\\LetsKodeIt - Java\\src\\exceptions\\test.properties";
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(path);

        prop.load(fis);
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("course"));
    }
}
