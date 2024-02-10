
import static org.junit.Assert.*;

import org.junit.*;

public class TestPerson {

    @Test
    public void testGetName() {
        Person p = new Person("Sophia", 88, 10.5);
        assertEquals(p.getName(), "Sophia");
    }

    @Test
    public void testSetName() {
        Person p = new Person("Sophia", 88, 10.5);
        p.setName("Dr. Sat");
        assertEquals(p.getName(), "Dr. Sat");
    }

    @Test
    public void testGetAge() {
        Person p = new Person("Sophia", 88, 10.5);
        assertEquals(p.getAge(), 88);
    }

    @Test
    public void testSetAge() {
        Person p = new Person("Sophia", 88, 10.5);
        p.setAge(10000);
        assertEquals(p.getAge(), 10000);
    }
    @Test
    public void testGetIncome() {
        Person p = new Person("Sophia", 88, 10.5);
        assertEquals(p.getIncome(), 10.5,0.0);
    }

    @Test
    public void testSetIncome() {
        Person p = new Person("Sophia", 88, 10.5);
        p.setIncome(4567.890);
        assertEquals(p.getIncome(), 4567.890,4567.890-10.5);
    }

    @Test
    public void testEquals() {
        Person p = new Person("Sophia", 88, 10.5);
        Person d = new Person("Sophia", 88, 10.5);
        assertTrue(p.equals (d) );
    }

}
