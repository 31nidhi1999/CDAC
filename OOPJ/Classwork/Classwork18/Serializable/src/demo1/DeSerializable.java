//de

package demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeSerializable {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:/CDAC/Java/Day_18/Classwork/Serializable/src/demo1/objFile");
			ObjectInput ois = new ObjectInputStream(fis);
			
			Student std = (Student)ois.readObject();
			System.out.println(std);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
