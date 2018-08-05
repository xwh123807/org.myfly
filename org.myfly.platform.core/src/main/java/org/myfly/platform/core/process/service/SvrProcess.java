package org.myfly.platform.core.process.service;

import java.util.Properties;

public abstract class SvrProcess implements ProcessCall {
	private Properties ctx;
	private ProcessInfo processInfo;

	/**
	 * 可以先做参数的预处理
	 */
	abstract protected void prepare();

	/**
	 * Perform process.
	 * 
	 * @return Message (variables are parsed)
	 * @throws Exception
	 */
	abstract protected String doIt() throws Exception;

	/**
	 * Validate Parameters
	 */
	private void validateParameter() {

	}

	/**
	 * Post process actions (outside trx). Please note that at this point the
	 * transaction is committed so you can't rollback. This method is useful if you
	 * need to do some custom work when the process complete the work (e.g. open
	 * some windows).
	 * 
	 * @param success
	 *            true if the process was success
	 */
	protected void postProcess(boolean success) {
	}

	/**
	 * Start the process. Calls the abstract methods <code>process</code>. It should
	 * only return false, if the function could not be performed as this causes the
	 * process to abort.
	 */
	@Override
	public boolean startProcess(Properties ctx, ProcessInfo pi) {
		return false;
	}

	/**
	 * Process
	 * 
	 * @return true if success
	 */
	private boolean process() {
		return false;

	}
}
