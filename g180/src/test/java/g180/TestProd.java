package g180;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tka.ProductDao;

import junit.framework.Assert;

public class TestProd {

	@Test
	public void test() {
		Assert.assertEquals(1, ProductDao.updateRecord());
	}

}
