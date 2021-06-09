import java.util.*;
public class calculator{
	public static void main(String[] args){
		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int add = 2*a+2*b;
		int diff = 2*a-2*b;
		System.out.println(add);
		System.out.println(diff);
	}
}

