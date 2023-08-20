package factory;

import button.Boton;
import button.BotonMac;
import checkbox.CheckBox;
import checkbox.CheckBoxMac;

public class FactoryMac implements AbstarctFactory{

    @Override
    public Boton crearboton() {
        return new BotonMac();
    }

    @Override
    public CheckBox crearchecbox() {
        return new CheckBoxMac();
    }
}
