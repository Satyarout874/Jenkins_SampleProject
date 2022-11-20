package in.STechsolution.Testcases;

class A {
	public void m1() {
		System.out.println("A.m1()");
	}
}

class B extends A {
	public void m1() {
		System.out.println("B.m1()");
	}

	public void m2() {
		System.out.println("B.m2()..........B");
	}
}

class C extends B {
	public void m1() {
		System.out.println("C.m1()");
	}

	public void m3() {
		System.out.println("C.m3()..................C");
	}
}

public class SampleProg {
	public static void main(String[] args) {
		//C c1 = new C();
		A b1=new C();
		b1.m1();
		((B) b1).m2();
		((C) b1).m3();
		b1.m1();
		((B) b1).m2();

	}
}
