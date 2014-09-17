package cane.brothers.ds.demo;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.eclipse.core.runtime.Plugin;

import cane.brothers.demo.service.IDemoService;


public class Consumer2DemoActivator extends Plugin {

	private static Consumer2DemoActivator instance;
	 
	public static Consumer2DemoActivator getDefault() {
		return instance;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
	    System.out.println("Starting 2-nd demo consumer bundle");
	    super.start(bundleContext);
	    instance = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
	    System.out.println("Stopping 2-nd demo consumer bundle");
	    super.stop(bundleContext);
	}
	
	/**
	 * Registers this bundles local service implementations.
	 */
	public IDemoService getDemoService() {
		BundleContext bundleContext = getBundle().getBundleContext();
		ServiceReference<?> serviceReference = bundleContext.
				  getServiceReference(IDemoService.class.getName());
		IDemoService demoService = null;
		demoService = (IDemoService) bundleContext.
				  getService(serviceReference);
		return demoService; 
		
	}

}
