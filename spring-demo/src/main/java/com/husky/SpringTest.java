package com.husky;

import com.husky.pojo.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xml.sax.InputSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author huskyui
 */
@Slf4j
public class SpringTest {
	@Test
	public void pathPlaceHolderTest() {
		System.setProperty("spring.profiles.active", "dev");
		System.setProperty("spring.config", "spring-config");
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:${spring.config}.xml");
		// 获取spring的profiles
		// applicationContext.getEnvironment().getActiveProfiles()
		for (String activeProfile : ctx.getEnvironment().getActiveProfiles()) {
			log.info("active profile {}", activeProfile);
		}
		Student stu = (Student) ctx.getBean("student");
		log.info("student {}",stu);
	}

	@Test
	public void inputSourceTest() throws FileNotFoundException {
		File file = new File("D:\\gitclonepackage\\spring-framework\\spring-demo\\src\\main\\resources\\input-source.xml");
		InputStream inputStream = new FileInputStream(file);
		InputSource inputSource = new InputSource(inputStream);
		log.info("input-source encoding {}",inputSource.getEncoding());
		log.info("systemId {}",inputSource.getSystemId());
		inputSource.getCharacterStream();
	}
}

