import java.util.Scanner;

class Cuadrado {
    private Coord c;
    private int lado;
    private double grad;
    public Cuadrado(Coord c, int lado, float grad) {
        this.c = c;
        this.lado = lado;
        this.grad = grad;
    }
    public void Traslacion(Coord tra) {  // Complete los parámetros requeridos
        c.setX(tra.getX()+ c.getX());
        c.setY(tra.getY()+ c.getY());
    }
    public void Escalado(int sc) {  // Complete los parámetros requeridos
        lado = (int) (lado *(1+ sc/100.0f));
    }
    public void Rotacion(double rt) {  // Complete los parámetros requeridos
        grad = c.getX() * Math.cos(rt);
    }
}
