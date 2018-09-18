package com.demo.kafka;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Test;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import com.demo.yaml.Feed;

public class SnakeYamlTest extends TestCase {

	protected static void setUpBeforeClass() throws Exception {
	}

	protected static void tearDownAfterClass() throws Exception {
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testLoadYamlWithClass(){
		Yaml yaml = new Yaml(new Constructor(Feed.class));
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("test2.yaml");
		Iterable<Object> configs = yaml.loadAll(inputStream);
		Map<String, Feed> feeds = new HashMap<>();
//		Map<String, Feed> result = StreamSupport.stream(feeds.spliterator(), false).collect(Collectors.toMap(Feed::getName, Function.identity()));
		for(Object f : configs){
			feeds.put(((Feed)f).getName(), (Feed)f);
		}
		
		System.out.println(feeds.get("feed1"));
		System.out.println(feeds.get("feed2"));
		
	}
	
//	@Test
//	public void testLoadYaml(){
//		Yaml yaml = new Yaml();
//		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("test.yaml");
//		Map<String, Object> feed = yaml.load(inputStream);
//		System.out.println(feed);
//		
//	}
//	
//	
//	@Test
//	public void testLoadYamlList(){
//		Yaml yaml = new Yaml();
//		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("test1.yaml");
//		List<String> feed = yaml.load(inputStream);
//		System.out.println(feed);
//		
//	}


}
