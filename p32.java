
/*Write a program which will show the multiplicity of two numbers*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		s=input.readLine();
        int num1,num2;
        num1=Integer.parseInt(s.split(" ")[0]);
        num2=Integer.parseInt(s.split(" ")[1]);
        if(num2%num1==0)
        System.out.printf("Sao Multiplos\n");
        else
          System.out.printf("Nao sao Multiplos\n");		
	}
}