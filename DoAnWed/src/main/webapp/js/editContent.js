$().ready(function() {
	$("#check").validate({
		onfocusout: true,
		onkeyup: true,
		onclick: true,
		rules: {
			"title": {
				required: true,
				maxlength: 200,
				minlength: 10
			},
			"brief": {
				required: true,
				minlength: 30,
				maxlength: 150
			},
			"content": {
				required: true,
				minlength: 50,
				maxlength: 1000
			}
			
		},
		messages: {
			"title": {
				required: "Bắt buộc nhập Title",
				maxlength: "Hãy nhập tối đa 200 ký tự",
				minlength: "Hãy nhập trên 10 kí tự"
			},
			"brief": {
				required: "Bắt buộc nhập Brief",
				maxlength: "Hãy nhập tối đa 150 ký tự",
				minlength: "Hãy nhập ít nhất 30 ký tự"
			},
			"content": {
				required: "Bắt buộc nhập Content",
				minlength: "Hãy nhập ít nhất 50 ký tự",
				maxlength: "Hãy nhập tối đa 1000 ký tự"
			}
		},
		submitHandler: function(form) {
    	form.submit();
  }
	});
});

