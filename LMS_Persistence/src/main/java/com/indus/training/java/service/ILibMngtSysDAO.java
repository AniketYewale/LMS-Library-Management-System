package com.indus.training.java.service;

import com.indus.training.java.domain.StudentDO;
import com.indus.training.java.exception.StudentPersistException;

public interface ILibMngtSysDAO {

	public Boolean register(StudentDO stdDO)throws StudentPersistException;
	public Boolean create(StudentDO stdDO)throws StudentPersistException;
	public StudentDO search(String stdDO)throws StudentPersistException;
	public Boolean update(StudentDO stdDO)throws StudentPersistException;
	public Boolean delete(StudentDO stdDO)throws StudentPersistException;
}
