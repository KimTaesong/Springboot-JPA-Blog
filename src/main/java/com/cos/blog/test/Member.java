package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
public class Member {
	private  int id;	// final - 불변성 유지 
	private  String username;
	private  String password;
	private  String email;
	
	@Builder // lombok을 쓰면 Builder 패턴을 만들어줌
	public Member(int id, String username, String password, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	
}
