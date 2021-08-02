package io.springboottut.topic;

import java.util.*;
import java.util.Arrays;

import org.springframework.stereotype.Service;

//Business Services in spring that it makes an instance of this class and if any other class get this, this @service will provided to that class
@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList( //Arrays.asList is immutable so we have to make new Arraylist
			   new Topic("Spring","Spring Framework","Spring Boot Tutorials"),
			   new Topic("Javascript","ReactJS","ReactJS Tutorials"),
			   new Topic("Java","Core Java","Core Java Tutorials")
			   ));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	public Topic getTopic(String id) {
		 return topics.stream().filter((t)->t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	public void updateTopic(Topic topic,String id) {
		for(int i=0;i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i,topic);
				return;
			}
		}
	}
	public void deleteTopic(String id) {
		topics.removeIf((t)->t.getId().equals(id));
	}
}
