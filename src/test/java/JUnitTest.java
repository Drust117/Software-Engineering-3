/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import College.Student;
import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Padraig
 */
public class JUnitTest {
    

    @Test
	public void getUsernameTest(){
                Student student = new Student(18, "Joe Crowe", "Joe Crowe18", 12321, "13/04/1997");
		String expected="Joe Crowe18";
		String actualResult = student.getUserName();
		assertEquals(expected, actualResult);
	}
}
