package factory;

import button.Boton;
import button.BotonWindows;
import checkbox.CheckBox;
import checkbox.CheckBoxWindows;

public class FactoryWindows implements AbstarctFactory{
    @Override
    public Boton crearboton() {
        return new BotonWindows();
    }

    @Override
    public CheckBox crearchecbox() {
        return new CheckBoxWindows();
    }
}
