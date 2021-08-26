import java.util.Scanner;

class Cuadrado {
    private Coord c;
    private int lado;
    public Cuadrado(Coord c, int lado) {
        this.c = c;
        this.lado = lado;
    }
    public void Traslacion(Coord tra) {  // Complete los parámetros requeridos
        c.setX(tra.getX()+ c.getX());
        c.setY(tra.getY()+ c.getY());
    }
    public void Escalado(int sc) {  // Complete los parámetros requeridos
        lado = (int) (lado *(1+ sc/100.0f));
    }
    public void Rotacion() {  // Complete los parámetros requeridos
    }
}
