package FirstTask;// Дан некоторый URL: Получите из него имя страницы: "page.html"

public class NineTwoThree {
    public static void main(String[] args) {
        // Заданный URL
        String url = "http://test.com/dir1/dir2/dir3/page.html";

        // Используем метод substring для получения подстроки, начиная с последнего символа "/" и до конца строки
        String pageName = url.substring(url.lastIndexOf("/") + 1);

        // Выводим имя страницы
        System.out.println(pageName);
    }
}