package cane.brothers.demo.service;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import cane.brothers.demo.service.intern.DemoServiceImpl;

public class DemoServiceActivator extends Plugin {

	private static BundleContext context;

	private static DemoServiceActivator instance;

	public static DemoServiceActivator getDefault() {
		return instance;
	}
	
	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Starting demo service");
		super.start(bundleContext);
		instance = this;
		registerServices();
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stoping demo service");
		DemoServiceActivator.context = null;
	}
	
	/**
	 * Registers this bundles local service implementations.
	 */
	private void registerServices() {
		BundleContext bundleContext = getBundle().getBundleContext();
		DemoServiceImpl demoService = new DemoServiceImpl();
		bundleContext.registerService(IDemoService.class, demoService,
				null);
	}

}
