package ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	
	/*
	 * @Autowired-타입으로 빈을 주입->이름으로 찾아서 빈을 주입
	 * - 생성자, 세터, 멤버변수(세터 or 멤버변수는 반드시 기본생성자가 필요)
	 * 
	 * @Resource -이름으로 빈을 주입->타입으로 찾아서 빈을 주입
	 * 
	 * @Qualifier - 빈 이름의 강제 연결
	 * 컨테이너에 동일한 객체가 여러개 있을 떄 어느 객체를 주입할지
	 * 선택해주는 어노테이션
	 * 
	 */
	
	
	@Autowired
	@Qualifier(value="doc1")
	private Document doc;
	
	//기본생성자
	public Printer() {
		
	}
	//생성자
	public Printer(Document doc) {
		this.doc = doc;
	}

	//getter, setter
	public Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}
	
	
}
