/* Дан некоторый URL: String url = "http://test.com/dir1/dir2/dir3/page.html";
Даны переменные:
int num = 2;
String val = "eee";
Замените в URL папку с номером num на значение val: "http://test.com/dir1/eee/dir3/page.html" */

public class TenSixThree {
   public static void main(String[] args){
       // Заданный URL
       String url = "http://test.com/dir1/dir2/dir3/page.html";

        // Заданные переменные
       int num = 2;
       String val = "eee";

        // Разделяем URL на составляющие
       String[] parts = url.split("/");

        // Проверяем, что в заданном URL присутствует достаточно много директорий
       if (parts.length >= num + 2) {
           // Заменяем директорию с номером num на значение переменной val
           parts[num + 2] = val;

           // Собираем обновленный URL
           String updatedUrl = String.join("/", parts);

           // Выводим обновленный URL
           System.out.println(updatedUrl);
       } else {
           // Выводим сообщение об ошибке, если заданный URL недостаточно длинный
           System.out.println("Невозможно выполнить замену. Номер директории слишком велик.");
       }
   }
}