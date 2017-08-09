

/*
Calculate a car's average consumption being provided the total distance traveled (in Km) 
and the spent fuel total (in liters).
*/
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		s=input.readLine();
		Integer distance=Integer.parseInt(s);
		s=input.readLine();
		Double gallons=Double.parseDouble(s);
		Double mileage=distance/gallons;
		System.out.printf("%.3f km/l\n",mileage);
	}
}