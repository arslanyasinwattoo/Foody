package edu.bnu.projects.foody.entity;

/**
 * FoodItems generated by hbm2java
 */
public class FoodItems {

	private Long foodItemsId;
	private FoodType foodType;
	private Users users;
	private long usersId;
	private String foodItemsName;
	private Long resturantId;
	private long foodTypeId;
	private String foodTypeName;
	private String resturantName;
	private long foodItemsPending;
	private long foodItemsBlocked;

	public long getUsersId() {
		return usersId;
	}

	public void setUsersId(long usersId) {
		this.usersId = usersId;
	}

	public long getFoodItemsPending() {
		return foodItemsPending;
	}

	public void setFoodItemsPending(long foodItemsPending) {
		this.foodItemsPending = foodItemsPending;
	}

	public long getFoodItemsBlocked() {
		return foodItemsBlocked;
	}

	public void setFoodItemsBlocked(long foodItemsBlocked) {
		this.foodItemsBlocked = foodItemsBlocked;
	}

	public long getFoodTypeId() {
		return foodTypeId;
	}

	public void setFoodTypeId(long foodTypeId) {
		this.foodTypeId = foodTypeId;
	}

	public Long getResturantId() {
		return resturantId;
	}

	public void setResturantId(Long resturantId) {
		this.resturantId = resturantId;
	}

	public String getFoodTypeName() {
		return foodTypeName;
	}

	public void setFoodTypeName(String foodTypeName) {
		this.foodTypeName = foodTypeName;
	}

	public String getResturantName() {
		return resturantName;
	}

	public void setResturantName(String resturantName) {
		this.resturantName = resturantName;
	}

	public Long getFoodItemsId() {
		return this.foodItemsId;
	}

	public void setFoodItemsId(Long foodItemsId) {
		this.foodItemsId = foodItemsId;
	}

	public FoodType getFoodType() {
		return this.foodType;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getFoodItemsName() {
		return this.foodItemsName;
	}

	public void setFoodItemsName(String foodItemsName) {
		this.foodItemsName = foodItemsName;
	}

}
