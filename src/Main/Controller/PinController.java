package Main.Controller;

import Main.Model.Pin;

public class PinController {
    private Pin pinModel;

    public PinController(Pin pinModel){
        this.pinModel = pinModel;
    }

    public boolean checkPin(int pin) {

        return pinModel.getPin() == pin;
    }
}
