/**
 * synchronized�ؼ���
 * ��ĳ���������
 * @author mashibing
 */

package yxxy.c_001;

public class T {

	private int count = 10;
	private Object o = new Object();

	public void m() {
		synchronized(o) { //�κ��߳�Ҫִ������Ĵ��룬�������õ�o����
			count--;
			System.out.println(Thread.currentThread().getName() + " count = " + count);
		}
	}

	public static void main(String[] args) {



		T t = new T();

		/*new Thread(()->t.m1(), "t1").start();
		new Thread(()->t.m2(), "t2").start();*/

		new Thread(t::m, "t1").start();
		new Thread(t::m, "t2").start();
	}


}

