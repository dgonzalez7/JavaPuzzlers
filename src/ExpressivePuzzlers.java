import java.math.BigDecimal;

public class ExpressivePuzzlers {

	public static void main(String[] args) 
	{
		// Oddity 
		for (int i = -10; i <= 10; i++)
		{
			System.out.println("i=" + i + " isOdd= " + isOdd(i));
		}
		
		// Time for a Change
		timeForAChange();
		
		// Long Division
		longDivision();
		
		// Joy of Hex
		joyOfHex();
		
		// Multicast
		multicast();
		
		// Swap Meat
		swapMeat();
	}

	public static boolean isOdd(int i) 
	{
	    return (i & 1) != 0;
	}
	
	private static void timeForAChange() 
	{
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
		
	}

	private static void longDivision() 
	{
        final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
	}
	
	private static void joyOfHex() 
	{
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
	}
	
	private static void multicast() 
	{
		System.out.println((int) (char) (byte) -1);
	}


	private static void swapMeat() 
	{
	       int x = 1984;  // (0x7c0)
	       int y = 2001;  // (0x7d1)
	       x ^= y ^= x ^= y;        
	       System.out.println("WRONG:  x = " + x + "; y = " + y);
	       
	       int x2 = 1984;  // (0x7c0)
	       int y2 = 2001;  // (0x7d1)
	       y2 = (x2 ^= (y2 ^= x2)) ^ y2;      
	       System.out.println("Right but silly:  x2 = " + x2 + "; y2 = " + y2);
	       
	}
	
}
