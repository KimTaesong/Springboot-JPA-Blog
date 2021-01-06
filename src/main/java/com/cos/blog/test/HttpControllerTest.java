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
	
	private static final String TAG = "HttpControllerTest:";
	
	//localhsot:8000/blog/http/lombok
	@GetMapping("/http/lombok")
	public String lombokTest() {
		//Member m = new Member(1, "ssar", "1234", "email");
		// builder 패턴 Member.builder() - 내가 원하는 항목을 가져다가 쓸 수 있음, 생성자의 순서는 상관 없음, 그리고 파라미터의 인수 실수를 방지해줌.
		Member m = Member.builder().username("ssar").password("1234").email("ssar@nate.com").build();
		System.out.println(TAG + "getter : " + m.getId());
		m.setId(5000);
		System.out.println(TAG + "setter : " + m.getId());
		System.out.println(TAG + "getter : " + m.getUsername());
		m.setUsername("cos");
		System.out.println(TAG + "setter : " + m.getUsername());
		return "lombok test 완료";
	}
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
