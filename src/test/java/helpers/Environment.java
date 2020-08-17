package helpers;



public class Environment {
// COMMON CONFIG
    public final static String
        urlyandex = System.getProperty("urlyandex", "http://market.yandex.ru"),
        url = System.getProperty("url", "http://facebook.com"),
        email = System.getProperty("email", "qa.guru.test@gmail.com"),
        password = System.getProperty("password", "testpassword#&!"),
        searchitem = System.getProperty("searchitem", "Холодильник"),
        urlVK = System.getProperty("UrllVk", "https://vk.com/feed"),
        passwordVk = System.getProperty("passwordVk", "b857amkqslashpunkbatman666"),
        text = System.getProperty("text", "всё"),
        phoneNumber = System.getProperty("phoneNumber", "89607986429");

}
