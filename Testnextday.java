import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NextDateTest {
    @Test
    public void testNextDate() {
        assertEquals("2/1/1812", NextDate.nextDate(1, 1, 1812));
        assertEquals("29/2/1812", NextDate.nextDate(28, 2, 1812));
        assertEquals("1/3/1812", NextDate.nextDate(29, 2, 1812));
        assertEquals("1/12/2012", NextDate.nextDate(30, 11, 2012));
        assertEquals("Ngay khong hop le", NextDate.nextDate(0, 5, 2020));
        assertEquals("Ngay khong hop le", NextDate.nextDate(32, 12, 2020));
        assertEquals("Ngay khong hop le", NextDate.nextDate(15, 13, 2020));
        assertEquals("Ngay khong hop le", NextDate.nextDate(15, 5, 1811));
        assertEquals("Ngay khong hop le", NextDate.nextDate(15, 5, 2013));
    }
}