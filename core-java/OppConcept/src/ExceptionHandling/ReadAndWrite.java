package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadAndWrite {
	
	void readfile() throws FileNotFoundException {
		FileInputStream fin= new FileInputStream("d:file.txt");
	}
	
}
