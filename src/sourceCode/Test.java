package sourceCode;

public class Test extends Test1{
	static void test1(){
		System.out.println("静态方法1");
	}
	
	static{
		System.out.println("Test静态代码块！");
	}
	
	{
		System.out.println("Test代码块");
	}
	
	public Test(){
		System.out.println("构造函数！");
	}
}

class Test1{
	static{
		System.out.println("Test1静态代码块！");
	}
	
	{
		System.out.println("Test1代码块");
	}
	
	public Test1(){
		System.out.println("Test1的构造函数！");
	}
}
