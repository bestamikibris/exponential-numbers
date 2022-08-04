import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	int x, y, i, total = 1;
	
	Scanner input = new Scanner(System.in);
	System.out.print("üssü alınacak sayıyı giriniz : ");
	x = input.nextInt();
	System.out.print("üs olacak sayıyı giriniz : ");
	y = input.nextInt();
	
	for(i = 1; i <= y; i++){
	    total *= x;
	}
	System.out.print(x+" üssü "+y+" = " +total);
  }
}
