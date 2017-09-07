package cn.hbm.cfg;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {

	// Fields

	private CourseId id;

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** full constructor */
	public Course(CourseId id) {
		this.id = id;
	}

	// Property accessors

	public CourseId getId() {
		return this.id;
	}

	public void setId(CourseId id) {
		this.id = id;
	}

}