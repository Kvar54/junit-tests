import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


public class StudentTest {
    private Student emptyStudent;
    private Student actualStudent;
    private ArrayList<Integer> emptyArrayList;

    @Before
    public void setup() {
        actualStudent = new Student(12345, "julissa");
    }

    @Test
    public void testStudentConstructor() {
        assertNull(emptyStudent);
        assertNotNull(actualStudent);


    }
@Test
    public void testStudentGetters() {
        assertEquals(actualStudent.getId(), 12345);
        assertEquals(actualStudent.getName(), "julissa");
        assertEquals(actualStudent.getGrades().emptyArrayList());
    }

    @Test
    public void testStudentaddGrades() {
        actualStudent = new Student(45678, "jeremy");
        actualStudent.addGrade(84);
        actualStudent.addGrade(90);
        actualStudent.addGrade(90);

        ArrayList<Integer>expectedGrades =new ArrayList<>
                (Arrays.asList(50,75,100));

        assertEquals(actualStudent.getGrades(),expectedGrades);
    }
@Test
    public void testStudentGetGradeAverage(){
    actualStudent.addGrade(84);
    actualStudent.addGrade(90);
    actualStudent.addGrade(90);
    assertEquals(actualStudent.getGradeAverage(), 75, 0.0000001);
}
}