/* Дан некоторый URL:
* String url = "http://test.com/dir1/dir2/dir3/page.html";
* Получите из него последовательный набор папок:
* {
	"/dir1/dir2/dir3/",
	"/dir2/dir3/",
	"/dir3/"
}*/

import java.util.ArrayList;

public class TenFourOne {
    public static void main(String[] args) {
        String url = "http://test.com/dir1/dir2/dir3/page.html";
        ArrayList<String> folders = new ArrayList<>();
        String[] parts = url.split("/");
        StringBuilder folderPath = new StringBuilder();

        for (int i = 3; i < parts.length - 1; i++) {
            folderPath.append("/").append(parts[i]);
            folders.add(folderPath.toString());
        }

        System.out.println(folders);
    }
}

