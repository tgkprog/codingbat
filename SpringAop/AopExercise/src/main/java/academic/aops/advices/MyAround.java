package academic.aops.advices;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodProxy;

public class MyAround implements // MethodBeforeAdvice,

		MethodInterceptor {
	//

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Intercepted DoAround 2");
		Object args[] = invocation.getArguments();
		Method method = invocation.getMethod();
		Object obTarget = invocation.getThis();
		System.out.println("****SPRING AOP**** DoAroundMethod :" + method.getName());

		if (args != null) {
			for (int i = 0; i < args.length; i++) {
				System.out.println("Arg :" + (i + 1) + " val " + args[i] + "|");
			}
		}
		try {
			Object ret = invocation.proceed();
			System.out.println("****SPRING AOP**** DoAroundMethod End");
			//Object ret = method.invoke(obTarget, args);
			return ret;//method could be returning an object
			//spring looks after if null
		} catch (Exception e) {
			System.out.println("****SPRING AOP**** *EX* DoAroundMethod End");
			System.out.println("Err " + e);
			throw e;
		}
	}
}
