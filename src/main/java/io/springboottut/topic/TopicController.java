package io.springboottut.topic;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired // for calling @service annotation defined in another class
   private TopicService topicService;
   @RequestMapping("/topics")
   public List<Topic> getAllTopics() {
	   return topicService.getAllTopics();
   }
   @RequestMapping("/topics/{id}")
   public Topic getTopic(@PathVariable("id") String id) { //path variable tells that we have to map id to a variable
	   return topicService.getTopic(id);
   }
   @RequestMapping(method=RequestMethod.POST,value="/topics")
   public void addTopic(@RequestBody Topic topic) {
	   topicService.addTopic(topic);
   }
   @RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
   public void updateTopic(@RequestBody Topic topic,@PathVariable("id") String id) {
	   topicService.updateTopic(topic,id);
   }
   @RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
   public void deleteTopic(@PathVariable("id") String id) {
	   topicService.deleteTopic(id);
   }
    
}
