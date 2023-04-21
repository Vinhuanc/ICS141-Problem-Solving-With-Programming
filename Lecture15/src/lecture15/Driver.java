package lecture15;

public class Driver {

	public static void  stars2     (int n)    {
        if (n < 1)
              System.out.print("!");
        else  {
              stars2(n-1);
              System.out.print("*");
              System.out.print("zzzz");
        }
}
	public static void main(String[] args) {
//			stars2(5);

	}

}
