package com.springboot.test;

import static org.mockito.Mockito.atLeastOnce;

import java.util.Optional;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import com.atishay.springbootstarter.entity.TopicDTO;
import com.atishay.springbootstarter.repository.ServiceRepository;
import com.atishay.springbootstarter.services.TopicService;

public class TopicServiceTest {

	private static TopicService mockTopicService;
	private static ServiceRepository mockServiceRepo;
	private Optional<TopicDTO> topicDto;

	// This will run before every test case.
	@Before
	public void createService() {
		mockTopicService = Mockito.mock(TopicService.class);
		System.out.println("@Before");
		/*
		 * topicDto.setDescription("Test"); topicDto.setId(10l);
		 * topicDto.setName("Mockito Test");
		 */
	}

	// This method is class level, so it should be static
	// otherwise test case will fail with Initialization exception.
	@BeforeClass
	public static void createServiceBeforeClass() {
		mockTopicService = Mockito.mock(TopicService.class);
		mockServiceRepo = Mockito.mock(ServiceRepository.class);
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public static void createServiceAfter() {
		mockTopicService = Mockito.mock(TopicService.class);
		System.out.println("@AfterClass");
	}

	// This will run after every method.
	@After
	public void deleteService() {
		mockTopicService = null;
		System.out.println("@After");
	}

	//This will skip test case.
	@Ignore
	@Test
	public void testMath() {

		Mockito.when(mockServiceRepo.findById(10l)).thenReturn(topicDto);
		mockTopicService.getTopicByID(10l);
		Mockito.verify(mockTopicService, atLeastOnce()).getTopicByID(10l);
		System.out.println("testMath");
	}

	@Test
	public void testMath2() {
		System.out.println("testMath2");
	}
}
