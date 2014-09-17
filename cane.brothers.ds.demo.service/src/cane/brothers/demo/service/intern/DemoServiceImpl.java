package cane.brothers.demo.service.intern;

import cane.brothers.demo.service.IDemoService;

public class DemoServiceImpl implements IDemoService {

	@Override
	public String getDemo() {
		return "demo"; //$NON-NLS-1$
	}
	
	@Override
	public String toString() {
		return "[Demo service implementation]";
	}
}
