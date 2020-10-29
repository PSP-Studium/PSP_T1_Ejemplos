package es.studium.Ejemplos;

public class Ejemplo01Thread extends Thread
{
	String nombre;
	int retardo;
	// Constructor
	public Ejemplo01Thread(String n, int r)
	{
		nombre = n;
		retardo = r;
	}
	// Método run
	public void run()
	{
		try
		{
			Thread.sleep(retardo);
		}
		catch(Exception e){}
		System.out.println("Hola mundo! "+ nombre+" "+retardo);
	}
	// Programa principal
	public static void main(String[] args)
	{
		// Creamos los Hilos
		Ejemplo01Thread t1 = new Ejemplo01Thread("Hilo 1 con retardo",(int)(Math.random()*2000));
		Ejemplo01Thread t2 = new Ejemplo01Thread("Hilo 2 con retardo",(int)(Math.random()*2000));
		Ejemplo01Thread t3 = new Ejemplo01Thread("Hilo 3 con retardo",(int)(Math.random()*2000));
		Ejemplo01Thread t4 = new Ejemplo01Thread("Hilo 4 con retardo",(int)(Math.random()*2000));
		// Arrancamos los hilos
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
