package dev.dulred.demo;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.dulred.demo.config.ConfigBean;
import dev.dulred.demo.entity.User;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class DemoApplicationTests {

	@Test
	void contextLoads() {
		log.info("nishizhu");
	}


	@Test
	public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigBean.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            //别名
            String[] aliases = context.getAliases(beanName);
            System.out.println(String.format("bean名称:%s,别名:%s,bean对象:%s",
                    beanName,
                    Arrays.asList(aliases),
                    context.getBean(beanName)));
        }

		User user1 =(User)context.getBean("myUser2");
    }


	@Autowired
    ApplicationContext ioc;
	
    @Test
    public void hello(){
        User helloService = (User)ioc.getBean("myUser2");
        System.out.println(helloService);
    }

    @Test 
    public void hashcodeAndEquals(){

        double d = 1100.00;
        boolean b = true;
        long l = 1234567890;
        char[] arr = {'r', 'u', 'n', 'o', 'o', 'b' };
        int cc = 132;
        System.out.println("返回值 : " + String.valueOf(d));
        System.out.println("返回值 : " + String.valueOf(b));
        System.out.println("返回值 : " + String.valueOf(l));
        System.out.println("返回值 : " + String.valueOf(arr));
        System.out.println(Integer.valueOf(132) == cc); //true

    
    }

    @Test 
    public void cc2(){

        Integer it = new Integer(2);
        Integer it2 = new Integer(2);
        
        System.out.println(it.equals(it2));

        String str1 = new String("333");
        String str2 = new String("333");
        
        System.out.println(str1.equals(str2));
    
    }


}

@Data
class Person {
    private String name ;
}

@Data
class Woman extends Person {
    private String hair;
}

class Man extends Person {
    private String ggb;
}