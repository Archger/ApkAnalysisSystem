package cn.hbm.cfg;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private TeacherId id;

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** full constructor */
	public Teacher(TeacherId id) {
		this.id = id;
	}

	// Property accessors

	public TeacherId getId() {
		return this.id;
	}

	public void setId(TeacherId id) {
		this.id = id;
	}

}