package com.analysis.hibernate;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String username;
	private String password;
	private Boolean isAdmin;
	private Integer fileSize;
	private Boolean download;
	private Boolean upload;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String username, String password, Boolean isAdmin) {
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	/** full constructor */
	public User(String username, String password, Boolean isAdmin, Integer fileSize, Boolean download, Boolean upload) {
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
		this.fileSize = fileSize;
		this.download = download;
		this.upload = upload;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Integer getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public Boolean getDownload() {
		return this.download;
	}

	public void setDownload(Boolean download) {
		this.download = download;
	}

	public Boolean getUpload() {
		return this.upload;
	}

	public void setUpload(Boolean upload) {
		this.upload = upload;
	}

}