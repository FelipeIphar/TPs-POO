public class Casillero {
    public Pieza pieza_local;

    public Pieza getPieza() {
        return pieza_local;
    }

    public Casillero () {
        this.pieza_local=null;
    }

    public Casillero (Pieza pieza) {
        this.pieza_local = pieza;
    }
}
