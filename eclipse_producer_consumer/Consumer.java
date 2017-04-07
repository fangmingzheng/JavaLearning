package com._520it.eclipse_producer_consumer;

public class Consumer implements Runnable {
	private ShareResource resource = null;
	public Consumer(ShareResource resource){
		this.resource = resource;
	}
	
	public void run(){
		for (int i = 0; i < 50; i++){
			resource.popup();
		}
	}

}
