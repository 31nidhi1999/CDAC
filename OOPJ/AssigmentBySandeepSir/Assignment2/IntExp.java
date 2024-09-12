package assigment2;

public class IntExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** how many Integer used to stored?
		Integer a =127;
		System.out.println("Integer size "+Integer.BYTES);*/
		
		/** Range of Integer
		System.out.println("Min range of Integer :"+Integer.MIN_VALUE);
		System.out.println("Min range of Integer :"+Integer.MAX_VALUE);*/
		
		/** Integers to string
		 int b =2147483647 ;
		System.out.println("Integer to string via boxing:"+Integer.toString(b));
		*/
		/**String to Integers
		String strStatus="2147483640";
		System.out.println("String to int via Unboxinf :"+Integer.parseInt(strStatus));*/
		
		/**String to Integer with alphabets
		String strNumber="Ab12Cd3";
		System.out.println("Alpbha numeric string into Integer "+Integer.parseInteger(strNumber));*/
		
		/**
		int c = 124456;
		System.out.println("Integer using valueof() via boxing :"+Integer.valueOf(c));*/
		
		/**string to Integer using number and valueof()
		String stftatus1="96455";
		System.out.println("String to int with valueOf()   :"+Integer.valueOf(stftatus1));*/
		
		/**int a = 10, b=20;
		System.out.println("Min value :"+Integer.min(a, b));
		System.err.println("Max value :"+Integer.max(a, b));*/
		
		//System.out.println("Sum :"+Integer.sum(a, b));
		
		/**int a = 10;
		System.out.println("Binary :"+Integer.toBinaryString(a));
		System.out.println("Octal :"+Integer.toOctalString(a));
		System.out.println("Hex :"+Integer.toHexString(a));*/
		
		/**Integer to other primitive
		int d =124;
		byte c = (byte)d;
		System.out.println("Int "+Integer.valueOf(d));
		System.err.println("Integer to byte via narrowing :"+c);
		//System.out.println("Byte "+Byte.valueOf(c));// CTE 
		System.out.println((char)d);
		System.out.println("float "+Float.valueOf(d));
		System.out.println("Double "+Double.valueOf(d));
		System.out.println("Long "+Long.valueOf(d));*/
		
		/**other PT to Integer*/
		short x=129;
		byte y=127;
		float z=5683.05f;
		double w=89647562.00058d;
		long s = 895647523l;
		char c = 'n';
		
		System.out.println("Short to Integer :"+x);//widing
		System.out.println("short to integer :"+Integer.valueOf(x));
		System.out.println("Byte to Integer :"+Integer.valueOf(y));
		System.out.println("Float to Integer :"+(int)z);//cant use value
		System.out.println("Double to Integer :"+(int)w);//cant use value
		System.out.println("Long to Integer :"+(int)s);//cant use value
		System.out.println("Char  to Integer :"+(int)c);
		
		

	}

}
