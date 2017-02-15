package com.arushi.javaproject.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.arushi.javaproject.messenger.database.DatabaseClass;
import com.arushi.javaproject.messenger.model.Message;

public class MessageService {

	/**public List<Message> getAllMessages() {
		Message m1=new Message(1,"Hello..!","John");
		Message m2=new Message(2,"Bye..!","Doe");
		
		List<Message> list=new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		return list;
	}*/
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1, "Hello..!!", "Joe"));
		messages.put(2L, new Message(2, "Bye....!!", "Doe"));
	}
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if(message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
	
}
