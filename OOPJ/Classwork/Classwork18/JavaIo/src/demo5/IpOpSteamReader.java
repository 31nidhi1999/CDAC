//InputOutputsTREAM RAEDER TAKING INPUT FROM USER
package demo5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IpOpSteamReader {

	public static void main(String[] args) {
		
		
		try {
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
		
			
			System.out.println("Enter a vaue in float");
			
			System.out.println(Float.parseFloat(br.readLine()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
