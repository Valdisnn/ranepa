package FirstTask;/* Дан следующий массив:
String[] arr = ["123", "456", "789"];
Преобразуйте этот массив в следующий:
byte[] arr = {
	{1, 2, 3},
	{4, 5, 6},
	{7, 8, 9}
};*/

public class NineThreeTwo {
    public static void main(String[] args){
        // Инициализируем исходный массив строк
        String[] arr = {"123", "456", "789"};

        // Инициализируем новый массив байт
        byte[][] newArr = new byte[arr.length][];

        // Преобразуем каждую строку в массив байт
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            byte[] bytes = new byte[str.length()];
            for (int j = 0; j < str.length(); j++) {
                bytes[j] = Byte.parseByte(String.valueOf(str.charAt(j)));
            }
            newArr[i] = bytes;
        }

        // Выводим новый массив в формате, указанном в задании
        System.out.print("byte[][] arr = {\n");
        for (byte[] bytes : newArr) {
            System.out.print("\t{");
            for (int i = 0; i < bytes.length; i++) {
                System.out.print(bytes[i]);
                if (i != bytes.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("},");
        }
        System.out.println("};");
    }
}