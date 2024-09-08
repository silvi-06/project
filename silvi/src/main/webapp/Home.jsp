<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin or Employee</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 40px;
            text-align: center;
            width: 300px;
        }
        h1 {
            font-size: 24px;
            color: #333;
            margin-bottom: 20px;
        }
        .link {
            display: block;
            margin: 10px 0;
            padding: 10px 15px;
            border-radius: 4px;
            text-decoration: none;
            color: #fff;
            font-weight: bold;
        }
        .admin {
            background-color: #007BFF;
        }
        .employee {
            background-color: #28A745;
        }
        .admin:hover {
            background-color: #0056b3;
        }
        .employee:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

    <div class="container">
        <h1>Choose Your Role</h1>
        <a href="AdminLogin.jsp" class="link admin">If you are an Admin, click here</a>
        <a href="Employee_login.jsp" class="link employee">If you are an Employee, click here</a>
    </div>

</body>
</html>
