package practica5;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejandro
 */
public class Lector extends Thread {

    private Compartido comp;
    private Canvas_LE miCanvas;
    private int id;

    public Lector(int id, Compartido c, Canvas_LE canvas) {
        miCanvas = canvas;
        comp = c;
        this.id = id;
    }

    @Override
    public void run() {
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());
        int numAleatorio = r.nextInt(3000) + 1000;

        try {
            comp.entra_lector(id); //Protocolo de entrada de los hilos lectores
            // *****SECCIÓN CRÍTICA*****
            Thread.sleep(numAleatorio);
            comp.sale_lector(id); //Protocolo de salida de los hilos lectores
        } catch (InterruptedException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}