
/*
Read the four values corresponding to the x and y axes of two points in the plane, p1 (x1, y1) and p2 (x2, y2) 
and calculate the distance between them, showing four decimal places after the comma, according to the formula:
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double x1,y1,x2,y2,dist;
        String s=null;
        s=input.readLine();
        x1=Double.parseDouble(s.split(" ")[0]);
        y1=Double.parseDouble(s.split(" ")[1]);
        s=input.readLine();
        x2=Double.parseDouble(s.split(" ")[0]);
        y2=Double.parseDouble(s.split(" ")[1]);
        dist=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.printf("%.4f\n",dist);        
	}
}