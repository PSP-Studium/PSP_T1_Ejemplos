package es.studium.Ejemplos;
import java.io.IOException;
import java.util.Arrays;
public class Ejemplo04RunProcess
{
	public static void main(String[] args) throws IOException
	{
		if (args.length <= 0)
		{
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		ProcessBuilder pb = new ProcessBuilder(args);
		try
		{
			System.out.println("Ejecutando " + Arrays.toString(args));
			Process process = pb.start();
			// Esperamos que termine el proceso
			int retorno = process.waitFor();
			System.out.println("La ejecuci�n de " + Arrays.toString(args) +
					" devuelve " + retorno);
		}
		catch (IOException ex)
		{
			System.err.println("Excepci�n de E/S!!");
			System.exit(-1);
		}
		catch (InterruptedException ex)
		{
			System.err.println("El proceso hijo finaliz� de forma err�nea");
			System.exit(-1);
		}
	}
}