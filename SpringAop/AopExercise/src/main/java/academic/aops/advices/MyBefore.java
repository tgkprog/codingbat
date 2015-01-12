package academic.aops.advices;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;
 
public class MyBefore implements MethodBeforeAdvice
{
	public void before(Method method, Object[] args, Object target)
		throws Throwable {
			
	        System.out.println("****SPRING AOP**** DoBeforeMethod :" + method.getName());
	        
	        if(args!= null){
	        	for(int i =0; i < args.length; i++){
	        		System.out.println("Arg :" + (i+1) + " val " + args[i] + "|");
	        	}
	        }
	        System.out.println("****SPRING AOP**** DoBeforeMethod End" );
	}
}
