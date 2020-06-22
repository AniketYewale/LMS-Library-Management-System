package com.indus.training.java.domain;

import java.io.Serializable;

public class StudentDO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5587221767619357651L;

	private String studentID;
	private String fName;
	private String lName;
	private String email;
	private String contactNo;
	
	
	public StudentDO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentDO(String studentID, String fName, String lName, String email, String contactNo) {
		super();
		this.studentID = studentID;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.contactNo = contactNo;
	}


	public String getStudentID() {
		return studentID;
	}


	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContactNo() {
		return contactNo;
	}


	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contactNo == null) ? 0 : contactNo.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + ((studentID == null) ? 0 : studentID.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDO other = (StudentDO) obj;
		if (contactNo == null) {
			if (other.contactNo != null)
				return false;
		} else if (!contactNo.equals(other.contactNo))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (studentID == null) {
			if (other.studentID != null)
				return false;
		} else if (!studentID.equals(other.studentID))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "StudentDO [studentID=" + studentID + ", fName=" + fName + ", lName=" + lName + ", email=" + email
				+ ", contactNo=" + contactNo + "]";
	}
	
}
