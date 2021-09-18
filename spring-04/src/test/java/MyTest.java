import com.python.go.Computer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Computer computer = context.getBean("computer", Computer.class);
        computer.getAmd().show();
        computer.getInter().show();
        computer.setComputer_name("e14");
        System.out.println(computer.toString());
    }
}
