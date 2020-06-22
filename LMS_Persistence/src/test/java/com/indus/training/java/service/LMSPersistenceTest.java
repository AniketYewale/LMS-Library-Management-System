package com.indus.training.java.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.indus.training.java.domain.StudentDO;
import com.indus.training.java.exception.StudentPersistException;
import com.indus.training.java.service.impl.LibMngtSysDAO;

public class LMSPersistenceTest {
	
	private ILibMngtSysDAO iLMSPersistObj;

	@Before
	public void setUp() throws Exception 
	{
		
		iLMSPersistObj = new LibMngtSysDAO();
	}

	@After
	public void tearDown() throws Exception 
	{
		iLMSPersistObj = null;
	}

	@Test
	public void StudentRegisteredTestScenario1() 
	{
		
		StudentDO StudentDOObj = new StudentDO("A777",null,null,null,null);
		Boolean expectedRegisterObj = false;
		
		Boolean actualRegisterObj = null;
		try {
			actualRegisterObj = iLMSPersistObj.register(StudentDOObj);
		} catch (StudentPersistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(actualRegisterObj,expectedRegisterObj);
	}
	
	
	@Test
	public void StudentRegisteredTestScenario2() 
	{
		
		StudentDO StudentDOObj = new StudentDO("A12",null,null,null,null);
		Boolean expectedRegisterObj = true;
		
		Boolean actualRegisterObj = null;
		try {
			actualRegisterObj = iLMSPersistObj.register(StudentDOObj);
		} catch (StudentPersistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(actualRegisterObj,expectedRegisterObj);
	}

	
	@Test
	public void StudentCreateTestScenario1() 
	{
		
		StudentDO StudentDOObj = new StudentDO("T33101","John","Doe","john.doe@gmail.com","9999111100");
		Boolean expectedRegisterObj = true;
		
		Boolean actualRegisterObj = null;
		try {
			actualRegisterObj = iLMSPersistObj.create(StudentDOObj);
		} catch (StudentPersistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(actualRegisterObj,expectedRegisterObj);
	}
	
	@Test
	public void StudentCreateTestScenario2() 
	{
		
		StudentDO StudentDOObj = new StudentDO("T33104","Sai",null,"sai@gmail.com",null);
		Boolean expectedRegisterObj = true;
		
		Boolean actualRegisterObj = null;
		try {
			actualRegisterObj = iLMSPersistObj.create(StudentDOObj);
		} catch (StudentPersistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(actualRegisterObj,expectedRegisterObj);
	}
	
	@Test
	public void StudentDeleteTestScenario1() 
	{
		
		StudentDO StudentDOObj = new StudentDO("T33105",null,null,null,null);
		Boolean expectedRegisterObj = false; //Create File T33105 for deleting and Set expectedRegisterObj = false
		
		Boolean actualRegisterObj = null;
		try {
			actualRegisterObj = iLMSPersistObj.delete(StudentDOObj);
		} catch (StudentPersistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(actualRegisterObj,expectedRegisterObj);
	}
	
	
	/*
	 
	@Test
	public void StudentUpdateTestScenario1() 
	{
		
		StudentDO StudentDOObj = new StudentDO("T33106","Adam","Parker","adamparker@outlook.com","7447");
		Boolean expectedRegisterObj = true;
		
		Boolean actualRegisterObj = null;
		try {
			actualRegisterObj = IStudRegDAOObj.update(StudentDOObj);
		} catch (StudentDOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(actualRegisterObj,expectedRegisterObj);
	}
	
	*/
}
