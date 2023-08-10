
public class Main {
    public static void main(String[] args) {
        FabricaFormas fabricacirculos = new FabricaCirculos();
        Forma circulo = fabricacirculos.DibujarForma();
        circulo.dibujar(); // Salida: Dibujando un círculo

        FabricaFormas fabricacuadrados = new FabricaCuadrados();
        Forma cuadrado = fabricacuadrados.DibujarForma();
        cuadrado.dibujar(); // Salida: Dibujando un cuadrado
}
}