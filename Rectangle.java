public class Rectangle
{
	private float length;
	private float width;

	public Rectangle( float length, float width )
	{
		this.length = length;
		this.width = width;
	
	}

	public void setlength ( float length )
	{
		if( (length >= 0) && (length < 20) ){
			this.length = length;
		}
	}

	public float getlength ()
	{
		return length;
	}

	public void setwidth ( float width )
	{
		if( (width >= 0) && (width < 20) ){
			this.width = width;
		}

	}

	public float getwidth ()
	{
		return width;
	}

	public void displayOut() 
	{
		//int perimeter = 2 * getlength () + 2 * getwidth ();
		//int area = getlength () * getwidth ();
		System.out.print("Length: ");
		System.out.printf("%.2f" , getlength () );
		System.out.print("\nWidth: ");
		System.out.printf("%.2f" , getwidth () );
		System.out.print("\nPerimeter: ");
		System.out.printf("%.2f" , ( 2 * getlength () + 2 * getwidth () ) );
		System.out.print("\nArea: ");
		System.out.printf("%.2f" , ( getlength () * getwidth () ) );
		System.out.print("\n");
		
	}	
}

	