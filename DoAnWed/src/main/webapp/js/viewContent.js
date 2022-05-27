function showMess(id) {
	var option = confirm('Ban có muon xoa hay k');
	if (option === true) {
		window.location.href = 'DeleteContent?id=' + id;
	}
}

