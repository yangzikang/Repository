package blockTest;

public class Main {
	static BlockTest bt,bt2;
	public static void main(String [] args){
		bt = new BlockTest();
		bt2 = new BlockTest();
		bt.output();
	}
}

class BlockTest{
	
	static{
		System.out.println("static block");
	}
	
	{
		System.out.println("normal block");
	}
	
	BlockTest(){
		System.out.println("构造函数");
	}
	
	void output(){
		System.out.println("output");
	}
}
