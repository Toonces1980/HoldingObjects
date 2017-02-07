package pajerowski.tony;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * Created by anthonypajerowski on 2/7/17.
 */
public class PhoneBookEntryTest {
    PhoneBookEntry phoneBookEntry;

    @Before
    public void setup() {
        phoneBookEntry = new PhoneBookEntry("1234567");
    }

    @Test
    public void getPhoneNumberTest() {
        ArrayList expected = null;
        ArrayList actual = phoneBookEntry.getPhoneNumber();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setPhoneNumberTest() {
        ArrayList expected = null;
        phoneBookEntry.setPhoneNumber("9999999");
        ArrayList actual = phoneBookEntry.getPhoneNumber();
        Assert.assertEquals(expected,actual);
    }
}