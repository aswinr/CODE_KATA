
import java.util.InputMismatchException;
import java.util.Scanner;
public class oddOrEven
{
public static void main(String[] args)
{
try {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sc.close();
if(((n/2)*2)==n)
	System.out.println(It is a even integer);

else
	System.out.println(It is a odd Integer);

}
catch(InputMismatchException e){
	System.out.println(It is not a integer);
}



}
}