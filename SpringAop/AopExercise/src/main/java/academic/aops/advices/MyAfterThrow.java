package academic.aops.advices;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MyAfterThrow implements ThrowsAdvice{

	public  void afterThrowing(Method m, Object[] args, Object target, Throwable err){
		
	}
}
