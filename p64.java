/*Write a program that keep reading a password until it is valid. For each wrong password read, write the message "Senha inválida". When 
the password is typed correctly print the message "Acesso Permitido" and finished the program. The correct password is the number 2002.*/
import java.io.Bufferedeader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		while(true)
		{
			s=in.readLine();
			if(s.equals("2002"))
			{System.out.printf("Acesso Permitido\n");
		       break;
		    }
		    else
		    	System.out.printf("Senha Invalida\n");

		}
	}
}