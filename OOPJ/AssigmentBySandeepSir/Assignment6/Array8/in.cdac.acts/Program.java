import java.awt.Menu;
import java.util.Scanner;

public class Program{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array2 arr = new Array2(5);
		
		MenuEnum choose;
		
		while((choose = Array2.Menulist())!=MenuEnum.EXIT) {
			switch (choose) {
				case MenuEnum.ACCEPT_RECORD:
					arr.acceptRecord();
					break;
				case MenuEnum.PRINT_RECORD:
					arr.printRecord();
					break;
		}}
		
		
	}
}