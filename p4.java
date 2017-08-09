/*Read two floating points' values of double precision A and B, corresponding to 
two student's grades. After this, calculate the student's average, considering that grade A has
 weight 3.5 and B has weight 7.5. Each grade can be from zero to ten, always with one digit after the decimal point. Don’t forget to 
print the end of line after the result, otherwise you will receive “Presentation Error”. Don’t forget the space before and after the equal sign.*/
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		double num1, num2, media;
		s=input.readLine();
		num1=Double.parseDouble(s);
		s=input.readLine();
		num2=input.parseDoubel(s);
		media=(3.5*num1+7.5*num2)/(3.5+7.5);
		System.out.printf("MEDIA = %.5f\n",media);
	}

}