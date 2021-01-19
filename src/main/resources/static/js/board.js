let index = {
	init: function() {
		$("#btn-save").on("click", () => {
			this.save();
		});
	},
	save: function() {
		let data = {
			title: $("#title").val(),
			content: $("#content").val()
		};

		$.ajax({
			// 회원가입 수행 요청 (100초 가정)
			type: "POST",
			url: "/auth/board",
			data: JSON.stringify(data), 
			contentType: "application/json; charset=utf-8", 
			dataType: "json" 

		}).done(function(resp) {
			alert("글쓰기가 완료되었습니다.");
			location.href = "/";
		}).fail(function(error) {
			alert(JSON.stringify(error));
		});
	},

}

index.init();