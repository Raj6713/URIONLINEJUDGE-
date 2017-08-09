/*
Write a program that reads two scores of a student. Calculate and print the average of these scores.
 Your program must accept just valid scores [0..10]. Each score must be validated separately.
Input
The input file contains many floating-point numbers​​, positive or negative. 
The program execution will be finished after the input of two valid scores.
Output
When an invalid score is read, you should print the message "nota invalida".
After the input of two valid scores, the message "media = " must be printed followed by the average of the student.
 The average must be printed with 2 numbers after the decimal point.
*/
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.IOException;
 public class Main 
 {
 	public static void main(String[] args) throws IOException 
 	{
 		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
 		float[] marks=new float(2);
 		float value;
 		int count=0;
 		while(true)
 		{
           value=Double.parseDouble(in.readLine());
           if(value>=0 && value<=10.00)
           {
           	marks[count]=values;
           	count++;
           }
           else
           	System.out.printf("nota invalida\n");
           if(count==1)
           	break;
 		}
 		System.out.printf("media = %.2f\n",(marks[0]+marks[1])/2.0);
 	}
 }