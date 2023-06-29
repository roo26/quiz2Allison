
package Quiz;
import java.util.Scanner;

class RectanguloException extends Exception {
    public RectanguloException(String message) {
        super(message);
    }
}
 public class Rectangulo {
    private int ancho;
    private int altura;

    public Rectangulo(int ancho, int altura) throws RectanguloException {
        setAncho(ancho);
        setAltura(altura);
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) throws RectanguloException {
        if (ancho <= 0) {
            throw new RectanguloException("El ancho tiene que ser mayor que 0 ");
        }
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) throws RectanguloException {
        if (altura <= 0) {
            throw new RectanguloException("La altuta tiene que ser mayor a 0 ");
        }
        this.altura = altura;
    }

    public int calcularArea() {
        return ancho * altura;
    }
}

