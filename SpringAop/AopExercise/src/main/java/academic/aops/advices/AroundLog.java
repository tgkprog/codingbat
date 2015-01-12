package academic.aops.advices;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundLog {

	public Object doAroundMethodBean(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("Before invoking method:");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After invoking  method. Return value :" + value + ".");
		return value;
	}
}