// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     Persona pers = new Persona("Allan",18);
        Persona a = pers.clone();
        a.setNombre("Esvin");
        System.out.println(pers);
        System.out.println(a);

    }
}