$().ready(function() {
	$("#Menu").validate({
		onfocusout: true,
		onkeyup: true,
		onclick: true,
		rules: {
			"username": {
				required: true,
				maxlength: 30,
				minlength: 3
			},
			"email": {
				email: true,
				required: true,
				minlength: 5
			},
			"password": {
				required: true,
				minlength: 8,
				maxlength: 30
			},
			"repassword": {
				equalTo: "#password",
				minlength: 8,
				maxlength: 30
			}
		},
		messages: {
			"username": {
				required: "Bắt buộc nhập username",
				maxlength: "Hãy nhập tối đa 30 ký tự",
				minlength: "Hãy nhập trên 3 kí tự"
			},
			"email": {
				required: "Bắt buộc nhập email",
				email: "email chưa đúng định dạng",
				minlength: "Hãy nhập ít nhất 5 ký tự"
			},
			"password": {
				required: "Bắt buộc nhập password",
				minlength: "Hãy nhập ít nhất 8 ký tự",
				maxlength: "Hãy nhập tối đa 30 ký tự"
			},
			"repassword": {
				required: "Bắt buộc nhập re-password",
				equalTo: "Hai password phải giống nhau",
				minlength: "Hãy nhập ít nhất 8 ký tự",
				maxlength: "Hãy nhập tối đa 30 ký tự"
			}
		},
		submitHandler: function(form) {
    	form.submit();
  }
	});
});

