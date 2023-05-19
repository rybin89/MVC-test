package Main.View;

import javax.swing.*;
import java.awt.*;

public class UserView extends JFrame {
    private JTextArea text;
    private JButton sendBtn;
    private JLabel info;
    public void init(){
        setSize(400,300);
        text = new JTextArea();
        sendBtn = new JButton("Send");
        info = new JLabel("Info");
        add(text, BorderLayout.CENTER);
        add(sendBtn,BorderLayout.SOUTH);
        add(info,BorderLayout.NORTH);

        sendBtn.addActionListener(e->{
            int pin;
            String textPin = this.text.getText();
            pin = Integer.parseInt(textPin);
            info.setText("Ok: " + pin);
        });

        setVisible(true);
    }
}
