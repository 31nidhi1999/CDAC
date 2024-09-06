package assigment2;

public class LongExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		/** how many Long used to stored?
		System.out.println("Long size "+Long.BYTES);*/
		
		/** Range of Long
		System.out.println("Min range of Long :"+Long.MIN_VALUE);
		System.out.println("Min range of Long :"+Long.MAX_VALUE);*/
		
		/** Longs to string
		 long b =2147483647 ;
		System.out.println("Long to string via boxing:"+Long.toString(b));*/
		
		/**String to Longs
		String strStatus="21483640";
		System.out.println("String to long via Unboxinf :"+Long.parseLong(strStatus));*/
		
		/*
		//String to Long with alphabets
		String strNumber="Ab12Cd3";
		System.out.println("Alpbha numeric string longo Long "+Long.parseLong(strNumber));*/
		
		/**
		long c = 124455456;
		System.out.println("Long using valueof() via boxing :"+Long.valueOf(c));*/
		
		/**string to Long using number and valueof()
		String stftatus1="9644455";
		System.out.println("String to long with valueOf()   :"+Long.valueOf(stftatus1));*/
		
		//long a = 1123 , b=9845;
		/**System.out.println("Min value :"+Long.min(a, b));
		System.err.println("Max value :"+Long.max(a, b));*/
		
		//System.out.println("Sum :"+Long.sum(a, b));
		
		/*
		long a = 14560;
		System.out.println("Binary :"+Long.toBinaryString(a));
		System.out.println("Octal :"+Long.toOctalString(a));
		System.out.println("Hex :"+Long.toHexString(a));*/
		
		/**Long to other primitive
		long d =12787484;
		byte c = (byte)d;
		System.out.println("Int "+Long.valueOf(d));
		System.err.println("Long to byte via narrowing :"+c);
		System.out.println("Byte "+Byte.valueOf(c));
		System.out.println((char)c);
		System.out.println("float "+Float.valueOf(d));
		System.out.println("Double "+Double.valueOf(d));
		System.out.println("Long "+Long.valueOf(d));*/
		
		/**other PT to Long*/
		short x=1294;
		byte y=127;
		float z=5683.05f;
		double w=89647562.00058d;
		long s = 895647523l;
		char c = 'n';
		
		System.out.println("Short to Long :"+x);//widing
		System.out.println("short to longeger :"+Long.valueOf(x));
		System.out.println("Byte to Long :"+Long.valueOf(y));
		System.out.println("Float to Long :"+(long)z);
		System.out.println("Double to Long :"+(long)w);
		System.out.println("Long to Long :"+(long)s);
		System.out.println("Char  to Long :"+(long)c);
	}

}
