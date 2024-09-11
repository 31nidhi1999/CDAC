import java.awt.Menu;
import java.util.Scanner;

public class Program{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array1 arr = new Array1(5);
		
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