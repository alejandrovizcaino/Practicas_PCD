package practica5;

import java.applet.Applet;

/**
 *
 * @author Alejandro
 */
public class Applet_LE extends Applet {
    
    

    @Override
    public void init() {
        int capacidad = 10;
        Canvas_LE vista = new Canvas_LE(capacidad);
        //PilaLenta miPila = new PilaLenta(capacidad, vista);
        //h1 = new Thread(new Productor(miPila, 0));
        
        this.setSize(800, 400);
        add(vista);
    }

    @Override
    public void start() {
        //h1.start();
        
    }

    @Override
    public void stop() {
        //h1.interrupt();
        
    }
}
