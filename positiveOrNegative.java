import java.util.Scanner;
public class positiveOrNegative
{
public static void main(String[] args)
{
try {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
}
if(n<0){
	Systen.out.println("It is a negative integer");
}
else if(n>0){
	Systen.out.println("It is a positive integer");
}
else
	Systen.out.println("you have entered a zero");


catch(InputmismatchException e){
	System.out.println("It is not a integer")
}



}
}