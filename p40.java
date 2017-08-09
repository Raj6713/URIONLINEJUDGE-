
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main 
{
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	int month;
	month=Integer.parseInt(input.readLine());
	switch(month)
	{
		case 1:
		System.out.printf("Janruary\n");
		break;

		case 2:
		System.out.printf("February\n");
		break;

		case 3:
		System.out.printf("March\n");
		break;

		case 4:
		System.out.printf("April\n");
		break;

		case 5:
		System.out.printf("May\n");
		break;

		case 6:
		System.out.printf("June\n");
		break;

		case 7:
		System.out.printf("July\n");
		break;

		case 8:
		System.out.printf("August\n");
		break;

		case 9:
		System.out.printf("September\n");
		break;

		case 10:
		System.out.printf("October\n");
		break;

		case 11:
		System.out.printf("November\n");
		break;

		case 12:
		System.out.printf("December\n");
		break;
	}
}