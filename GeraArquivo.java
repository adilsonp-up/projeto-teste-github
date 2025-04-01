import java.io.*;

public class GeraArquivo {

	public static void main (String[] args) throws Exception{

		for (int i = 0; i < 1000; i++){

			PrintStream ps = new PrintStream("ArquivoTesteFinal-" + i + ".txt");
			ps.println("ArquivoTesteFinal-" + i + ".txt");
			ps.close();

		}

	}






}