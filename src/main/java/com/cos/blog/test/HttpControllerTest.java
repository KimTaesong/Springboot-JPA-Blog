package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응답(HTML 파일)
// @Controller

// 사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {
	
	//http://localhost:8080/http/get (select)
	@GetMapping("/http/get")
	public String getTest(Member m) { //id=1&username=ssar&password=1234&email=ssar@nate.com MessageConverter (스프링부트)
		return "get 요청: " + m.getId() +", " +m.getUsername() +", "+m.getPassword()+", "+m.getEmail();
	}
	
	//http://localhost:8080/http/post (insert)
//	@PostMapping("/http/post")
//	public String postTest(Member m) { 
//		return "POST 요청: " + m.getId() +", " +m.getUsername() +", "+m.getPassword()+", "+m.getEmail();
//	}
//	@PostMapping("/http/post") //text/plain, application.json
//	public String postTest(@RequestBody String text) { 
//		return "POST 요청: " + text;
//	}
	@PostMapping("/http/post") //text/plain, application.json
	public String postTest(@RequestBody Member m) { // MessageConverter (스프링부트)
		return  "POST 요청: " + m.getId() +", " +m.getUsername() +", "+m.getPassword()+", "+m.getEmail();
	}	
	//http://localhost:8080/http/put (update)
	@PutMapping("/http/put")
	public String putTest(@RequestBody Member m) {
		return  "PUT 요청: " + m.getId() +", " +m.getUsername() +", "+m.getPassword()+", "+m.getEmail();
	}
	
	//http://localhost:8080/http/delete (delete)
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
