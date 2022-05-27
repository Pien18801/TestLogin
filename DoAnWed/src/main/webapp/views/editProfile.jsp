<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel ="stylesheet" href="style/editProfile.css">
<title>Document</title>
</head>

<body>
	<div class="view-body">
		<div class="title">
			<h1>Edit Profile</h1>
		</div>
		<hr>
		<fieldset class="view">
			<div class="list">Profile Form Elements</div>
		</fieldset>
		<fieldset class="field">
			<form action="EditProfileController?id=${sessionScope.theLastUser.id}" method="post">
				<div class="form-group">
					<label class="control-label" for="fname">First name</label>
					<div class="text">
						<input class="form-control" type="text" name="fname" id="fname" maxlength="30"
							placeholder="Enter the first name" value="${detail.firstName }" required />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label">Last name</label>
					<div>
						<input class="form-control" type="text" name="lname" id="lname" maxlength="30"
							placeholder="Enter the last name" value="${detail.lastName }" required />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label">Email</label>
					<div>
						<input readonly class="form-control" type="text" name="email"
							id="email" value="${id}" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label">Phone</label>
					<div>
						<input class="form-control" type="text" name="phone" id="phone" maxlength="13"
							placeholder="Enter your phone number" value="${detail.phone }" required />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label">Description</label>
					<div>
						<textarea class="text-area" name="description" id="description" maxlength="200"
							rows="5" >${detail.description }</textarea>
					</div>
				</div>

				<div class="form-group">
					<div>
						<button type="submit" class="btn ">Submit Button</button>
						<button type="reset" class="btn ">Reset Button</button>
					</div>
				</div>
			</form>
		</fieldset>
	</div>
</body>

</html>