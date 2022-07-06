package com.online.jobportalproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="message")
public class message {
	
	@Id
	int msgid;
	String messageString;
	public message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public message(int msgid, String messageString) {
		super();
		this.msgid = msgid;
		this.messageString = messageString;
	}
	public int getMsgid() {
		return msgid;
	}
	public void setMsgid(int msgid) {
		this.msgid = msgid;
	}
	public String getMessageString() {
		return messageString;
	}
	public void setMessageString(String messageString) {
		this.messageString = messageString;
	}
	
	
	
	

}
