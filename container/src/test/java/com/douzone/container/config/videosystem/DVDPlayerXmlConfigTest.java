package com.douzone.container.config.videosystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.douzone.container.videosystem.DigitalVideoDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:com/douzone/container/config/videosystem/DVDPlayerConfig.xml"})
public class DVDPlayerXmlConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	
	//@Autowired
	// 예외발생
	// xml bean 설정에(Avengers)서는 id를 자동으로 부여하지 않는다 밑에 아이언맨처럼 DVDPlayerconfig.xml에서 아이디 지정해줘야함
	// @Qualifier 사용 못함
	private DigitalVideoDisc dvd1;
	
	@Autowired
	@Qualifier("ironMan")
	private DigitalVideoDisc dvd2;
	
	@Autowired
	@Qualifier("avengersInfinityWar")
	private DigitalVideoDisc dvd3;
	
	@Autowired
	@Qualifier("avengerEndgame")
	private DigitalVideoDisc dvd4;

	@Autowired
	@Qualifier("avengerAgeofUltron")
	private DigitalVideoDisc dvd5;
	
	@Autowired
	@Qualifier("avengersCaptainAmerica")
	private DigitalVideoDisc dvd6;
	
	@Autowired
	@Qualifier("avengersDirectorEdition")
	private DigitalVideoDisc dvd7;
	
	@Ignore
	@Test
	public void testDVD1() {
		assertNotNull(dvd1);
	}
	@Test
	public void testDVD2() {
		assertNotNull(dvd2);
	}
	
	@Test
	public void testDVD3() {
		assertNotNull(dvd3);
	}
	
	@Test
	public void testDVD4() {
		assertNotNull(dvd4);
	}
	
	@Test
	public void testDVD5() {
		assertNotNull(dvd5);
	}
	
	@Test
	public void testDVD6() {
		assertNotNull(dvd6);
	}
	
	@Test
	public void testDVD7() {
		assertNotNull(dvd7);
	}
}