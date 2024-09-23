////BufferedReader& writter  stream using myBufferReaderFile to read data & write data in myBufferReaderFile


package demo4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReadWriteStream {

	public static void main(String[] args) {
		
		try {
			FileReader fr =new FileReader("C:/CDAC/Java/Day_18/Classwork/JavaIo/src/demo4/myBufferReaderFile");
			FileWriter fw = new FileWriter("C:/CDAC/Java/Day_18/Classwork/JavaIo/src/demo4/myBufferReaderFile");
			
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			//BufferReader contain readLine();
			String readLine = null;
			while((readLine=br.readLine())!=null) {
				System.out.println(readLine);
				//using /n to print the data on nextline
				bw.write(readLine+"\n");
			}
			bw.flush();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
