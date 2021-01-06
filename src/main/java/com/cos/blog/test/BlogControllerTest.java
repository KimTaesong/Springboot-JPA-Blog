/*
 *  스프링 -> IOC -> 제어의 역전 / 너(사용자)는 NEW X -> 내(스프링)가 NEW O
 *  싱글톤 패턴 + 레퍼런스 변수를 스프링이 관리하겠다.
 *  내가 new를 해서 a를 관리할테니 너는 갖다가 써
 *  Class Test {
 *  	void hello() { 
 *  		A a = new A(); -> class A heap이라는 공간에 a라는 객체를 생성 
 										 메소드 호출 시 메모리에 떴다가 종료되면 사라짐.
 										 스택에서 만든 모든 객체는 결국 지역변수가 관리
 										 지역변수는 다른 스택에서 공유해서 사용할 수 없음 -> 전역변수를 생성하면 또 new
 *  	}
 *  
 *  컴포넌트 스캔 패키지 -> 스캔 : 필요한 것들을 메모리에 로드 IOC 싱글톤 스프링 컨테이너
 *  우리 기준 com.cos.blog 패키지 이하만 스캔
 *  근데 우리 com.cos.test 패키지 스캔 x
 */
package com.cos.blog.test;


import org.springframework.web.bind.annotation.GetMapping;
// 스프링이 com.cos.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new하는 것은 아니다.
// 특정 어노테이션이 붙어있는 클래스 파일들을 new해서 (IOC) 스프링 컨테이너에 관리해줍니다.
import org.springframework.web.bind.annotation.RestController;
@RestController 				
public class BlogControllerTest {
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
