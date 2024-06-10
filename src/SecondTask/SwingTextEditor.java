package SecondTask;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// пример на либу swing
public class SwingTextEditor {
    // Объявляем основные компоненты приложения
    private JFrame frame;
    private JTextArea textArea;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem saveItem;

    public SwingTextEditor() {
        initialize();
    }

    // Инициализируем компоненты приложения
    private void initialize() {
        // Создаем и настраиваем основное окно приложения
        frame = new JFrame("ТиЭксТи Эдитор");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);

        // Создаем и добавляем текстовую область в центр окна
        textArea = new JTextArea();
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Создаем и настраиваем меню приложения
        createMenuBar();
        frame.setJMenuBar(menuBar);

        // Делаем окно видимым
        frame.setVisible(true);
    }

    // Создаем и настраиваем меню приложения
    private void createMenuBar() {
        // Создаем менюбар и меню "Файл"
        menuBar = new JMenuBar();
        fileMenu = new JMenu("Файл");
        menuBar.add(fileMenu);

        // Создаем пункт меню "Сейв" и добавляем обработчик событий нажатия
        saveItem = new JMenuItem("Сейв");
        saveItem.addActionListener(e -> saveFile());
        fileMenu.add(saveItem);
    }

    // Обрабатываем сохранение текста в файл
    private void saveFile() {
        // Открываем диалог сохранения файла
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(frame);

        // Если пользователь выбрал файл для сохранения, сохраняем текст в файл
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                FileWriter writer = new FileWriter(selectedFile);
                writer.write(textArea.getText());
                writer.close();
            } catch (IOException e) {
                // Если произошла ошибка при сохранении, выводим сообщение об ошибке
                JOptionPane.showMessageDialog(frame, "Ошибка сохранения: " + e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Точка входа в приложение
    public static void main(String[] args) {
        // Создаем приложение в потоке диспетчеризации событий Swing
        SwingUtilities.invokeLater(() -> new SwingTextEditor());
    }
}