package assigment2;

public class FloatExpr {

	public static void main(String[] args) {
		/** how many Float used to stored?
		System.out.println("Float size "+Float.BYTES);*/
		
		/** Range of Float
		System.out.println("Min range of Float :"+Float.MIN_VALUE);
		System.out.println("Min range of Float :"+Float.MAX_VALUE);*/
		
		/** Floats to string boxing
		float b = 1274.02f;
		System.out.println("Floats to string boxinf:"+Float.toString(b));*/
		
		/**String to Floats unboxing
		String strStatus="1274488788967.235";
		System.out.println("String to Float unboxing :"+Float.parseFloat(strStatus));*/
		
		/**String to Float with alphabets unboxing
		String strNumber="Ab12Cd3";
		System.out.println("Alpbha numeric string into Float unboxing "+Float.parseFloat(strNumber));*/
		
		/** valueOf
		float c = 124475.04f;
		System.out.println("Coverting float DT into Wrapper Flaot  :"+Float.valueOf(c));*/
		
		/**string to Float using number and valueof()
		String stftatus1="9456.02f";
		System.out.println("String to Float with valueOf() via Unboxing :"+Float.valueOf(stftatus1));*/
		
		/**Float to other primitive
		float d =124578971.004f;
		double m = d;
		//System.out.println("Float to boolean via narrowing :"+(boolean)d);
		System.err.println("Float to byte via narrowing :"+(byte)d);
		System.out.println("Float to Char via narrowing :"+(char)d);
		System.out.println("Float to short via narrowing :"+(short)d);
		System.out.println("Float to int via narrowing  :"+(int)d);
		System.out.println("Double to float via widening :"+m);
		System.out.println("Float to long via narrowing :"+(long)d);*/
		
		
		
		
		/**other PT to Float*/
		int x=129786;
		byte y=127;
		float z=5683.05f;
		float w=89647562.00058f;
		long s = 895647523l;
		char c = 'n';
		boolean b = true;
		
		float x1 = x;
		float y1=y;
		float z1=z;
		float w1 = w;
		float s1 = s;
		float c1 = c;
		//float b1 = b;
		
		System.out.println("Int to Float via Widening   :"+x1);
		System.out.println("Byte to Float via Widening  :"+y1);
		System.out.println("Float to Float via Widening :"+z1);
		System.out.println("Float to Float via Widening:"+w1);
		System.out.println("Long to Float via Widening  :"+s1);
		System.out.println("Char  to Float via Widening :"+c1);
		
		/**System.out.println("Int to Float with value of   :"+Float.valueOf(x));
		System.out.println("Byte to Float with value of  :"+Float.valueOf(y));
		System.out.println("Float to Float with value of :"+Float.valueOf(z));
		//System.out.println("Float to Float with value of:"+Float.valueOf(w));
		System.out.println("Long to Float with value of  :"+Float.valueOf(s));
		System.out.println("Long to Float with value of  :"+Float.valueOf(c));
		//System.out.println("Long to Float via Widening  :"+Float.valueOf(b));*/
		
		/**float num1 = 112.3f;
		float num3 = 984.5f;
		System.out.println("Min value of two float number :"+Float.sum(num1, num3));*/
		
		/**
		float num1 = 112.2f;
		float num3 = 556.6f;
		System.out.println("Min value of two float number "+Float.min(num1, num3));
		System.out.println("Max value of two float number "+Float.max(num1, num3));*/
		
		/**float num2=-25.0f;
		System.out.println("Sqaure root of negative number :"+Math.sqrt(num2));*/
		
		/**float num4=-0.0f,num5=0.0f;
		System.out.println("Dividing the two number :"+(num5/num4));*/

	}

}
