package main.java.org.launchcode;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else if (lang.equals("de")) {
            return "Hallo, Welt!";
        } else if (lang.equals("ru")) {
            return "Privet, mir!";
        }else {
            return "Hello, World!";
        }
    }
}
