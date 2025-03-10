package eu.singledev.searching;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    @Test
    void searchReturnsElementWhenPresent() {
        Integer[] array = {1, 2, 3, 4, 5};
        Integer target = 3;
        assertEquals(target, LinearSearch.search(array, target));
    }

    @Test
    void searchReturnsNullWhenElementNotPresent() {
        Integer[] array = {1, 2, 3, 4, 5};
        Integer target = 6;
        assertNull(LinearSearch.search(array, target));
    }

    @Test
    void searchReturnsNullForEmptyArray() {
        Integer[] array = {};
        Integer target = 1;
        assertNull(LinearSearch.search(array, target));
    }

    @Test
    void searchReturnsFirstMatchingElement() {
        Integer[] array = {1, 2, 3, 2, 1};
        Integer target = 2;
        assertEquals(target, LinearSearch.search(array, target));
    }

    @Test
    public void testSearchWithStrings() {
        String[] array = {"apple", "banana", "cherry", "date"};
        String target = "cherry";
        String result = LinearSearch.search(array, target);
        assertEquals(target, result);
    }

    @Test
    public void testSearchWithNullTarget() {
        String[] array = {"apple", "banana", null, "date"};
        String result = LinearSearch.search(array, null);
        assertNull(result);
    }

    @Test
    public void testSearchWithCustomObjects() {
        Person[] people = {
                new Person("John", 25),
                new Person("Alice", 30),
                new Person("Bob", 22)
        };
        Person target = new Person("Alice", 30);
        Person result = LinearSearch.search(people, target);
        assertEquals(target, result);
    }

    // Custom class for testing with objects
    static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Person person = (Person) obj;
            return age == person.age && name.equals(person.name);
        }
    }
}