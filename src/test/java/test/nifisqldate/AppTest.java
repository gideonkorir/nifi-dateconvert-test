package test.nifisqldate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.DateFormat;

import org.junit.Test;
import org.apache.nifi.serialization.record.*;
import org.apache.nifi.serialization.record.util.DataTypeUtils;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        DateFormat dateFormat = DataTypeUtils.getDateFormat("yyyy/MM/dd");

        Object date = DataTypeUtils.convertType("2018/08/21", RecordFieldType.DATE.getDataType(), () -> dateFormat, null, null, "test");

        java.sql.Date actual = (java.sql.Date)date;
        assertEquals(java.sql.Date.valueOf("2018-08-21"), actual);

    }
}
