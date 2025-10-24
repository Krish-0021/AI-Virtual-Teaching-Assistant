
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIHandler {
    private JTextArea chatArea;
    private JTextField inputField;
    private VirtualAssistant assistant;

    public GUIHandler() {
        assistant = new VirtualAssistant();
    }

    public void createAndShowGUI() {
        JFrame frame = new JFrame("AI Teaching Assistant");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        chatArea = new JTextArea();
        chatArea.setEditable(false);

        inputField = new JTextField();
        inputField.addActionListener(e -> handleInput());

        frame.add(new JScrollPane(chatArea), BorderLayout.CENTER);
        frame.add(inputField, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private void handleInput() {
        String userInput = inputField.getText();
        chatArea.append("You: " + userInput + "\n");
        String response = assistant.processQuery(userInput);
        chatArea.append("Assistant: " + response + "\n\n");
        inputField.setText("");
    }
}
