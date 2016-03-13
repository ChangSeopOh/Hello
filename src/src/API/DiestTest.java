package API;

import org.apache.commons.codec.digest.DigestUtils;

public class DiestTest {
	public static void main(String[] args) {
		
		String pwd ="123456789";
		String encodePwd = DigestUtils.sha512Hex(pwd);
				System.out.println(encodePwd.length()+"."+encodePwd);
		
		
		
		
		
	}
}
