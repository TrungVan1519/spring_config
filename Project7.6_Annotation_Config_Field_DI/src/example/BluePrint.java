package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BluePrint {
	@Autowired
	@Value("This is a car")
	private String type;

	@Override
	public String toString() {
		return type;
	}
}