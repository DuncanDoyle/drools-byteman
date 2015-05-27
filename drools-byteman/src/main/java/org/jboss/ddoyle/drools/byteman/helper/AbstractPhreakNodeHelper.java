package org.jboss.ddoyle.drools.byteman.helper;

import org.drools.core.common.LeftTupleSets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractPhreakNodeHelper {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AbstractPhreakNodeHelper.class);
	
	public void printPhreakNodeDoNodeEntry(Object node, LeftTupleSets srcLeftTuples, LeftTupleSets stagedLeftTuples) {
		String name = getPhreakNodeName();
		LOGGER.info("BEGIN " + name + " DONODE-ENTRY");
		LOGGER.info("PhreakNode: " + node.toString());
		LOGGER.info("srcLeftTuples: " + srcLeftTuples);
		LOGGER.info("stagedLeftTuples: " + stagedLeftTuples);
		LOGGER.info("END " + name + " DONODE-ENTRY");
	}
	
	public void printPhreakNodeDoNodeExit(Object node, LeftTupleSets trgLeftTuples) {
		String name = getPhreakNodeName();
		LOGGER.info("BEGIN " + name + " DONODE-EXIT");
		LOGGER.info("PhreakNode: " + node.toString());
		LOGGER.info("trgLeftTuples: " + trgLeftTuples);
		LOGGER.info("END " + name + " DONODE-EXIT");
	}	

	public abstract String getPhreakNodeName(); 
	
}
