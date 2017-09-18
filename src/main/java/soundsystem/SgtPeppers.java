package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{

	public void play() {
		System.out.println("Hello World");
	}
	
}
