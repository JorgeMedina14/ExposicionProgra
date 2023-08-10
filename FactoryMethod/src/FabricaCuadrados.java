public class FabricaCuadrados implements FabricaFormas{
    @Override
    public Forma DibujarForma() {
        return new Cuadrado();
    }
}
