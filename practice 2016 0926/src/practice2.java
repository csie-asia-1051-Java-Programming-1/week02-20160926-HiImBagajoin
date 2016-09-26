import java.util.Scanner;
public class practice2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
int a=scn.nextInt();
int b=scn.nextInt();
if((a*a+b*b)<10000){
	System.out.print("Yes");
}else{
	System.out.print("NO");
}
	}

}
