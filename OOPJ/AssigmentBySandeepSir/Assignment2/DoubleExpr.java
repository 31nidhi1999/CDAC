package assigment2;

public class DoubleExpr {

	public static void main(String[] args) {

		/** how many Double used to stored?
		System.out.println("Double size "+Double.BYTES);*/
		
		/** Range of Double
		System.out.println("Min range of Double :"+Double.MIN_VALUE);
		System.out.println("Min range of Double :"+Double.MAX_VALUE);*/
		
		/** Doubles to string
		 double b = 1274.02d;
		System.out.println("Doubles to string :"+Double.toString(b));*/
		
		/**String to Doubles
		String strStatus="1274488781.03d";
		System.out.println("String to Double :"+Double.parseDouble(strStatus));*/
		
		/**String to Double with alphabets
		String strNumber="Ab12Cd3";
		System.out.println("Alpbha numeric string into Double "+Double.parseDouble(strNumber));*/
		
		/** valueOf
		double c = 124475.04d;
		System.out.println("Coverting into Double :"+Double.valueOf(c));*/
		
		/**string to Double using number and valueof()
		String stftatus1="96";
		System.out.println("String to Double with valueOf() :"+Double.valueOf(stftatus1));*/
		
		/**Double to other primitive
		double d =124578971.004d;
		//System.out.println("Double to boolean via narrowing :"+(boolean)d);
		System.err.println("Double to byte via narrowing :"+(byte)d);
		System.out.println("Double to Char via narrowing :"+(char)d);
		System.out.println("Double to short via narrowing :"+(short)d);
		System.out.println("Double to int via narrowing  :"+(int)d);
		System.out.println("Double to float via narrowing :"+(float)d);
		System.out.println("Double to long via narrowing :"+(long)d);*/
		
		/**other PT to Double*/
		int x=129786;
		byte y=127;
		float z=5683.05f;
		double w=89647562.00058d;
		long s = 895647523l;
		char c = 'n';
		boolean b = true;
		
		/**double x1 = x;
		double y1=y;
		double z1=z;
		double w1 = w;
		double s1 = s;
		double c1 = c;
		//double b1 = b;
		
		System.out.println("Int to Double via Widening   :"+x1);
		System.out.println("Byte to Double via Widening  :"+y1);
		System.out.println("Float to Double via Widening :"+z1);
		System.out.println("Double to Double via Widening:"+w1);
		System.out.println("Long to Double via Widening  :"+s1);
		System.out.println("Char  to Double via Widening :"+c1);*/
		
		System.out.println("Int to Double with value of   :"+Double.valueOf(x));
		System.out.println("Byte to Double with value of  :"+Double.valueOf(y));
		System.out.println("Float to Double with value of :"+Double.valueOf(z));
		System.out.println("Double to Double with value of:"+Double.valueOf(w));
		System.out.println("Long to Double with value of  :"+Double.valueOf(s));
		System.out.println("Long to Double with value of  :"+Double.valueOf(c));
		//System.out.println("Long to Double via Widening  :"+Double.valueOf(b));
		
		
		
		/**double num1 = 112.3;
		double num3 = 984.5;
		System.out.println("Min value of two double number "+Double.min(num1, num3));
		System.out.println("Max value of two double number "+Double.max(num1, num3));*/
		
		/**double num2=-25.0;
		System.out.println("Sqaure root of negative number :"+Math.sqrt(num2));*/
		
		/**double num4=-0.0,num5=0.0;
		System.out.println("Dividing the two number :"+(num5/num4));*/
	}

}
