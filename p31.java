
/*Write a program which will check for possibility of the triangle*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
	public static boolean isbool(double num1,double num2,double num3)
	{
     if(((num1+num2)>num3)&&((num2+num3)>num1)&&((num3+num1)>num2))
     	return true;
     else 
     	return false;
	}

	
	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		s=input.readLine();
		double a,b,c;
		boolean triangle;
		a=Double.parseDouble(s.split(" ")[0]);
		b=Double.parseDouble(s.split(" ")[1]);
		c=Double.parseDouble(s.split(" ")[2]);
        triangle=isbool(a,b,c);
        if(triangle)
        {
         System.out.printf("Perimetro = %.1f\n",a+b+c);
        }
        else
        {
        	System.out.printf("Area = %.1f\n"((a+b)/2)*c);

        }
	}
}