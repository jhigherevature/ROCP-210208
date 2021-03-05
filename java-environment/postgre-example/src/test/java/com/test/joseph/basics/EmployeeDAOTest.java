package com.test.joseph.basics;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.revature.joseph.dao.EmployeeDAOImpl_postgre;
import com.revature.joseph.model.Employee;

public class EmployeeDAOTest {
	
	@InjectMocks
	private EmployeeDAOImpl_postgre eDao;
	
	private List<Employee> mockEmployees;
	
	@Mock
	private Employee emp;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		
	}
	
	@Before
	public void setUp() {
		System.out.println("Before");
		/* we use the static initMocks method on the MockitoAnnotations class
		 * to tell mockito that we want to create the Mocks that we indicated
		 */
		MockitoAnnotations.initMocks(this);
		
		eDao = Mockito.mock(EmployeeDAOImpl_postgre.class);
		
		this.mockEmployees = new ArrayList<Employee>();
		mockEmployees.add(new Employee(1001, "Test One", 50000.00, "Test Title"));
		mockEmployees.add(new Employee(1002, "Test Two", 50000.00, "Test Title"));
		mockEmployees.add(new Employee(1003, "Test Three", 50000.00, "Test Title"));
		mockEmployees.add(new Employee(1004, "Test Four", 50000.00, "Test Title"));
		mockEmployees.add(new Employee(1005, "Test Five", 50000.00, "Test Title"));
	}
	
	@After
	public void tearDown() {
		
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		
	}
	
	@Test
	public void selectAllEmployees() {
		Mockito.when(this.eDao.selectAllEmployees()).thenReturn(this.mockEmployees);
		assertEquals(eDao.selectAllEmployees().get(1), mockEmployees.get(1));	
	}
}
