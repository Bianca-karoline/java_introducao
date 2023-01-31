import java.util.*;
public class Idioma {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println(idioma.getDisplayLanguage());
        System.out.println(idioma.getDisplayCountry());
    }
}
