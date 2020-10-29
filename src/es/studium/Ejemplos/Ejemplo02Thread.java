package es.studium.Ejemplos;
public class Ejemplo02Thread extends Thread
{
	public Ejemplo02Thread(String cadena)
	{
		super(cadena);
	}
	public void run()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println("Paso "+ i + " del proceso "+ Thread.currentThread().getName());
		}
		System.out.println("Termina el thread "+ Thread.currentThread().getName());
	}
	public static void main(String[] args)
	{
		//Creamos los hilos y los iniciamos
		new Ejemplo02Thread("Uno").start();
		new Ejemplo02Thread("Dos").start();
		new Ejemplo02Thread("Tres").start();
		new Ejemplo02Thread("Cuatro").start();
		System.out.println("Termina el programa principal");
	}
}