package org.jboss.ddoyle.drools.byteman.helper;

import org.drools.core.common.LeftTupleSets;
import org.drools.core.common.NetworkNode;
import org.drools.core.reteoo.SegmentMemory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuleNetworkEvaluatorHelper {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RuleNetworkEvaluatorHelper.class);
	
	public void printTuplesInRuleNetworkEvaluator(NetworkNode node, LeftTupleSets srcTuples) {
		LOGGER.info("NetworkNode: " + node);
		LOGGER.info("Source LeftTupleSets: " + srcTuples.toString());
		
	}
	
	public void printSegmentMemories(SegmentMemory[] segmentMemories) {
		LOGGER.info("BEGIN PRINT SEGMENT MEMORIES");
		LOGGER.info("Number of segment memories: " + segmentMemories.length);
		for (SegmentMemory nextSegMem: segmentMemories) {
			LOGGER.info("Segment number: " + nextSegMem.getPos());
			LeftTupleSets segMemStagedLeftTuples = nextSegMem.getStagedLeftTuples();
			LOGGER.info("Segment staged left tuples: " + segMemStagedLeftTuples);
			SegmentMemory firstSegMem = nextSegMem.getFirst();
			if (firstSegMem != null) {		
				LeftTupleSets segMemFirstStagedLeftTuples = firstSegMem.getStagedLeftTuples();
				LOGGER.info("Segment getFirst staged left tuples: " + segMemFirstStagedLeftTuples);
			} else {
				LOGGER.info("SegmentMemory getFirst is 'null'");
			}
		}
		LOGGER.info("END PRINT SEGMENT MEMORIES");
	}
}
