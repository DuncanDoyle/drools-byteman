package org.jboss.ddoyle.drools.byteman.helper;

import org.drools.core.common.LeftTupleSets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PhreakRuleTerminalNodeHelper {

	private static final Logger LOGGER = LoggerFactory.getLogger(PhreakRuleTerminalNodeHelper.class);
	
	private static final String NAME = "PhreakRuleTerminalNode";
	
	public void printPhreakNodeDoNodeEntry(Object node, LeftTupleSets srcLeftTuples) {
		String name = getPhreakNodeName();
		LOGGER.info("BEGIN " + name + " DONODE-ENTRY");
		LOGGER.info("PhreakNode: " + node.toString());
		LOGGER.info("srcLeftTuples: " + srcLeftTuples);
		LOGGER.info("END " + name + " DONODE-ENTRY");
	}
	
	public String getPhreakNodeName() {
		return NAME;
	}

}
