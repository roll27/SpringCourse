package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//��������AOP�Ŀ���ѧϰ
@Aspect
public class Audience {
	
	//�����е���
	@Pointcut("execution(** concert.Performace.perform(..))")
	public void perfomance(){
		
	};
	
	//����֪ͨ����
	@Around("perfomance()")
	public void watchPerformance(ProceedingJoinPoint jp){
		try{
			System.out.println("�ر��ֻ�");
			System.out.println("��������");
			jp.proceed();
			System.out.println("���ڹ���");
		}catch(Throwable e){
			System.out.println("������Ʊ");
		}

	}
	
	/*//����ǰ-���ڹر��ֻ�
	@Before("perfomance()")
	public void silenceCellPhones(){
		System.out.println("�ر��ֻ�");
	} 
	
	//����ǰ-��������
	@Before("perfomance()")
	public void takeSeats(){
		System.out.println("��������");
	}
	
	//���ݺ�-���ڹ���
	@AfterReturning("perfomance()")
	public void applause(){
		System.out.println("���ڹ���");
	}
	
	//����ʧ�ܺ�-������Ʊ
	@AfterThrowing("perfomance()")
	public void demandRefund(){
		System.out.println("������Ʊ");
	}*/
}
