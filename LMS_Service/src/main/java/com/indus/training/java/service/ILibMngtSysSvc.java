package com.indus.training.java.service;

import com.indus.training.java.domain.StudentTO;
import com.indus.training.java.exception.StudentSvcException;

public interface ILibMngtSysSvc {

	public Boolean enroll(StudentTO stdTO)throws StudentSvcException;
	public Boolean persist(StudentTO stdTO)throws StudentSvcException;
	public StudentTO fetch(String stdTO)throws StudentSvcException;
	public Boolean modify(StudentTO stdTO)throws StudentSvcException;
	public Boolean unregister(StudentTO stdTO)throws StudentSvcException;
}
