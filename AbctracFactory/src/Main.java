import button.Boton;
import checkbox.CheckBox;
import factory.AbstarctFactory;
import factory.FactoryMac;
import factory.FactoryWindows;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AbstarctFactory abs;
        int loquieromuchoinge;

        System.out.println("1. MAC");
        System.out.println("2. Windows");
        System.out.println("soy pobre :c");
        Scanner scanner = new Scanner(System.in);
        loquieromuchoinge = scanner.nextInt();

        if (loquieromuchoinge == 1){
            abs = new FactoryMac();

        } else{
            abs = new FactoryWindows();

        }

        Boton boton = abs.crearboton();
        boton.dibujarboton();

        CheckBox checkbox = abs.crearchecbox();
        checkbox.pintarcheckbox();


    }
}