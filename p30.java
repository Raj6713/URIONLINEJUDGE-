
/*Write a program which will sort three number and will print*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main
{
    public static void sorter(int array[])
    {

        int i,key,j,n;
        n=array.length;
        for( i=1;i<n;i++)
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
        int[] array=new int[3];
        int[] copyArray=new int[3];
        s=input.readLine();
        for(int i=0; i<3;i++)
            array[i]=Integer.parseInt(s.split(" ")[i]);
        copyArray=array.clone();
        sorter(array);
        for(int i=0;i<3;i++)
            System.out.printf("%d\n",array[i]);
         System.out.println();
        for(int i=0;i<3;i++)
            System.out.printf("%d\n",copyArray[i]);

    }
}