package ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex02.MemberDAO;

public class MainClass {
	public static void main(String[] args) {
		
		//java설정으로 만들어진 bean파일은
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		//System.out.println(ctx.getBeanDefinitionCount());//10개. 내부적으로 동작하는 bean 6개 +만든 빈 4개
		
		MemberDAO dao=ctx.getBean("meberdao",MemberDAO.class);
		
		System.out.println(dao.getDatabaseDev().getUid());
		System.out.println(dao.getDatabaseDev().getUrl());
		System.out.println(dao.getDatabaseDev().getUpw());
		
	}
}
