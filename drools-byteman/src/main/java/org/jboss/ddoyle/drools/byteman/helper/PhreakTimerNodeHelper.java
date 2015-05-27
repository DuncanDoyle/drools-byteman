package org.jboss.ddoyle.drools.byteman.helper;

import org.drools.core.common.InternalWorkingMemory;
import org.drools.core.common.LeftTupleSets;
import org.drools.core.reteoo.LeftTuple;
import org.drools.core.reteoo.LeftTupleSink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Helper class for Byteman to determine the root-cause of the NPE in the PreakTimerNode.
 * 
 * 
 * @author <a href="mailto:duncan.doyle@redhat.com">Duncan Doyle</a>
 */
public class PhreakTimerNodeHelper extends AbstractPhreakNodeHelper {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PhreakTimerNodeHelper.class);
	
	private static final String NAME = "PhreakTimerNode";
	
	@Override
	public String getPhreakNodeName() {
		return NAME;
	}
	
	public void printDoLeftDeletes (LeftTupleSink sink, InternalWorkingMemory wm, LeftTupleSets srcLeftTuples, LeftTupleSets trgLeftTuples, LeftTupleSets stagedLeftTuples, LeftTuple childLeftTuple) {
		LOGGER.info("BEGIN PHREAKTIMERNODE DOLEFTDELETES");
		LOGGER.info("LeftTupleSink: " + sink);
		LOGGER.info("InternalWorkingMemory: " + wm);
		LOGGER.info("srcLeftTuples: " + srcLeftTuples);
		LOGGER.info("trgLeftTuples: " + trgLeftTuples);
		LOGGER.info("stagedLeftTuples: " + stagedLeftTuples);
		LOGGER.info("childLeftTuple: " + childLeftTuple);
		LOGGER.info("END PHREAKTIMERNODE DOLEFTDELETES");
	}
	
}