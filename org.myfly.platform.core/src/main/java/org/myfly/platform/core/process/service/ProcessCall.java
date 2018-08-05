package org.myfly.platform.core.process.service;

import java.util.Properties;

/**
 * Interface for user started processes.
 * 
 * @author xiangwanhong
 *
 */
public interface ProcessCall {
	/**
	 * Start the process. Called when pressing the ... button in ... It should only
	 * return false, if the function could not be performed as this causes the
	 * process to abort.
	 * 
	 * @param ctx
	 * @param pi
	 * @return
	 */
	public boolean startProcess(Properties ctx, ProcessInfo pi);
}
