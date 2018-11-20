package com.atishay.springbootstarter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atishay.springbootstarter.entity.TopicDTO;
import com.atishay.springbootstarter.repository.ServiceRepository;

@Service
public class TopicService implements TopicServiceInterface {

	@Autowired
	private ServiceRepository serviceRepo;

	@Override
	public List<TopicDTO> getAllTopics() {
		return serviceRepo.findAll();
	}

	@Override
	public TopicDTO getTopicByID(long id) {
		return serviceRepo.findById(id).get();
	}

	@Override
	public List<TopicDTO> getTopicByName(String topicName) {
		return serviceRepo.findByName(topicName);
	}

	@Override
	public void addTopic(TopicDTO topic) {
		serviceRepo.save(topic);
	}

	@Override
	public void updateTopic(TopicDTO topic) {
		serviceRepo.save(topic);
	}

	@Override
	public void deleteTopic(long topicdId) {
		serviceRepo.deleteById(topicdId);
	}
}
