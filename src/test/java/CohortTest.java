import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CohortTest {
    private Cohort emptyCohort;
    private Cohort actualCohort;

    @Before
    public void setuup(){
        actualCohort = new Cohort();
    }
    @Test
    public void TestCohortConstructors() {
        assertNull(emptyCohort);
        assertNotNull (actualCohort);

    }

    @Test
    public void TestCohortAddStudents() {
Student actualStudent = new Student(1L, "fer");
actualCohort.addStudent(actualStudent);
assertEquals(Arrays.asList(actualStudent), actualCohort.getStudents());
    }
    @Test
    public void TestCohortGetCohortAverage() {
        Student actualStudent = new Student(1L, "fer");
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);

        Student actualStudentTwo = new Student(1L, "fer");
        actualStudent.addGrade(0);
        actualStudent.addGrade(25);
        actualStudent.addGrade(50);

actualCohort.addStudent(actualStudent);
        actualCohort.addStudent(actualStudentTwo);

    }
}