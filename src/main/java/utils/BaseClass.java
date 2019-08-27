package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.*;
import java.util.Objects;
import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;
    public static Properties prop ;

    public BaseClass()  {
        prop = new Properties();
        try {

            InputStream input=BaseClass.class.getClassLoader().getResourceAsStream("./config/config.properties");
            prop.load(Objects.requireNonNull(input));


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void initialize () {

        try {
            String browserName = prop.getProperty("browser");
            String path = System.getProperty("user.dir");
            System.out.println(path);


            if (browserName.equals("chrome")) {
                System.out.println("In Chrome");
                path=path+"/src/main/resources/chromedriver";
                System.setProperty("webdriver.chrome.driver",path);
                driver = new ChromeDriver();
            } else if (browserName.equals("firefox")) {
                System.out.println("In firefox");

                path=path+"/src/main/resources/geckodriver";
                System.setProperty("webdriver.gecko.driver",path);

                driver=new FirefoxDriver();
            }

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

