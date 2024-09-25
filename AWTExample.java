import java.awt.*;
import java.awt.event.*;

public class AWTExample extends Frame implements ActionListener {
    TextField userField;
    TextField passField;
    Label labelUser; 	
    Label labelPass; 
    Label result;
    AWTExample() {
        Frame frame = new Frame("AWT Example");
	labelUser = new Label ("Enter username");
        userField = new TextField();
	labelPass = new Label ("Enter Password");
        passField = new TextField();
        Button button = new Button("Click Me");
        result = new Label();
     	labelUser.setBounds(50, 50, 150,20);
        userField.setBounds(50, 70, 150, 20);
	labelPass.setBounds(50, 90, 150, 20);
        passField.setBounds(50, 110, 150, 20); 
        
        button.setBounds(50, 150, 80, 30); 
        button.addActionListener(this);
	result.setBounds(50, 170, 80, 50);
        
        // Add components to the frame
	frame.add(labelUser);
        frame.add(userField);
	frame.add(labelPass);
        frame.add(passField);
        frame.add(button);
	frame.add(result);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String inputText1 = userField.getText();
        String inputText2 = passField.getText();
        result.setText("Hello, " + inputText1 + "!");
    }

    public static void main(String[] args) {
        new AWTExample();
    }
}
