package org.jboss.ddoyle.drools.byteman.helper;

import org.drools.core.common.InternalFactHandle;
import org.drools.core.reteoo.AlphaNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlphaNodeHelper {

	private static final Logger LOGGER = LoggerFactory.getLogger(AlphaNodeHelper.class);
	
	public void printAlphaNodeAssertObject(AlphaNode node, InternalFactHandle factHandle) {
		LOGGER.info("BEGIN ALPHANODE ASSERTOBJECT");
		LOGGER.info("AlphaNode: " + node.toString());
		LOGGER.info("FactHandle: " + factHandle);
		LOGGER.info("END ALPHANODE ASSERTOBJECT");
	}
}
