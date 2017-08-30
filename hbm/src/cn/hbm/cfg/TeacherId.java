package cn.hbm.cfg;

/**
 * TeacherId entity. @author MyEclipse Persistence Tools
 */

public class TeacherId implements java.io.Serializable {

	// Fields

	private String name;
	private String password;

	// Constructors

	/** default constructor */
	public TeacherId() {
	}

	/** full constructor */
	public TeacherId(String name, String password) {
		this.name = name;
		this.password = password;
	}

	// Property accessors

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TeacherId))
			return false;
		TeacherId castOther = (TeacherId) other;

		return ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
				&& this.getName().equals(castOther.getName())))
				&& ((this.getPassword() == castOther.getPassword()) || (this.getPassword() != null
						&& castOther.getPassword() != null && this.getPassword().equals(castOther.getPassword())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getPassword() == null ? 0 : this.getPassword().hashCode());
		return result;
	}

}