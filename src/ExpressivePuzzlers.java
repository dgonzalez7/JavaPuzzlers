
public class ExpressivePuzzlers {

	public static void main(String[] args) 
	{
		// Joy of Hex
		joyOfHex();
		
		// Multicast
		multicast();
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
