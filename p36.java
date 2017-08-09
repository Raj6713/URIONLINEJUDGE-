
/*The company ABC decided to give a salary increase to its employees, according to the following table:*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		s=input.readLine();
		double salary,newSalary,f1,f2,f3,f4,f5,fn;
		f1=0.15;f2=0.12;f3=0.10;f4=0.07;f5=0.04;
		salary=Double.parseDouble(s);
		if(salary>0.0 && salary<=400.00)
                   newSalary=salary*(1+f1);fn=f1;
        else if(salary>=400.01 && salary<800.00)
        	newSalary=salary*(1+f2);fn=f2;
        else if(salary>=800.01 && salary<=1200.00)
        	newSalary=salary*(1+f3);fn=f3;
        else if(salary>=1200.01 && salary<=2000.00)
        	newSalary=salary*(1+f4);fn=f4;
        else if(salary>=2000.01)
        	newSalary=salary*(1+f5);fn=f5;
        System.out.printf("Novo salario: %.2f\n",newSalary);
        System.out.printf("Reajuste ganho: %.2f\n",newSalary-salary);
        System.out.printf("Em percentual: %d\n",(int)(100*fn));

	}
}