import cc.bluemix.domain.Customer;
import cc.bluemix.mapper.CustomerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liuyang
 * @version 1.0
 * @description PACKAGE_NAME
 * @date 2018/10/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CustomerMapperTest {

    @Autowired
    private CustomerMapper customerMapper;
    @Test
    public void testSave(){
        Customer customer = new Customer();
        customer.setName("zhangsan");
        customer.setAge(18);
        customer.setGender("man");
        customerMapper.save(customer);
    }
}
