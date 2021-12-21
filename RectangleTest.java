import java.util.Scanner;

public class RectangleTest
{

	public static void main( String args[] )
	{
		Rectangle rectangle1 = new Rectangle(1,1);
		
		System.out.println("1. Set Length ");
		System.out.println("2. Set Width ");
		System.out.println("3. Exit ");

		Scanner input = new Scanner(System.in);
		int choice;
		float len;
		float wid;	

		System.out.print("Choice: ");	
		choice = input.nextInt();

		while ( choice != 3 ){
			if (choice == 1 ){
				System.out.print("Enter Length: ");
				len = input.nextFloat();
				rectangle1.setlength(len);
				rectangle1.displayOut();
			}

			if (choice == 2 ){
				System.out.print("Enter Width: ");
				wid = input.nextFloat();
				rectangle1.setwidth(wid);
				rectangle1.displayOut();
			}
                    System.out.print("Choice: ");	
                    choice = input.nextInt();
		}



	}
}
