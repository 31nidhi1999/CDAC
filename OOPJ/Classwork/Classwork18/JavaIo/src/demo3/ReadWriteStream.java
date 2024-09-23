//ReaderWriter stream using myReaderFile to read data & write data in myWriterFile

package demo3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteStream {

	public static void main(String[] args) {
		
		try {
			FileReader fr =new FileReader("C:/CDAC/Java/Day_18/Classwork/JavaIo/src/demo3/myReaderFile");
			FileWriter fw = new FileWriter("C:/CDAC/Java/Day_18/Classwork/JavaIo/src/demo3/myWriterFile");
			
			int ch =0;
			while((ch=fr.read())!=-1) {
				System.out.print((char)ch);
				fw.write(ch);
			}
			fw.flush();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
