package com.phande.kafakademo.model;

public class User {
	private String userId;
    private String userName;
    private String userCity;
    private String mobileNo;

    public User() {
    }

    public User(String userId, String userName, String userCity, String mobileNo) {
        this.userId = userId;
        this.userName = userName;
        this.userCity = userCity;
        this.mobileNo = mobileNo;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserCity(String userCity) {
    	this.userCity = userCity;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserCity() {
        return userCity;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", UserCity='" + userCity + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }

}
