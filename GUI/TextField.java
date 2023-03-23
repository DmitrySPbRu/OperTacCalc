package OperTacCalc.GUI;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.FlowLayout;
public class TextField extends JFrame
{    JTextField smallField, bigField;
    public TextField()
    {
        super("Текстовые поля");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Создание текстовых полей
        smallField = new JTextField(15);
        smallField.setToolTipText("Короткое поле");
        bigField = new JTextField("Текст поля", 25);
        bigField.setToolTipText("Длиное поле");
        // Настройка шрифта
        bigField.setFont(new Font("Dialog", Font.PLAIN, 14));
        bigField.setHorizontalAlignment(JTextField.RIGHT);
        // Слушатель окончания ввода
        smallField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста
                JOptionPane.showMessageDialog(TextField.this,
                        "Ваше слово: " + smallField.getText());  }
        });
        // Создание панели с текстовыми полями
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(smallField);
        contents.add(bigField);
        setContentPane(contents);
        // Определяем размер окна и выводим его на экран
        setSize(400, 130);
        setVisible(true);
    }
    public static void main(String[] args) { new TextField(); }
}