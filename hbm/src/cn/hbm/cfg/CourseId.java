package cn.hbm.cfg;

/**
 * CourseId entity. @author MyEclipse Persistence Tools
 */

public class CourseId implements java.io.Serializable {

	// Fields

	private String cid;
	private String name;
	private String teacher;

	// Constructors

	/** default constructor */
	public CourseId() {
	}

	/** full constructor */
	public CourseId(String cid, String name, String teacher) {
		this.cid = cid;
		this.name = name;
		this.teacher = teacher;
	}

	// Property accessors

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeacher() {
		return this.teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CourseId))
			return false;
		CourseId castOther = (CourseId) other;

		return ((this.getCid() == castOther.getCid())
				|| (this.getCid() != null && castOther.getCid() != null && this.getCid().equals(castOther.getCid())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getTeacher() == castOther.getTeacher()) || (this.getTeacher() != null
						&& castOther.getTeacher() != null && this.getTeacher().equals(castOther.getTeacher())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCid() == null ? 0 : this.getCid().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getTeacher() == null ? 0 : this.getTeacher().hashCode());
		return result;
	}

}