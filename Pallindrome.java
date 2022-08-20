package bg;
import java.util.*;
public class Pallindrome {
public static void main(String args[]) {
int sum=0,rem=0,n,no;
System.out.println("Enter a Number");
Scanner s=new Scanner(System.in);
n=s.nextInt();
no=n;
while(n>0) {
	rem=n%10;
	sum=(sum*10)+rem;
	n=n/10;
}
if(no==sum) {
	System.out.println("P");
}
else{
	System.out.println("NP");

}

}
}
