package com.atishay.springbootstarter.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.atishay.springbootstarter.entity.TopicDTO;

@Repository
public interface TopicServiceInterface {

	public List<TopicDTO> getAllTopics();

	public TopicDTO getTopicByID(long id);

	public List<TopicDTO> getTopicByName(String topicName);

	public void addTopic(TopicDTO topic);

	public void updateTopic(TopicDTO topic);

	public void deleteTopic(long topicdId);
}
