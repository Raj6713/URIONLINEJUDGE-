/*
Make a program that reads three floating point values: A, B and C. Then, calculate and show:
a) the area of the rectangled triangle that has base A and height C.
b) the area of the radius's circle C. (pi = 3.14159) 
c) the area of the trapezium which has A and B by base, and C by height.
d) the area of ​​the square that has side B.
e) the area of the rectangle that has sides A and B.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		double a, b, c,rectArea,cirArea,trapArea,squareArea,recArea,pi=3.14159;
		s=input.readLine();
		a=Double.parseDouble(s.split(" ")[0]);
		b=Double.parseDouble(s.split(" ")[1]);
		c=Double.parseDouble(s.split(" ")[2]);
        rectArea=(1.0/2)*(a*c);
        cirArea=pi*Math.pow(c,2);
        trapArea=((a+b)/2)*c;
        squareArea=(b*b);
        recArea=a*b;
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n",rectArea,cirArea,trapArea,squareArea,recArea);
	}
}