package sourceCode;

public class Test extends Test1{
	static void test1(){
		System.out.println("��̬����1");
	}
	
	static{
		System.out.println("Test��̬����飡");
	}
	
	{
		System.out.println("Test�����");
	}
	
	public Test(){
		System.out.println("���캯����");
	}
}

class Test1{
	static{
		System.out.println("Test1��̬����飡");
	}
	
	{
		System.out.println("Test1�����");
	}
	
	public Test1(){
		System.out.println("Test1�Ĺ��캯����");
	}
}
