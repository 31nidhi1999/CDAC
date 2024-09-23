//inpout output bye stream using myInputFile to read data & write data in myOutputFile

package demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IpOpByteStream {

	public static void main(String[] args) {
		try {
			
			//to read & write data from source to destination file
			File file = new File("C:/CDAC/Java/Day_18/Classwork/JavaIo/src/demo1/myInputFile");
			File fileo = new File("C:/CDAC/Java/Day_18/Classwork/JavaIo/src/demo1/myOutputFile");
			
			
			if(!file.exists()) {
				System.out.println("File not found");
			}
				
			else {
				//A FileInputStream obtains input bytes from a file in a file system
				FileInputStream fis = new FileInputStream(file);
				
				//A file output stream is an output stream for writing data to a File
				FileOutputStream fos = new FileOutputStream(fileo);
				
				int ch = 0;
				
				//.read() is used to read the file contnt
				while((ch =fis.read()) !=-1) {
					System.out.print((char)ch);
					fos.write(ch);
				}
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
