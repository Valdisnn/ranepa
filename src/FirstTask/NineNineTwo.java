package FirstTask;/* Дан текст. Напишите программу, которая отформатирует этот текст так,
чтобы в строке текста было не более 70 символов, а потом шел перенос строки.
Слова при этом не должны разбиваться. */

public class NineNineTwo {
    public static String formatText(String text) {
        StringBuilder formattedText = new StringBuilder();
        StringBuilder currentLine = new StringBuilder();

        // Разделяем текст на слова
        String[] words = text.split(" ");

        for (String word : words) {
            // Если добавление текущего слова не нарушит ограничение по длине строки
            if (currentLine.length() + word.length() <= 70) {
                currentLine.append(word).append(" ");
            }
            // Если добавление текущего слова приводит к превышению ограничения по длине строки
            else {
                formattedText.append(currentLine.toString().trim()).append("\n");
                currentLine.setLength(0);
                currentLine.append(word).append(" ");
            }
        }

        formattedText.append(currentLine.toString().trim()); // Добавляем последнюю строку текста без переноса строки

        return formattedText.toString();
    }

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras efficitur massa eu metus eleifend, vitae rutrum nisi dapibus. Nunc non mauris in augue aliquet condimentum a in turpis. Maecenas imperdiet neque a ex faucibus, eu rhoncus dui eleifend. Phasellus imperdiet neque vel ornare aliquet. Maecenas varius cursus pretium. Phasellus pulvinar felis id eros viverra, sit amet pellentesque est elementum. Aliquam erat volutpat. Sed non odio sit amet nisl consequat malesuada.";

        String formattedText = formatText(text);
        System.out.println(formattedText);
    }
}