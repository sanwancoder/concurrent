/**
 * synchronized�ؼ���
 * ��ĳ���������
 * @author mashibing
 */

package yxxy.c_003;

public class T {

	private int count = 10;

	public synchronized void m() { //��ͬ���ڷ����Ĵ���ִ��ʱҪsynchronized(this)
		count--;
		System.out.println(Thread.currentThread().getName() + " count = " + count);
	}

	public static void main(String[] args) {
		T t = new T();

		new Thread(()->t.m(),"t5").start();
		new Thread(()->t.m(),"t6").start();
	}


}
