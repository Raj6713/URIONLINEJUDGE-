/*
Write an program to read two scores of a student. Calculate and print the semester average. The program must accept only 
valid scores (a score must fit in the range [0.10]). Each score must be validated separately.
The program must print a message "novo cálculo (1-sim 2-nao)" that means "new calculate (1-yes 2-no)".
 After, the input will be (1 or 2). 1 means a new calculation, 2 means that the execution must be finished.
Input
The input file contains several positive or negative floating-point (double) values​. After the input of 2 valid scores, 
an integer number X will be read. Your program must stop when X = 2.
Output
If an invalid score is read, must be printed the message "nota inválida". When two valid scores are read, the message "media = " 
must be printed folowed by the average between these 2 scores. The message "novo cálculo (1-sim 2-nao)" must be printed after reading X.
 This message should be displayed again if the standard input number for X is less than 1 or greater than 2, as example below.
The output average must be printed with 2 digits after the decimal point.
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
 		int choice;
 		do
 		{

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
        choice=Integer.parseInt(in.readLine());
        if(choice==1)
        	choice=true;
        else if(choice==2)
            choice=false;
 	    }while(choice);

 		System.out.printf("media = %.2f\n",(marks[0]+marks[1])/2.0);
 	}
 }