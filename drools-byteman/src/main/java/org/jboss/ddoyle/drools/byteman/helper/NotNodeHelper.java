package org.jboss.ddoyle.drools.byteman.helper;

import org.drools.core.common.InternalFactHandle;
import org.drools.core.reteoo.NotNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotNodeHelper {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(NotNodeHelper.class);
	
	public void printNotNodeAssertObject(NotNode node, InternalFactHandle factHandle) {
		LOGGER.info("BEGIN NOTNODE ASSERTOBJECT");
		LOGGER.info("NotNode: " + node.toString());
		LOGGER.info("FactHandle: " + factHandle);
		LOGGER.info("END NOTNODE ASSERTOBJECT");
	}

}
