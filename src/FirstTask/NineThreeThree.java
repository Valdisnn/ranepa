package FirstTask;// Дан некоторый URL: Получите из него протокол:

public class NineThreeThree {
    public static void main(String[] args){
        // Заданный URL
        String url = "http://test.com/dir1/dir2/dir3/page.html";

        // Переменная для хранения протокола
        String protocol;

        // Проверяем, начинается ли URL с http://
        if (url.startsWith("http://")) {
            protocol = "http";
        }
        // Проверяем, начинается ли URL с https://
        else if (url.startsWith("https://")) {
            protocol = "https";
        }
        // Если начинается с другого протокола или не начинается с протокола вовсе
        else {
            protocol = "unknown";
        }

        // Выводим результат
        System.out.println("Протокол: " + protocol);
    }
}