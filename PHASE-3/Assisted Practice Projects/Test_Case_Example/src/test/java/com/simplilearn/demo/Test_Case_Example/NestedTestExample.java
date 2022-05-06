package com.simplilearn.demo.Test_Case_Example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTestExample {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after all");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each");
	}

	@Test
	void test() {
		System.out.println("test case of outer class");
	}
	@Nested
	class inner{
		@BeforeEach
		void setUp() throws Exception {
			System.out.println("before each");
		}

		@AfterEach
		void tearDown() throws Exception {
			System.out.println("after each");
		}

		@Test
		@DisplayName("Test of inner class")
		void test() {
			System.out.println("test case of inner class");
		}
	}
	@Nested
	class subinner{
		@BeforeEach
		void setUp() throws Exception {
			System.out.println("before each");
		}

		@AfterEach
		void tearDown() throws Exception {
			System.out.println("after each");
		}

		@Test
		@DisplayName("Test of sub inner class")
		void test() {
			System.out.println("test case of sub inner class");
		}
	}

	
}
