import com.yuqiyu.rabbitmq.topic.provider.RabbitMqTopicProviderApplication;
import com.yuqiyu.rabbitmq.topic.provider.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2018-04-30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMqTopicProviderApplication.class)
public class RabbitMqTester {
    /**
     * 用户业务逻辑
     */
    @Autowired
    private UserService userService;

    /**
     * 模拟随机创建用户 & 发送消息到注册用户消息队列
     *
     * @throws Exception
     */
    @Test
    public void testTopicMessage() throws Exception {
        userService.randomCreateUser();
    }
}