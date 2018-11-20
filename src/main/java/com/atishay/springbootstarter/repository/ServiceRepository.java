package com.atishay.springbootstarter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atishay.springbootstarter.entity.TopicDTO;

/**
 * Here I have used Spring Data JPA which internally uses like Hibernate as it
 * uses JPA Repository.
 * 
 * Here we have specified on which DTO the JPA repository will work.
 * @author Champ
 *
 */
@Repository
public interface ServiceRepository extends JpaRepository<TopicDTO, Long> {

	/**
	 * This is a custom method, Spring Data JPA will automatically find the 
	 * data using Name property, Important: the method should be start with findBy.
	 * Like findByName, findBySex etc, here name and sex are properties/fields in table.
	 * @param name
	 * @return
	 */
	public List<TopicDTO> findByName(String name);
}
