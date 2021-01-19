package com.cos.blog.model;

// 실수하는 것을 방지하기 위해서 enum을 만듬 - 내가 넣는 값을 강제할 수 있음
// 강제하는 이유는 USER, ADMIN만 넣을 수 있고 실수로 USERS 이렇게 들어가는 것 방지
// 도메인 - 어떤 범위 안에 데이터를 넣어줄 때 어떤 값을 강제시킬 수 있음.
public enum RoleType {
	USER, ADMIN
}
