package practica5;

/**
 *
 * @author Alejandro
 */
public class Escritor extends Thread {
    
    private Compartido comp;
    private Canvas_LE miCanvas;
    private int id;
    
    public Escritor(int id, Compartido c, Canvas_LE canvas) { 
        miCanvas = canvas;
        comp = c;
        this.id = id;
    }

    @Override
    public void run() {
        
        /*Protocolo de entrada de los escritores:
            esperar si (hayescritor or (numlectores > 0)
            hayescritor=true;
            
        Protocolo de salida de los escritores:
            hayescritor=false;
            despertar a los que esperan;*/

    }
}
