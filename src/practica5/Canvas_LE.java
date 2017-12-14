package practica5;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Alejandro
 */
public class Canvas_LE extends Canvas {
    
    private int capacidad;

    public Canvas_LE(int capacidad) {
        this.capacidad = capacidad;
        setSize(new Dimension(800, 400));
        this.setBackground(Color.GRAY);
    }

    @Override
    public void paint(Graphics g) {
        Image offscreen = createImage(getWidth(), getHeight());
        Graphics og = offscreen.getGraphics();
        
        
        Font f1 = new Font("Helvetica", Font.ITALIC + Font.BOLD, 20);
        og.setFont(f1);
        og.setColor(Color.BLUE);
       

        g.drawImage(offscreen, 0, 0, null);
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

    public void avisa(String mensaje) {
        //this.mensaje = mensaje;
        //repaint();
    }

    public void representa(Object[] datos, int cima, int numele) {
        /*this.datos = datos;
        this.cima = cima;
        numelementos = numele;
        repaint();*/
    }
}

