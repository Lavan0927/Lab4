import java.util.Scanner;

public class SquareTest
{

	public static void main( String args[] )
	{
		Square square1 = new Square(1.0);
		
		Scanner input = new Scanner(System.in);
		double sidelen;	

		System.out.print("Side Length of Square: ");
		sidelen = input.nextDouble();
		System.out.print("\n");

		square1.setside(sidelen);
		square1.displayOut();

	}
}
