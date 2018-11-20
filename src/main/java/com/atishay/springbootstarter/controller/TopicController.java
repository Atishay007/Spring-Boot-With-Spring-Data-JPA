package com.atishay.springbootstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atishay.springbootstarter.entity.TopicDTO;
import com.atishay.springbootstarter.services.TopicServiceInterface;

/**
 * This @RestController annotation is used to tell the spring that this is the
 * class which has Specific URI to accept request from web.
 * 
 * @author Champ
 *
 */
@RestController
public class TopicController {

	@Autowired
	private TopicServiceInterface topicService;

	@RequestMapping("/topics")
	public List<TopicDTO> getAllTopics() {
		return topicService.getAllTopics();
	}

	/**
	 * If we have to send Parameter. If we want different name then we can change
	 * the method signature like
	 * 
	 * @RequestMapping("/topic/{foo}") public Topic getTopic(@PathVariable("foo")
	 * int id) {
	 * 
	 * Instead of RequestMapping I have used GetMapping.
	 */
	@GetMapping("/topic/{id}")
	public TopicDTO getTopic(@PathVariable int id) {
		return topicService.getTopicByID(id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/topicName/{name}")
	public List<TopicDTO> getTopic(@PathVariable("name") String topicName) {
		return topicService.getTopicByName(topicName);
	}

	/**
	 * THis is used to add new topic in the list.
	 * 
	 * @param topic
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/addTopic")
	public String addTopic(@RequestBody TopicDTO topic) {
		topicService.addTopic(topic);
		return "Topic Added Successfully.";
	}

	/**
	 * Method to Update the topic.
	 * 
	 * @param topic
	 */
	@PutMapping("/updateTopic")
	public String updateTopic(@RequestBody TopicDTO topic) {
		topicService.updateTopic(topic);
		return "Topic Updated Successfully.";
	}

	/**
	 * Method to delete a single topic from the topic list
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteTopic/{id}")
	public String deleteTopic(@PathVariable int id) {
		topicService.deleteTopic(id);
		return "Topic Deleted Successfully.";
	}
}
