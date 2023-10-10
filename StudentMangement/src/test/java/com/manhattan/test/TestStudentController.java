package com.manhattan.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.manhttan.Inter.StudentService;
import com.manhttan.controller.StudentController;

@ExtendWith(MockitoExtension.class)
public class TestStudentController {

	
		@Mock
		StudentService ss;
		@InjectMocks
		StudentController sc;
		@Test
		public void testSaveStudent() {
			when(sc.saveStudent(101, "supriya", 12000)).thenReturn(1);
			assertEquals(1, sc.saveStudent(101, "supriya", 12000));
		
		
	}
}
