package aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;

public class CacheAspectt {
	
	private Map<Long, Object> cache = new HashMap<>();
	
	public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
		Long num = (Long)joinPoint.getArgs()[0];
		if(cache.containsKey(num)) {
			System.out.printf("CacheAspectt:Cache에서 구함[%d]\n", num);
			return cache.get(num);
			
		}
		Object result = joinPoint.proceed();
		cache.put(num, result);
		System.out.printf("CacheAspect: Cache에 추가[%d]\n",num);
		return result;
	}

}
