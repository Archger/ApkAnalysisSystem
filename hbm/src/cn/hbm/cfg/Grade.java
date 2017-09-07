package cn.hbm.cfg;

/**
 * Grade entity. @author MyEclipse Persistence Tools
 */

public class Grade implements java.io.Serializable {

	// Fields

	private GradeId id;

	// Constructors

	/** default constructor */
	public Grade() {
	}

	/** full constructor */
	public Grade(GradeId id) {
		this.id = id;
	}

	// Property accessors

	public GradeId getId() {
		return this.id;
	}

	public void setId(GradeId id) {
		this.id = id;
	}

}