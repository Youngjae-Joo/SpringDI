package ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("autowired-context.xml");
		
		Controller ctr=ctx.getBean(Controller.class);
		
		ctr.hello();
		
	}
}
