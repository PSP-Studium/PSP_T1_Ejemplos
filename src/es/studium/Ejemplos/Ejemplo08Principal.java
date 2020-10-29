package es.studium.Ejemplos;
import java.io.IOException;
public class Ejemplo08Principal {
	public static void main(String[] args) throws IOException, InterruptedException
	{
		try
		{
			//Ruta y argumentos para lanzar aplicación
			String arg1 = "java";
			String arg2 = "-jar";
			String arg3 = "C:\\Users\\Alvca\\Desktop\\Ejemplo08Generador.jar";
			String[] param = { arg1, arg2, arg3 };
			Process process = new ProcessBuilder(param).start();
			int retorno = process.waitFor();
			System.out.println("Se obtuvo un " + retorno);
		}
		catch (IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		catch (InterruptedException e)
		{
			System.out.println("Ejecución interrumpida: " + e.getMessage());
		}
	}
}
