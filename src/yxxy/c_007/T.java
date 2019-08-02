/**
 * 同步和非同步方法是否可以同时调用？
 * @author mashibing
 */

package yxxy.c_007;

public class T {

	public synchronized void m1() {
		System.out.println(Thread.currentThread().getName() + " m1 start...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " m1 end");
	}

	/** 没有 synchronized */
	public void m2() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " m2 ");
	}

	public synchronized void m3() {
		System.out.println(Thread.currentThread().getName() + " m3 start...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " m3 end");
	}

	public static void main(String[] args) {
		T t = new T();

		new Thread(t::m1, "t1").start();
		new Thread(t::m2, "t2").start();
		new Thread(t::m3, "t3").start();


	}

}
