package clientPackage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		System.out.println("Je suis un client ");
		Socket client = new Socket("localhost",1234);
		System.out.println("Je suis un clinet connecté ");
		InputStream is = client.getInputStream();
		OutputStream os = client.getOutputStream();
		int nb; 
		System.out.println("Donner un nombre : ");
		Scanner scanner = new Scanner(System.in);
		nb = scanner.nextInt();
		os.write(nb);
		System.out.println(nb+" * 5 = "+is.read());
		System.out.println(nb+" + 5 = "+is.read());
		System.out.println("Deconnexion");
		client.close();
		scanner.close();
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}
