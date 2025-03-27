import java.io.*;

public class GeraArquivo {

	public static void main (String[] args) throws Exception{

		for (int i = 0; i < 1000; i++){

			PrintStream ps = new PrintStream("NewFile" + i + ".txt");
			ps.println("NewFile" + i + ".txt");
			ps.close();

		}

	}






}