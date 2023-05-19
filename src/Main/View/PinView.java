package Main.View;

import Main.Controller.PinController;

import javax.swing.*;
import java.awt.*;

public class PinView extends JFrame {
    private JTextArea text;
    private JButton sendBtn;
    private JLabel info;
    private PinController pinController;

   public PinView(PinController pinController){
       this.pinController = pinController;

    }
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
//            pinController.checkPin(pin);
            boolean result = pinController.checkPin(pin);
            String resultMessage;
            if(result){
                resultMessage = "Yes";
            } else {
                resultMessage = "No";
            }
            info.setText(resultMessage);

        });

        setVisible(true);
    }
}
