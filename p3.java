/*Read two integer values, in this case, 
the variables A and B. After this, calculate the sum between them
 and assign it to the variable SOMA. Write the value of this variable.*/
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.IOException;
 public class p3 
 {
 	public static void main(String[] args) throws IOException
 	{
 		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
 		String s=null;
 		int a,b,soma;
 		s=input.readLine();
 		a=Integer.parseInt(s);
 		s=input.readLine();
 		b=Integer.parseInt(s);
 		soma=a+b;
 		System.out.printf("SOMA = %d\n",soma);

 	}
 }