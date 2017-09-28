package concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//���±�ע������AspectJ�Զ�����
@Configuration
@EnableAspectJAutoProxy
@Component
public class ConcerConfig {
	
	//��������bean�����棩
	@Bean
	public Audience audience(){
		return new Audience();
	}
}
