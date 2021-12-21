public class DateTest
{

	public static void main( String args[] )
	{
		Date date1 = new Date(7,4,2004);
		System.out.print("The intial date is : ");
		date1.displayDate();
		date1.setmonth ( 11 );
		date1.setday ( 1);
		date1.setyear ( 2003 );

		System.out.print("Date with new values is : ");
		date1.displayDate();
	}
}
