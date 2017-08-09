
/*
Read 3 floating-point numbers. After, print the roots of bhaskara’s formula. If it's 
impossible to calculate the roots because a division by zero or a square root of a negative number, presents the message “Impossivel calcular”.

*/
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		double a,b,c,d;
		s=input.readLine();
		a=Double.parseDouble(s.split(" ")[0]);
		b=Double.parseDouble(s.split(" ")[1]);
		c=Double.parseDouble(s.split(" ")[2]);
        d=Math.pow(b,2)-4*a*c;
        if(d<0 || a==0)
        {
             System.out.printf("Impossivel calcular\n");
        }
        else
        {
        	double e;
        	e=Math.sqrt(d);
        	System.out.printf("R1 = %.5f\nR2 = %.5f\n",(-b+e)/(2*a),(-b-e)/(2*a));
        }
	}
}