package IO;

import java.io.File;

public class IOTest06 {
	public static void main(String[] args) {

		File file = new File("C:/Elle");

		File[] filelist = file.listFiles();
		
		for(File f:filelist) {
			if (f.isDirectory()){
				System.out.println("[" + f.getName() + "]");
			} else
				System.out.println(f.getName());
		}
	}
}
