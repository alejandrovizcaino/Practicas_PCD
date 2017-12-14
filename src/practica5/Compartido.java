package practica5;

/**
 *
 * @author Alejandro
 */
public class Compartido {
    
    private int numlectores = 0;
    private boolean hayescritor = false;
    
   public synchronized void entra_lector(int id) throws InterruptedException{
        //esperar si hayescritor = true;
        //numlectores++
        System.out.println("Lector "+id+" esperando");
        if(hayescritor) wait();
        System.out.println("Lector "+id+" entra en Sección Crítica");
        numlectores++;
    }
   public synchronized void sale_lector(int id){
       numlectores--;
       System.out.println("Lector "+id+" sale de la Sección Crítica");
       if (numlectores == 0) notifyAll(); //despierto a los posibles escritores esperando
   }
   public synchronized void entra_escritor(int id) throws InterruptedException{
        System.out.println("Escritor "+id+" esperando");
        if ((hayescritor) || (numlectores > 0)) wait();
        System.out.println("Escritor "+id+" entra en Sección Crítica");
        hayescritor=true;
   }
   public synchronized void sale_escritor(int id){
       hayescritor=false;
       System.out.println("Escritor "+id+" sale de la Sección Crítica");
       notifyAll();
   }
}

