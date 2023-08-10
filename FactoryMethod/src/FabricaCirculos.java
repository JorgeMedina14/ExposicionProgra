public class FabricaCirculos implements FabricaFormas{
    @Override
    public Forma DibujarForma() {
        return new Circulo();
    }
}
