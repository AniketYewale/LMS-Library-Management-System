package com.indus.training.java.service.impl;

import com.indus.training.java.domain.StudentDO;
import com.indus.training.java.domain.StudentTO;
import com.indus.training.java.exception.StudentPersistException;
import com.indus.training.java.exception.StudentSvcException;
import com.indus.training.java.service.ILibMngtSysDAO;
import com.indus.training.java.service.ILibMngtSysSvc;

public class LibMngtSysSvc implements ILibMngtSysSvc {

	private ILibMngtSysDAO iLibMngtSysDAOObj = new LibMngtSysDAO();

	public Boolean enroll(StudentTO stdTO) throws StudentSvcException {

		Boolean isStudRegistered = null;
		StudentDO stdDOObj = new StudentDO();
		try {
			stdDOObj.setStudentID(stdTO.getStudentID());
			stdDOObj.setfName(stdTO.getfName());
			stdDOObj.setlName(stdTO.getlName());
			stdDOObj.setEmail(stdTO.getEmail());
			stdDOObj.setContactNo(stdTO.getContactNo());

			isStudRegistered = iLibMngtSysDAOObj.register(stdDOObj);
		} catch (StudentPersistException e) {
			throw new StudentSvcException("", e);
		}

		return isStudRegistered;
	}

	public Boolean persist(StudentTO stdTO) throws StudentSvcException {

		Boolean isCreated = null;
		StudentDO stdDOObj = new StudentDO();
		try {
			stdDOObj.setStudentID(stdTO.getStudentID());
			stdDOObj.setfName(stdTO.getfName());
			stdDOObj.setlName(stdTO.getlName());
			stdDOObj.setEmail(stdTO.getEmail());
			stdDOObj.setContactNo(stdTO.getContactNo());

			isCreated = iLibMngtSysDAOObj.create(stdDOObj);
		} catch (StudentPersistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isCreated;
	}


	public StudentTO fetch(String stdTO) throws StudentSvcException {

		StudentTO stdTOObj = new StudentTO();

		try {
			StudentDO stdDO = iLibMngtSysDAOObj.search(stdTO);

			// Put STUDENTDO Object into STUDENTTO object and then return that

			stdTOObj.setStudentID(stdDO.getStudentID());
			stdTOObj.setfName(stdDO.getfName());
			stdTOObj.setlName(stdDO.getlName());
			stdTOObj.setEmail(stdDO.getEmail());
			stdTOObj.setContactNo(stdDO.getContactNo());

		} catch (StudentPersistException e) {
			e.printStackTrace();
		}

		return stdTOObj;
	}

	public Boolean modify(StudentTO stdTO) throws StudentSvcException {

		Boolean isUpdated = null;
		StudentDO stdDOObj = new StudentDO();
		try {
			stdDOObj.setStudentID(stdTO.getStudentID());
			stdDOObj.setfName(stdTO.getfName());
			stdDOObj.setlName(stdTO.getlName());
			stdDOObj.setEmail(stdTO.getEmail());
			stdDOObj.setContactNo(stdTO.getContactNo());

			isUpdated = iLibMngtSysDAOObj.update(stdDOObj);
		} catch (StudentPersistException e) {
			e.printStackTrace();
		}

		return isUpdated;

	}

	public Boolean unregister(StudentTO stdTO) throws StudentSvcException {

		Boolean isDeleted = null;
		StudentDO stdDOObj = new StudentDO();
		try {
			stdDOObj.setStudentID(stdTO.getStudentID());
			stdDOObj.setfName(stdTO.getfName());
			stdDOObj.setlName(stdTO.getlName());
			stdDOObj.setEmail(stdTO.getEmail());
			stdDOObj.setContactNo(stdTO.getContactNo());

			isDeleted = iLibMngtSysDAOObj.delete(stdDOObj);
		} catch (StudentPersistException e) {
			e.printStackTrace();
		}

		return isDeleted;
	}

}
