package com.amazon.test;

public class Chest {
	private int num;
	private int[] keys;
	private int lock;

	public Chest(int num, int lock, int[] keys) {
		this.setNum(num);
		this.setKeys(keys);
		this.setLock(lock);
	}

	public int[] getKeys() {
		return keys;
	}

	public void setKeys(int[] keys) {
		this.keys = keys;
	}

	public int getLock() {
		return lock;
	}

	public void setLock(int lock) {
		this.lock = lock;
	}
	
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
}
