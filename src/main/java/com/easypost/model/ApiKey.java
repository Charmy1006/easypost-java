package com.easypost.model;

import com.easypost.net.EasyPostResource;

public class ApiKey extends EasyPostResource {
    String mode;
    String key;
    String id;
    Boolean active;
    String object;

    public String getMode() { return mode; }
    public void setMode(String mode) { this.mode = mode; }

    public String getId() {	return id;}
	public void setId(String id) { this.id = id; }
	
	public Boolean getActive() {return active;}
	public void setActive(Boolean active) { this.active = active;}
	
	public String getObject() {	return object; }
	public void setObject(String object) {	this.object = object; }
	
	public String getKey() { return key; }
    public void setKey(String key) { this.key = key; }
}

