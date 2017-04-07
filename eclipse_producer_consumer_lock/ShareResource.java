package com._520it.eclipse_producer_consumer_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShareResource {
	private String name;
	private String gender;
	Lock lock = new ReentrantLock();
	private boolean isEmpty = true;
	private Condition cond = lock.newCondition();

public void push(String name, String gender) {
		lock.lock();
		try {
			while (!isEmpty) {
				cond.await();
			}
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			isEmpty = false;
			cond.signal();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}

public void popup() {
		lock.lock();
		try {
			while (isEmpty) {
				cond.await();
			}

			Thread.sleep(10);
			System.out.println(this.name + "_" + this.gender);
			isEmpty = true;
			cond.signal();

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}

}
