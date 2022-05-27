function resetButton(){
    document.getElementById("form").reset();
}
/*validate input addContent */
$().ready(function() {
    $("#form").validate({
        onfocusout: false,
        onkeyup: false,
        onclick: false,
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
                maxlength: 1000,
                minlength: 50
            }
        },
        messages: {
            "title": {
                required: "Bắt buộc nhập title",
                maxlength: "Hãy nhập tối đa 200 ký tự",
                minlength: "Hãy nhập tối thiểu 10 ký tự"
            },
            "brief": {
                required: "Bắt buộc nhập brief",
                minlength: "Hãy nhập ít nhất 30 ký tự",
                maxlength: "Hãy nhập tối đa 150 ký tự"
            },
            "content": {
                required: "Bắt buộc nhập content",
                minlength: "Hãy nhập ít nhất 50 ký tự",
                maxlength: "Hãy nhập tối đa 1000 ký tự"
            }
        }
    });
});