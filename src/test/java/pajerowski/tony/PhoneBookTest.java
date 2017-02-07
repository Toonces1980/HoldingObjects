package pajerowski.tony;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

/**
 * Created by anthonypajerowski on 2/7/17.
 */
public class PhoneBookTest {
    PhoneBook phoneBook;

    @Before
    public void setup() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void lookUpTest() {
        String expected = null;
        String actual = phoneBook.lookUp("bob");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void reverseLookupTest() {
        String expected = null;
        String actual = phoneBook.reverseLookup("1234567");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addEntryTest() {
        String expected = null;
        phoneBook.addEntry("biff", "9999999");
        String actual = phoneBook.printEntry();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeEntryTest() {
        String expected = null;
        String actual = null;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void printEntryTest() {
        String expected = null;
        String actual = phoneBook.printEntry();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void printEntryKeysTest() {
        String expected = null;
        String actual = phoneBook.printEntryKeys();
        Assert.assertEquals(expected,actual);
    }
}