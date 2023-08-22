package gr.aueb.cf.schoolapp.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    @Test
    void gettersSetters() {
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setFirstname("Thanassis");
        teacher.setLastname("androutsos");

        assertEquals(1,teacher.getId());
        assertEquals("Thanassis",teacher.getFirstname());
        assertEquals("androutsos", teacher.getLastname());
    }

    @Test
    void overloadedConstructorAndToString() {
        Teacher teacher = new Teacher(2, "Anna", "kefala");
        assertEquals(2, teacher.getId());
        assertEquals("Anna", teacher.getFirstname());
        assertEquals("kefala", teacher.getLastname());

        String expected = "2,Anna,kefala";
        String actual = teacher.toString();
        assertEquals(expected,actual);
    }

}