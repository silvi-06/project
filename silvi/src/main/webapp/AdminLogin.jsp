<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Admin Portal Login</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <div class="login-container">
    <h2>Admin Portal</h2>
    <form class="login-form" method="post" action= "AdminLogin">
    <div>
    	<h2 style="color: red;">${ Error }</h2>
    </div>
      <div class="input-group">
        <label for="name">Name</label>
        <input type="text" name="name" placeholder="Enter your name" required>
      </div>
      <div class="input-group">
        <label for="password">Password</label>
        <input type="password" name="password" placeholder="Enter your password" required>
      </div>
      <button type="submit">Login</button>
    </form>
  </div>
</body>
</html>
