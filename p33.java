/*
Read 3 double numbers (A, B and C) representing the sides of a triangle and arrange them in decreasing order,
 so that the side A is the biggest of the three sides. Next, determine the type of triangle that they can make,
  based on the following cases always writing an appropriate message:
if A ≥ B + C, write the message: NAO FORMA TRIANGULO
if A2 = B2 + C2, write the message: TRIANGULO RETANGULO
if A2 > B2 + C2, write the message: TRIANGULO OBTUSANGULO
if A2 < B2 + C2, write the message: TRIANGULO ACUTANGULO
if the three sides are the same size, write the message: TRIANGULO EQUILATERO
if only two sides are the same and the third one is different, write the message: TRIANGULO ISOSCELES
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
public class Main 

{
	

	 public static void sorter(double array[])
	 {
	 	int n=array.length;
	 	int i,j;
	 	double key;
	 	for(i=1;i<n;i++)
	 	{
	 		key=array[i];
	 		j=i-1;
	 		while(j>=0 && array[j]>key)
	 		{
	 			array[j+1]=array[j];
	 			j=j-1;
	 		}
	 		array[j+1]=key;
	 	}
	 }

	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		double[] arr=new double[3];
		double a,b,c;
		s=input.readLine();
		for(i=0;i<3;i++)
			arr[i]=Double.parseDouble(s.split(" ")[i]);
		sorter(arr);
        a=arr[0],b=arr[1],c=arr[2];

        if(a>=b+c)
        	System.out.printf("NAO FORMA TRIANGULO\n");
        if(Math.pow(a,2)==Math.pow(b,2)+Math.pow(c,2))
        	System.out.printf("TRIANGULO RETANGULO\n");
        if(Math.pow(a,2)>Math.pow(b,2)+Math.pow(c,2))
        	System.out.printf("TRIANGULO OBTUSANGULO\n");
        if(Math.pow(a,2)<Math.pow(b,2)+Math.pow(c,2))
        	System.out.printf("TRIANGULO ACUTANGULO\n");
        if(a==b && a==c)
        	System.out.printf("TRIANGULO EQUILATERO\n");
        if((a==b && a!=c) ||(b==c && b!=a) ||(c==a &&c!=b))
        	System.out.printf("TRIANGULO ISOSCELES\n");
	}
}