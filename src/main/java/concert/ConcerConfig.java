package concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//以下标注启用了AspectJ自动代理
@Configuration
@EnableAspectJAutoProxy
@Component
public class ConcerConfig {
	
	//声明观众bean（切面）
	@Bean
	public Audience audience(){
		return new Audience();
	}
}
