
/*
Read four numbers (N1, N2, N3, N4), which one with 1 digit after the decimal point, corresponding to 4 scores obtained by a student.
 Calculate the average with weights 2, 3, 4 e 1 respectively, for these 4 scores and print the message "Media: " (Average), followed
 by the calculated result. If the average was 7.0 or more, print the message "Aluno aprovado." (Approved Student).
  If the average was less than 5.0, print the message: "Aluno reprovado."
 (Reproved Student). If the average was between 5.0 and 6.9, including these, the program must print the message "Aluno em exame."
 (In exam student).

In case of exam, read one more score. Print the message "Nota do exame: " (Exam score) followed by the typed score.
 Recalculate the average (sum the exam score with the previous calculated average and divide by 2) and print the message “Aluno aprovado.”
 (Approved student) in case of average 5.0 or more) or "Aluno reprovado." (Reproved student) in case of average 4.9 or less.
 For these 2 cases (approved or reproved after the exam) print the message "Media final: " (Final average) followed by the final average for
  this student in the last line.
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String s=null;
        double subject1,subject2,subject3,subject4,avg;
        s=input.readLine();
        subject1=Double.parseDouble(s.split(" ")[0]);
        subject2=Double.parseDouble(s.split(" ")[1]);
        subject3=Double.parseDouble(s.split(" ")[2]);
        subject4=Double.parseDouble(s.split(" ")[3]);
        avg=(2.0*subject1+3.0*subject2+4.0*subject3+1.0*subject4)/(2.0+3.0+4.0+1.0);
        if(avg>=7.0)
            System.out.printf("Media: %.1f\nAluno aprovado.\n",avg);
        else if(avg<5.0)
            System.out.printf("Media: %.1f\nAluno reprovado.\n",avg);
        else if(avg>=5.0 && avg<=6.9)
        {
            System.out.printf("Media: %.1f\nAluno em exame.\n",avg);
            double subject5=Double.parseDouble(input.readLine());
            System.out.printf("Nota do exame: %.1f\n",subject5);
            avg=(avg+subject5)/2;
            if(avg>5.0)
                System.out.printf("Aluno aprovado.\nMedia final: %.1f\n",avg);
            else if(avg<=4.9)
                System.out.printf("Aluno reprovado.\nMedia final: %.1f\n",avg);
        }
    }
}