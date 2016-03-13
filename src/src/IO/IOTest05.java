package IO;

import java.io.File;
import java.util.Scanner;

public class IOTest05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String filename = sc.nextLine();
		File file = null;
		try {
			file = new File(filename);
			if (file.exists()) {
				System.out.println(filename + "이 존재합니다.");
				System.out.println("file : " + file.isFile());
				System.out.println("dir : " + file.isDirectory());
				System.out.println("size : " + file.length());
				System.out.println("path : " + file.getPath());
				System.out.println("hidden : " + file.isHidden());
				System.out.println("exe : " + file.canExecute());
				System.out.println("read : " + file.canRead());
				System.out.println("write : " + file.canWrite());
			} else {
				System.out.println(filename + "이 존재하지 않습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
