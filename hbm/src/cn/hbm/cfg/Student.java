package cn.hbm.cfg;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private StudentId id;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(StudentId id) {
		this.id = id;
	}

	// Property accessors

	public StudentId getId() {
		return this.id;
	}

	public void setId(StudentId id) {
		this.id = id;
	}

}