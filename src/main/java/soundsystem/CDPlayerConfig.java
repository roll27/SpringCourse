package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="soundsystem")   //组件扫描指定包。

//Java代码声明bean。
public class CDPlayerConfig {
	@Bean
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}
	
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc){
		return new CDPlayer(compactDisc);
	}
}
