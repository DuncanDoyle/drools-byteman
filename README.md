# drools-byteman
Byteman scripts to debug Drools Sessions.

To enable Byteman, add the following JVM arguments on startup:
```
-javaagent:${BYTEMAN_HOME}/lib/byteman.jar=script:${BYTEMAN_SCRIPTS}/drools-byteman.btm,boot:${BYTEMAN_HOME}/lib/byteman.jar 
-Dorg.jboss.byteman.transform.all
```

Replace ${BYTEMAN_HOME} and ${BYTEMAN_SCRIPTS} with the location of your Byteman installation and the directory that contains the 'drools-byteman.btm' script.
The 'drools-byteman.btm' script can be found in the 'src/main/resources' directory of the 'drools-byteman' project.
