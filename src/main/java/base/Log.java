package base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Log {

    public Logger getLogger() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("log4j.properties"));
        PropertyConfigurator.configure(properties);
        return Logger.getLogger(BasePage.class);
    }

    public void info(String info) throws IOException {
        getLogger().info(info);
    }

    public void error(String info) throws IOException {
        getLogger().error(info);
    }

    public void warn(String info) throws IOException {
        getLogger().warn(info);
    }

    public void trace(String info) throws IOException {
        getLogger().trace(info);
    }
}
