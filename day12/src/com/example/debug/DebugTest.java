package com.example.debug;

/**
 * 如何调试程序
 * 	Debug 方式启动
 * 	f5,f6,f7,f8 的作用
 * 	f5: 进入方法内部，如果不是方法，就进入下一行
 * 	f6: 一行一行的执行，不关注细节，只关注每一行的结果
 * 	f7：从方法里面退出，返回到调用方法的那一层
 * 	f8: 执行完程序，输出结果，如果中间有断点，进入下一个断点的地方
 */
public class DebugTest {
	
	public static void main(String[] args) {
		int i = 10 ;
		int j = 20 ;
		System.out.println( "i=" + i + ",j="+ j);
		DebugTest debugTest = new DebugTest();
		int max = debugTest.getMax(i, j);
		System.out.println("max=" +  max);
	}
	public int getMax(int m ,int n) {
		if (m > n) {
			return m;
		}else {
			return n;
		}
	}

}
