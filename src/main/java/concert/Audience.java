package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//面向切面AOP的开发学习
@Aspect
public class Audience {
	
	//定义切点名
	@Pointcut("execution(** concert.Performace.perform(..))")
	public void perfomance(){
		
	};
	
	//环绕通知方法
	@Around("perfomance()")
	public void watchPerformance(ProceedingJoinPoint jp){
		try{
			System.out.println("关闭手机");
			System.out.println("观众入座");
			jp.proceed();
			System.out.println("观众鼓掌");
		}catch(Throwable e){
			System.out.println("观众退票");
		}

	}
	
	/*//表演前-观众关闭手机
	@Before("perfomance()")
	public void silenceCellPhones(){
		System.out.println("关闭手机");
	} 
	
	//表演前-观众入座
	@Before("perfomance()")
	public void takeSeats(){
		System.out.println("观众入座");
	}
	
	//表演后-观众鼓掌
	@AfterReturning("perfomance()")
	public void applause(){
		System.out.println("观众鼓掌");
	}
	
	//表演失败后-观众退票
	@AfterThrowing("perfomance()")
	public void demandRefund(){
		System.out.println("观众退票");
	}*/
}
