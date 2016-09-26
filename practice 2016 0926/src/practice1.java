import java.util.Scanner;
public class practice1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int a=scn.nextInt();
if(a<=600){
	System.out.print(a*0.5);
}else{
	if(a>1200){
	System.out.print(a*0.5*0.79);	
	}else{
		System.out.print(a*0.5*0.9);
	}
		
}	
}
}	

	
	
