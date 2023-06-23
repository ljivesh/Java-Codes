import java.awt.*;
import java.awt.event.*;
import javax.script.*;

public class Calculator extends Frame implements ActionListener {

    private TextField displayField;

    private String currentInput;
    private double result;

    public Calculator() {
        currentInput = "";
        result = 0.0;

        // Set up the frame
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        // Create the display field
        displayField = new TextField();
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);

        // Create the buttons
        Panel buttonPanel = new Panel(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        // Add a window listener to handle closing the frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();

        if (command.equals("=")) {
            calculateResult();
        } else {
            currentInput += command;
            displayField.setText(currentInput);
        }
    }

    private void calculateResult() {
        try {
            result = evaluateExpression(currentInput);
            displayField.setText(String.valueOf(result));
            currentInput = "";
        } catch (Exception e) {
            displayField.setText("Error");
            currentInput = "";
        }
    }

    private double evaluateExpression(String expression) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        try {
            return (double) engine.eval(expression);
        } catch (ScriptException e) {
            System.out.println("Error evaluating expression: " + expression);
            e.printStackTrace();
            return 0.0; // Return a default value in case of an error
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }
}
