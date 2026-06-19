package bank_pojo;

public class Account {
	private int actid;
	private String name,email ,pwd;
	private double balance;
	
	
	public Account(int actid, String name, String email, String pwd, double balance) {
		this.actid = actid;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.balance = balance;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public int getActid() {
		return actid;
	}


	public String getPwd() {
		return pwd;
	}


	@Override
	public String toString() {
		return "actid=" + actid + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", balance="
				+ balance ;
	}
	
	

}