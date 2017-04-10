
import java.util.InputMismatchException;
import java.util.Scanner;
public class positiveOrNegative
{
public static void main(String[] args)
{
try {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sc.close();
if(n<0){
	System.out.println("It is a negative integer");
}
else if(n>0){
	System.out.println("It is a positive integer");
}
else
	System.out.println("you have entered a zero");

}
catch(InputMismatchException e){
	System.out.println("It is not a integer");
}



}
}