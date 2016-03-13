package exception;

import org.apache.commons.codec.digest.DigestUtils;

public class MemberVO {
	private String user_id;
	private String user_name;
	private String user_pw;
	
	
	public MemberVO(){}
	
	public MemberVO(String user_id, String user_name, String user_pw) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		setUser_pw(user_pw);
	}

	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = DigestUtils.sha512Hex(user_pw);
	}
	@Override
	public String toString() {
		return "MemberVO [user_id=" + user_id + ", user_name=" + user_name + ", user_pw=" + user_pw + "]";
	}
	
	
}
