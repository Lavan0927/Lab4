
public class Task2 {

public static void main( String args[] )
{
    
    for (int i = 1;i<6;i++){
    System.out.print(i + " ");
    int fact = 1;
        for(int j=1;j<(i+1);j++){
           fact = fact * j;
        }
    System.out.println(fact);
    }
}
    
}
