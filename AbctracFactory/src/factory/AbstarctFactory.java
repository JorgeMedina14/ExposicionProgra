package factory;

import button.Boton;
import checkbox.CheckBox;

public interface AbstarctFactory {
    Boton crearboton();
    CheckBox crearchecbox();

}
