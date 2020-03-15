/**
 * synchronized�ؼ���
 * ��ĳ���������
 * @author mashibing
 */

package yxxy.c_002;

public class T {

	private int count = 10;

	public void m() {
		synchronized(this) { //�κ��߳�Ҫִ������Ĵ��룬�������õ�this����
			count--;
			System.out.println(Thread.currentThread().getName() + " count = " + count);
		}
	}

	public static void main(String[] args) {
		T t = new T();

		new Thread(t::m,"t3").start();
		new Thread(t::m,"t4").start();

	}

}

