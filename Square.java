public class Square
{
	private double side;

	public Square( double side )
	{
		this.side = side;
	
	}

	public void setside ( double side )
	{
		if( side > 0) {
			this.side = side;
		}
	}

	public double getside ()
	{
		return side;
	}


	public void displayOut() 
	{
		System.out.println("side: " + getside () );

		System.out.println("Area: " + ( getside () * getside () ) );
		
	}	
}

	