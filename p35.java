/*
Read the start time and end time of a game, in hours and minutes (initial hour, initial minute, final hour, final minute).
 Then print the duration of the game, knowing that the game can begin in a day and finish in another day,
Obs.: With a maximum game time of 24 hours and the minimum game time of 1 minute.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		int startHour,startMinute,endHour,endMinute,totalHour,totalMinute;
		s=input.readLine();
		startHour=Integer.parseInt(s.split(" ")[0]);
		startMinute=Integer.parseInt(s.split(" ")[2]);
		endHour=Integer.parseInt(s.split(" ")[1]);
		endMinute=Integer.parseInt(s.split(" ")[3]);
        if(startMinute<endMinute)
        {
          totalMinute=
        }
        else
        {

        }


	}
}