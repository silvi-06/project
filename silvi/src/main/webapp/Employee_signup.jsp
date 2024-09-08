<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Form</title>
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
        .form-container {
            background-color: #fff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            width: 400px;
        }
        h1 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }
        form {
            width: 100%;
        }
        table {
            width: 100%;
            border-spacing: 10px;
        }
        td {
            padding: 10px 0;
        }
        label {
            display: inline-block;
            width: 120px;
            font-weight: bold;
            color: #555;
        }
        input[type="text"], input[type="email"], input[type="password"], input[type="date"] {
            width: calc(100% - 70px);
            padding: 8px;
            border: 1px solid #ddd;
            border-radius: 4px;
        }
        button {
            width: 100%;
            padding: 10px;
            background-color: #28A745;
            border: none;
            color: white;
            font-size: 16px;
            border-radius: 4px;
            cursor: pointer;
            margin-top: 10px;
        }
        button:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

    <div class="form-container">
        <h1>Employee Registration</h1>
        <form action="Employee_signup" method="post">
            <table>
                <tr>
                    <td><label for="name">Name:</label></td>
                    <td><input type="text" name="name" name="name" required></td>
                </tr>
                <tr>
                    <td><label for="department">Department:</label></td>
                    <td><input type="text" name="department" name="department" required></td>
                </tr>
                <tr>
                    <td><label for="email">Email:</label></td>
                    <td><input type="email" name="email" name="email" required></td>
                </tr>
                <tr>
                    <td><label for="birthdate">Birthdate:</label></td>
                    <td><input type="date" name="birthdate" name="birthdate" required></td>
                </tr>
                <tr>
                    <td><label for="password">Password:</label></td>
                    <td><input type="password" name="password" name="password" required></td>
                </tr>
                <tr>
                    <td><label for="cpassword">ConfirmPassword:</label></td>
                    <td><input type="password" name="cpassword" name="cpassword" required></td>
                </tr>
            </table>
            <button type="submit">Submit</button>
        </form>
    </div>

</body>
</html>
