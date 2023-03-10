package ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//Car, Airplane 빈을 생성하고, 의존성 주입
		//각 객체 안에 있는 배터리를 자바클래스에서 출력.

		GenericXmlApplicationContext ctx =
new GenericXmlApplicationContext("quiz01-context.xml");
		
		Airplane airplane=ctx.getBean(Airplane.class);
		Car car=ctx.getBean(Car.class);
		//Car car=(Car)ctx.getBean("car"); - 최상위 Object를 가져오므로 형변환을 해줘야 한다.
		
		airplane.getBattery().energy();
		car.getBattery().energy();
	}
}
