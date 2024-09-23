package demo1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("C:/CDAC/Java/Day_18/Classwork/Serializable/src/demo1/objFile");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Student std = new Student(101,"Nidhi",84.20);
			
			oos.writeObject(std);
			//oos.flush();
			
			System.out.println("Object serialized successfully!!");

			System.out.println("Serialized object is: ");
			System.out.println(std);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
