package edu.bnu.projects.foody.entity;
/**
 * Picture generated by hbm2java
 */
public class Picture  {

	private Long pictureId;
	private Resturant resturant;
	private Users users;
	private String pictureName;

	public Picture() {
	}

	public Picture(Resturant resturant, Users users, String pictureName) {
		this.resturant = resturant;
		this.users = users;
		this.pictureName = pictureName;
	}

	public Long getPictureId() {
		return this.pictureId;
	}

	public void setPictureId(Long pictureId) {
		this.pictureId = pictureId;
	}

	public Resturant getResturant() {
		return this.resturant;
	}

	public void setResturant(Resturant resturant) {
		this.resturant = resturant;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getPictureName() {
		return this.pictureName;
	}

	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}

}