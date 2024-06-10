package FirstTask;/* String url = "http://test.com/dir1/dir2/dir3/page.html";
Получите имя первой папки: "dir1" */

public class NineSixOne {
    public static void main(String[] args){
        // Заданный URL
        String url = "http://test.com/dir1/dir2/dir3/page.html";

        // Разбиваем URL на части по символу "/"
        String[] parts = url.split("/");

        // Извлекаем имя первой папки
        String firstDir = parts[parts.length - 4];

        // Выводим результат
        System.out.println(firstDir);
    }
}