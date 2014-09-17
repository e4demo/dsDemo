package cane.brothers.ds.demo;

import cane.brothers.demo.service.IDemoService;

public class DemoConsumer1 {

	private IDemoService service;

	public void getDemo() {
		System.out.println(service.getDemo());
	}
	
	// Method will be used by DS to set the demo service
	  public synchronized void bindDemoService(IDemoService service) {
	    System.out.println("bind demo service on 1-st consumer");
	    this.service = service;
	    System.out.println(service);
	  }

	  // Method will be used by DS to unset the demo service
	  public synchronized void unbindDemoService(IDemoService service) {
	    System.out.println("unbind demo service from 1-st consumer");
	    if (this.service == service) {
	      this.service = null;
	    }
	  }

}
