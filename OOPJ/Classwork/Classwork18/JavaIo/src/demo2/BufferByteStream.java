//Buffered input output by stream using myBfferIpFile to read data & write data in myBufferOpFile


package demo2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferByteStream {

	public static void main(String[] args) {
		
		try {
			
			// as we are passing file as argument we need to add catch block filenot found
			FileInputStream fis = new FileInputStream("C:/CDAC/Java/Day_18/Classwork/JavaIo/src/demo2/myBfferIpFile");
			FileOutputStream fos = new FileOutputStream("C:/CDAC/Java/Day_18/Classwork/JavaIo/src/demo2/myBufferOpFile",true);
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			
			
			int ch=0;
			
			//below line gived unhandel IOEXpetion so we have added IOException
			//IOexceptin is super class for filenotfound exception
			while((ch=bis.read())!=-1) {
				System.out.print((char)ch);
				bos.write(ch);
			}
			bos.flush();
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
