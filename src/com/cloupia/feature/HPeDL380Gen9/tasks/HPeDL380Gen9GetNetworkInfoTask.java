/*******************************************************************************
 * Copyright (c) 2016 Russ Whitear, Cisco and others
 *
 * Unless explicitly stated otherwise all files in this repository are licensed
 * under the Apache Software License 2.0
 *******************************************************************************/
package com.cloupia.feature.HPeDL380Gen9.tasks;

import org.apache.log4j.Logger;

import com.cloupia.service.cIM.inframgr.AbstractTask;
import com.cloupia.service.cIM.inframgr.TaskConfigIf;
import com.cloupia.service.cIM.inframgr.TaskOutputDefinition;
import com.cloupia.service.cIM.inframgr.customactions.CustomActionLogger;
import com.cloupia.service.cIM.inframgr.customactions.CustomActionTriggerContext;
import com.rwhitear.ucsdHttpRequest.UCSDHttpRequest;
import com.rwhitear.ucsdHttpRequest.constants.HttpRequestConstants;




public class HPeDL380Gen9GetNetworkInfoTask extends AbstractTask {

	private static Logger logger = Logger.getLogger( HPeDL380Gen9GetNetworkInfoTask.class );
			
	@Override
	public void executeCustomAction(CustomActionTriggerContext context,
			CustomActionLogger actionLogger) throws Exception {
		
		HPeDL380Gen9GetNetworkInfoConfig config = (HPeDL380Gen9GetNetworkInfoConfig) context.loadConfigObject();

		
		logger.info("Running task...");
		
		String username = config.getUsername();
		String password = config.getPassword();
		String ipAddress = config.getIpAddress();
		
		String uri = "/redfish/v1/";
		
		int httpStatusCode = 0;
		
		actionLogger.addInfo("Username: " + username);
		actionLogger.addInfo("Password: " + password);
		actionLogger.addInfo("ILO IP Address: " + ipAddress);
		
		
		// Make a general SSL connection in order to make sure that cipher/self signed 
		// certs are working ok.
		UCSDHttpRequest request = new UCSDHttpRequest(ipAddress,"https", 443);
		
		request.addContentTypeHeader(HttpRequestConstants.CONTENT_TYPE_JSON);
		
		request.setUri( uri );
		
		request.setMethodType( HttpRequestConstants.METHOD_TYPE_GET );
		
		// Set this when using a POST method.
		//request.setBodyText( bodyText );
		
		request.execute();
		
		httpStatusCode  = request.getStatusCode();
		
		if( ( httpStatusCode != 201) && ( httpStatusCode != 200) ) {
			
			actionLogger.addError("ILO interface returned status code: " + request.getStatusCode() );
			
		} else {
			
			actionLogger.addInfo("ILO Response: " + request.getHttpResponse() );
			
		}		
		
	}

	@Override
	public TaskConfigIf getTaskConfigImplementation() {
		return new HPeDL380Gen9GetNetworkInfoConfig();
	}

	@Override
	public String getTaskName() {
		return HPeDL380Gen9GetNetworkInfoConfig.displayLabel;
	}

	@Override
	public TaskOutputDefinition[] getTaskOutputDefinitions() {
		return null;
	}
}
