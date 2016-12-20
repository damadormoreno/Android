import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorLocalizaciones {

	public static void main(String[] args) {
		System.out.println("Abriendo Socket para enviar localizaci�n aleatoria...");
		try {
			ServerSocket server = new ServerSocket(6000);
			while (true) {
				System.out.println("Esperando petici�n.");
				Socket socket = server.accept();
				System.out.println("Petici�n recibida");
				HiloCliente hiloCliente = new HiloCliente(socket);
				hiloCliente.start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}