package com._520it.eclipse_producer_consumer_lock;

public class Producer implements Runnable {
	private ShareResource resource = null;
	public Producer(ShareResource resource){
		this.resource = resource;
	}
	

	@Override
	public void run() {
		for(int i = 1; i < 50; i++){
			if ( i % 2 == 0){
				resource.push("spiderman", "male");
			}else{
				resource.push("ladygaga", "female");
			}
		}
		
	}

}
