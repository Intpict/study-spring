import com.intpict.CarInvoke;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: linsen
 * Date: 18/3/24
 * Time: 下午8:53
 * Description:
 */
public class BootStrap {

    public static void main(String[] args) {
        ApplicationContext ctx=
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        CarInvoke invoke = ctx.getBean(CarInvoke.class);
        // 静态方法不能被切到
        invoke.desc();
        // 方法被切
        invoke.clean();
        // 同类里面一个方法调这个类里面的另外一个方法：
        // 只能被切一次
        invoke.drive();
        // 此时用注入的同类Bean显示调另外一个方法，会被切两次
        invoke.singleDrive();
    }

}
