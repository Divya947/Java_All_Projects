package com.simplilearn.demo.Test_Case_Example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("before all will be called first");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after all will be called last");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("this method will be called before each test case");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("this method will be called after each test case");
	}

	@Test
	void test() {
		System.out.println("test");
	}

}
