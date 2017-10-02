package edu.bnu.projects.foody.entity;

import java.util.Date;

/**
 * Users generated by hbm2java
 */
public class Users {

	private Long usersId;
	private String userName;
	private String userPassword;
	private int isAdmin;
	private int isConfirmed;
	private Date createdOnTimestamp;
	private int usersBlocked;

	public Long getUsersId() {
		return usersId;
	}

	public void setUsersId(Long usersId) {
		this.usersId = usersId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	public int getIsConfirmed() {
		return isConfirmed;
	}

	public void setIsConfirmed(int isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public Date getCreatedOnTimestamp() {
		return createdOnTimestamp;
	}

	public void setCreatedOnTimestamp(Date createdOnTimestamp) {
		this.createdOnTimestamp = createdOnTimestamp;
	}

	public int getUsersBlocked() {
		return usersBlocked;
	}

	public void setUsersBlocked(int usersBlocked) {
		this.usersBlocked = usersBlocked;
	}
}