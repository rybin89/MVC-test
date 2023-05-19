package Main;

import Main.Controller.PinController;
import Main.Model.Pin;
import Main.View.PinView;
import Main.View.UserView;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Pin pinModel = new Pin();
        PinController pinController = new PinController(pinModel);
        PinView userView = new PinView(pinController);
        SwingUtilities.invokeLater(()->{

            userView.init();
        });

    }
}
