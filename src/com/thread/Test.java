package com.thread;

public class Test {
public static void main(String[] args) {
	X obj = new X();
	Thread t1 = new Thread (obj);
	Thread t2 = new Thread (obj);
	Thread t3 = new Thread (obj);
	t1.start();
	t2.start();
	t3.start();

}
}
