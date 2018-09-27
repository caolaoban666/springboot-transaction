import com.cyf.ReadConfigApplication;
import com.cyf.config.ConfigProps;
import com.cyf.utils.SpringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author cyf
 * @description
 * @create 2018-09-27 17:54
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ReadConfigApplication.class)
public class ConfigTest {

    // 常量
    private static final String VERSION = "cyf.version";
    private static final String AUTHOR = "cyf.author";
    private static final String DATE = "cyf.date";

    // 日志
    private static final Logger log = LoggerFactory.getLogger(ConfigTest.class);

    // 方式一： 将配置文件封装为一个bean
    @Autowired
    private ConfigProps configProps;

    // 方式二： 通过 Spring 提供的类获取配置文件
    @Autowired
    private Environment environment;

    // 方式三： 通过 @Value 注解获取配置文件
    @Value("${cyf.version}")
    private String version;
    @Value("${cyf.author}")
    private String author;
    @Value("${cyf.date}")
    private String date;

    // 测试 测试通过封装的配置Bean 的 toString 方法打印获取的配置文件
    @Test
    public void testProps(){
        System.out.println(configProps);
    }

    // 测试 通过 Spring 提供的类获取配置文件
    @Test
    public void testEnvironment(){
        log.info("get version by environment is {}",environment.getProperty(VERSION));
        log.info("get date by environment is {}",environment.getProperty(DATE));
        log.info("get author by environment is {}",environment.getProperty(AUTHOR));
    }

    // 测试 通过 @Value 注解获取配置文件
    @Test
    public void testValue(){
        log.info("get version by value is {}",version);
        log.info("get date by value is {}",date);
        log.info("get author by value is {}",author);
    }

    // 测试 通过SpringUtils 来获取Spring 管理的Bean 对象，可以不用通过 @Autowired 来注入
    @Test
    public void testGetSpringBean(){
        ConfigProps bean = SpringUtils.getBean(ConfigProps.class);
        System.out.println(bean);
    }

}
