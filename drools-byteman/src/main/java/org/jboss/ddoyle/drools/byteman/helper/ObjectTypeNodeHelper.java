package org.jboss.ddoyle.drools.byteman.helper;

import org.drools.core.common.InternalFactHandle;
import org.drools.core.reteoo.ObjectTypeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObjectTypeNodeHelper {

	private static final Logger LOGGER = LoggerFactory.getLogger(ObjectTypeNodeHelper.class);
	
	public void printObjectTypeNodeAssertObject(ObjectTypeNode node, InternalFactHandle factHandle) {
		LOGGER.info("BEGIN OBJECTTYPENODE ASSERTOBJECT");
		LOGGER.info("ObjectTypeNode: " + node.toString());
		LOGGER.info("FactHandle: " + factHandle);
		LOGGER.info("END OBJECTTYPENODE ASSERTOBJECT");
		
			
	}
}
