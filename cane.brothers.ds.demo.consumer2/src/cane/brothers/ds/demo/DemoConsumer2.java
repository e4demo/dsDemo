package cane.brothers.ds.demo;

import cane.brothers.demo.service.IDemoService;

public class DemoConsumer2 {

	public void getDemo() {
		IDemoService service = Consumer2DemoActivator.getDefault().getDemoService();
		if(service != null) {
		System.out.println(service.getDemo());
		} else {
			System.out.println("there are no demo service");
		}
	}
}
