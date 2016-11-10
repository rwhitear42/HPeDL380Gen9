/*******************************************************************************
 * Copyright (c) 2016 Russ Whitear, Cisco and others
 *
 * Unless explicitly stated otherwise all files in this repository are licensed
 * under the Apache Software License 2.0
 *******************************************************************************/
package com.cloupia.feature.HPeDL380Gen9.constants;


public class HPeDL380Gen9Constants {

	public static final String DEVICE_LIST_PROVIDER = "HPeGen9_DeviceListProvider";
	public static final String NEXUS_DEVICE_TABLE = "HPeGen9_DeviceTable";
	
	public static final String TEMP_EMAIL_ADDRESSES = "HPeGen9_email_address_list";
    public static final String NEXUS_DEVICE_LIST = "HPeGen9_nexus_device_list";
   
    public static final String EMAIL_TASK_OUTPUT_NAME = "Datacenter Email Addresses";
    public static final String EMAIL_TASK_OUTPUT_TYPE = "e-mail-as-string";
    
	public static final String NEXUS_DEVICES_LOV_PROVIDER = "NetworkDeviceList";

	public static final String HPeGen9_HELLO_WORLD_NAME = "HPeGen9_name_from_other_tasks";
	
	public static final String HPeGen9_MULTI_SELECT_TABULARVALUE_NAME = "HPeGen9SampleTabulerMultiInput";
	
	public static final String HPeGen9_HPeGen9_SAN_PROTOCOL_LOV_NAME = "HPeGen9_HPeGen9SanProtocolLovName";
	
	//this is the unique integer i'm giving for my dummy collector, it's a good idea
	//to use some large number past 1000 so you avoid any potential collisions
	public static final int DUMMY_ACCOUNT_TYPE = 6066;
	
	//some dummy strings used to represent inventory items
	public static final String INTERFACES = "interfaces";
	public static final String PORTS = "ports";
	
	public static final String DUMMY_INVENTORY_COLLECTOR_NAME = "Dummy_Inventory_Collector";
	
	public static final String DUMMY_VLAN_RESOURCE_TYPE = "HPeGen9.vlan.per.group.usage";
	public static final String DUMMY_VLAN_RESOURCE_DESC = "Max Dummy VLANs per group";
	
	public static final int DUMMY_MENU_1 = 11001;
	
	public static final String DUMMY_CONTEXT_ONE = "HPeGen9.dummy.context.one";
	public static final String DUMMY_CONTEXT_ONE_LABEL = "Dummy Context One";
	
	public static final String INFRA_ACCOUNT_LABEL = "HPeGen9 Account";
	public static final String INFRA_ACCOUNT_TYPE = "HPeGen9 Account";
	
	public static final String HPeGen9_ACCOUNT_DRILLDOWN_NAME = "HPeGen9.account.sample.child.drilldown.report";
	public static final String HPeGen9_ACCOUNT_DRILLDOWN_LABEL = "HPeGen9 Account Drilldown Sample";
	
	public static final String HPeGen9_MY_FIRST_DROPDOWN = "HPeGen9.my.first.dropdown";
	public static final String HPeGen9_MY_FIRST_DROPDOWN_LABEL = "HPeGen9 My First Dropdown Label";
	

	// Workflow task constants.
	public static final String GENERIC_TEXT_INPUT = "gen_text_input";
	public static final String PASSWORD = "password";
	public static final String BOOLEAN = "Boolean";
	
	// Workflow output values.
	public static final String HPeGen9_VOLUME_NAME = "HPeGen9_VOLUME_NAME";
	public static final String HPeGen9_VOLUME_COLLECTION_NAME = "HPeGen9_VOLUME_COLLECTION_NAME";
	public static final String HPeGen9_INITIATOR_GROUP_NAME = "HPeGen9_INITIATOR_GROUP_NAME";
	public static final String HPeGen9_INITIATOR_NAME = "HPeGen9_INITIATOR_NAME";
	public static final String HPeGen9_TARGET_NAME = "HPeGen9_TARGET_NAME";
	
}
