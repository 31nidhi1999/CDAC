package assigment2;

/*
 1 x 8 + 1 = 9
12 x 8 + 2 = 98
123 x 8 + 3 = 987
1234 x 8 + 4 = 9876
12345 x 8 + 5 = 98765
123456 x 8 + 6 = 987654
1234567 x 8 + 7 = 9876543
12345678 x 8 + 8 = 98765432
123456789 x 8 + 9 = 987654321
*/

public class NinethPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 9,n=1,num=8,i=1,sum=0;
		while(n<=9) {
			sum = i*8 + n;
			System.out.println(i +" x "+ " 8 + "+" " +n+" "+ " = "+ sum);
			n++;
			i=i*10+n;

		}

	}

}
