package com.srdjankrsmanovic.springaws;

import com.srdjankrsmanovic.springaws.entity.Pet;
import com.srdjankrsmanovic.springaws.repository.PetRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringAwsApplicationTests {


	private final PetRepository petRepository;


	@Autowired
	public SpringAwsApplicationTests(PetRepository petRepository) {
		this.petRepository = petRepository;
	}

	@BeforeEach
    public void beforeEach(){
		petRepository.deleteAll();
	}

	@Test
	void contextLoads() {
	}

	@Test
	void databaseTest() {
		petRepository.save(new Pet(1L,"Pet1", new Date()));
		petRepository.save(new Pet(2L,"Pet2", new Date()));
		long count = petRepository.count();

		assertEquals(2, count);
	}

}
