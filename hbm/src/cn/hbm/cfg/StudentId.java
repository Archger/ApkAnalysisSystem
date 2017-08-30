package cn.hbm.cfg;

/**
 * StudentId entity. @author MyEclipse Persistence Tools
 */

public class StudentId implements java.io.Serializable {

	// Fields

	private String sid;
	private String name;
	private String sex;
	private String cid;

	// Constructors

	/** default constructor */
	public StudentId() {
	}

	/** full constructor */
	public StudentId(String sid, String name, String sex, String cid) {
		this.sid = sid;
		this.name = name;
		this.sex = sex;
		this.cid = cid;
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

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StudentId))
			return false;
		StudentId castOther = (StudentId) other;

		return ((this.getSid() == castOther.getSid())
				|| (this.getSid() != null && castOther.getSid() != null && this.getSid().equals(castOther.getSid())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getSex() == castOther.getSex()) || (this.getSex() != null && castOther.getSex() != null
						&& this.getSex().equals(castOther.getSex())))
				&& ((this.getCid() == castOther.getCid()) || (this.getCid() != null && castOther.getCid() != null
						&& this.getCid().equals(castOther.getCid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSid() == null ? 0 : this.getSid().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getSex() == null ? 0 : this.getSex().hashCode());
		result = 37 * result + (getCid() == null ? 0 : this.getCid().hashCode());
		return result;
	}

}