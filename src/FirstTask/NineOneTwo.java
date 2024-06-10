package FirstTask;// Дан некоторый URL: Получите из него имя домена:

import java.net.URI;
import java.net.URISyntaxException;

public class NineOneTwo {
    public static void main(String[] args) {
        String url = "https://www.test.com/example/page";

        try {
            URI uri = new URI(url);
            String domain = uri.getHost();

            // Извлекаем имя домена
            if (domain.startsWith("www.")) {
                domain = domain.substring(4); // Удаляем "www."
            }

            System.out.println(domain);
        } catch (URISyntaxException e) {
            System.out.println("Invalid URL");
        }
    }
}
