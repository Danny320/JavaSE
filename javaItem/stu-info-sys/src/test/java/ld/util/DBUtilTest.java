package ld.util;
import org.junit.Assert;
import org.junit.Test;
/**
 * @author LD
 * @date 2020/7/31 22:23
 */
public class DBUtilTest {

    @Test
    public void testConnection() {
        Assert.assertNotNull(DBUtil.getConnection());
    }
}
