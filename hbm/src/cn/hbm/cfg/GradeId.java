package cn.hbm.cfg;

/**
 * GradeId entity. @author MyEclipse Persistence Tools
 */

public class GradeId implements java.io.Serializable {

	// Fields

	private String sid;
	private String name;
	private String score;

	// Constructors

	/** default constructor */
	public GradeId() {
	}

	/** full constructor */
	public GradeId(String sid, String name, String score) {
		this.sid = sid;
		this.name = name;
		this.score = score;
	}

	// Property accessors

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScore() {
		return this.score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GradeId))
			return false;
		GradeId castOther = (GradeId) other;

		return ((this.getSid() == castOther.getSid())
				|| (this.getSid() != null && castOther.getSid() != null && this.getSid().equals(castOther.getSid())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getScore() == castOther.getScore()) || (this.getScore() != null
						&& castOther.getScore() != null && this.getScore().equals(castOther.getScore())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSid() == null ? 0 : this.getSid().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getScore() == null ? 0 : this.getScore().hashCode());
		return result;
	}

}