package com.github.kyriosdata.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class H2ConsoleApplication {

	private final JdbcTemplate template;

	@Autowired
	public H2ConsoleApplication(JdbcTemplate template) {
		this.template = template;
	}

	@RequestMapping("/stocks")
	public List<Map<String, Object>> stocks() {
		return template.queryForList("select * from stock");
	}

	public static void main(String[] args) {
		SpringApplication.run(H2ConsoleApplication.class, args);
	}
}
