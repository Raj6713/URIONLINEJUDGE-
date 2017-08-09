/*
Peter is organizing an event in his University.
 The event will be in April month, beginning and finishing within April month.
  The problem is: Peter wants to calculate the event duration in seconds, knowing obviously the begin and the end time of the event.
You know that the event can take from few seconds to some days, so, 
you must help Peter to compute the total time, in seconds, corresponding to duration of the event.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s1,s2,s;
		s1=null;
		s2=null;
		s=null;
		int hour1,hour2,min1,min2,sec1,sec2,totalHour,totalMin,totalSec;
		s1=input.readLine();
		s=input.readLine();
		hour1=Integer.parseInt(s.split(" ")[0]);
		min1=Integer.parseInt(s.split(" ")[2]);
		sec1=Integer.parseInt(s.split(" ")[4]);
		s2=input.readLine();
		s=input.readLine();
		hour2=Integer.parseInt(s.split(" ")[0]);
		min2=Integer.parseInt(s.split(" ")[2]);
		sec2=Integer.parseInt(s.split(" ")[4]);
        if(sec1<sec2)
        	totalSec=sec2-sec1;
        else
        	totalSec=()


	}
}