package academic.aop1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import academic.aop1.sd.Lop;
/**
 * Hello AOP world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	///u/prog/git/tgkprog/codingbat/SpringAop/Aop/src/main/resources/context.xml
        System.out.println( "Hello World! v7" );
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("context2.xml");
		MyService simpleService = (MyService) context.getBean("simpleServiceAlias");
		Lop lop = (Lop) context.getBean("lop");
		lop.print(7);
		
		ABean ab = (ABean) context.getBean("ABean");
		ab.do1("m");
		ab.do1();
		simpleService.printNameId();
		System.out.println("--------------");
		try{
			simpleService.checkName();
		} catch(Exception e){
			System.out.println("SimpleService: Method checkName() exception thrown..");
		}
		System.out.println("--------------");
		simpleService.sayHello("Happy Geek");
		context.close();
    }
}
