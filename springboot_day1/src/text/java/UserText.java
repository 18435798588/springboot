import com.baizhi.App;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class UserText {
    @Autowired
    private UserService userService;
    @Test
    public void m1(){
        User user=new User();
        user.setUsername("你好再见");
        user.setName("张三");
        user.setPassword("123");
        user.setSex("男");

        userService.add(user);
    }
}
