
public class ExpressivePuzzlers {

	public static void main(String[] args) 
	{
		// Oddity 
		for (int i = -10; i <= 10; i++)
		{
			System.out.println("i=" + i + " isOdd= " + isOdd(i));
		}
		
		// Joy of Hex
		joyOfHex();
		
		// Multicast
		multicast();
	}

	public static boolean isOdd(int i) {
	    return (i & 1) != 0;
	}
	
	private static void joyOfHex() 
	{
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
	}
	
	private static void multicast() 
	{
		System.out.println((int) (char) (byte) -1);
	}

}
