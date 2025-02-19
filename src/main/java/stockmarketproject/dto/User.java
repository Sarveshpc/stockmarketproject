package stockmarketproject.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
    @Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "twoMFA")
	private String twoMFA;
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTwoMFA() {
		return twoMFA;
	}

	public void setTwoMFA(String twoMFA) {
		this.twoMFA = twoMFA;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", twoMFA=" + twoMFA + "]";
	}
	
	
	
	
	
	
	
	

}
