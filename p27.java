
/*Write an algorithm that reads two floating values (x and y), which should represent the coordinates of a
 point in a plane. Next, determine which quadrant the point belongs, or if you are over one of the Cartesian axes or the origin (x = y = 0).
If the point is at the origin, write the message "Origem".
If the point is over X axis write "Eixo X", else if the point is over Y axis write "Eixo Y".
*/
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		s=input.readLine();
		double xPoint,yPoint;
		xPoint=Double.parseDouble(s.split(" ")[0]);
		yPoint=Double.parseDouble(s.split(" ")[1]);
		if(xPoint==0 && yPoint==0)
			System.out.println("Origem");
		else
		{
			if(xPoint==0 && yPoint!=0)
				System.out.println("Eixo Y");
			else if(xPoint!=0 && yPoint==0)
				System.out.println("Eixo X");
			else if(xPoint>0)
			{
               if(yPoint>0)
               	System.out.println("Q1");
               else 
               	System.out.println("Q4");
			}
			else if(xPoint<0)
			{
				if(yPoint>0)
               	System.out.println("Q2");
               else 
               	System.out.println("Q3");

			}
		}
	}
}