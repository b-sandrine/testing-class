
public class PasswordValidate {
	String password;
	public PasswordValidate(String password) {
		this.password = password;
	}
	
	public Boolean validate() {
		if(password.length() < 8) return false;
		
		if(!password.contains("_")) return false;
		
		return true;
	}
}
