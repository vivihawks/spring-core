package net.javaguides.spring.lazy;

public class SecondBean {
	
	@Autowired
	private FirstBean firstBean;
	
	public SecondBean() {
		System.out.println("Inside SecondBean Constuctor");
	}

	public void test() {
		System.out.println("Method of SecondBean Class");
	}
}
