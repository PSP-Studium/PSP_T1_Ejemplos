package es.studium.Ejemplos;
public class Ejemplo03Thread implements Runnable
{
	public Ejemplo03Thread()
	{
		super();
	}
	public static void main(String[] args)
	{
		//Creamos e iniciamos los hilos
		new Thread(new Ejemplo03Thread(),"Uno").start();
		new Thread(new Ejemplo03Thread(),"Dos").start();
		new Thread(new Ejemplo03Thread(),"Tres").start();
		new Thread(new Ejemplo03Thread(),"Cuatro").start();
		System.out.println("Termina el programa principal");
	}
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Paso "+ i + " del proceso "+ Thread.currentThread().getName());
		}
		System.out.println("Termina el thread "+ Thread.currentThread().getName());
	}
}
