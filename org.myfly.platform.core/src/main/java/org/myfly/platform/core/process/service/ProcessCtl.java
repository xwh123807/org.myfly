package org.myfly.platform.core.process.service;

/**
 * Process Interface Controller.
 * 
 * @author xiangwanhong
 *
 */
public class ProcessCtl implements Runnable {
	private ProcessInfo processInstance;
	private boolean isServerProcess = false;

	@Override
	public void run() {

	}

	/**
	 * Start Java Process Class. instanciate the class implementing the interface
	 * ProcessCall
	 * 
	 * @return
	 */
	private boolean startJavaProcess() {
		return false;
	}

	/**
	 * Start Database Process <br>
	 * 
	 * @param ProcedureName
	 *            ProcedureName PL/SQL procedure name
	 * @return true if success
	 */
	private boolean startDBProcess(String ProcedureName) {
		return false;
	}
}
