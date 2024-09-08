<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Home Page</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        body {
            background-color: #f4f4f4;
        }

        .header {
            background-color: #333;
            color: white;
            padding: 20px;
            text-align: center;
        }

        .header h1 {
            margin: 0;
        }

        .navbar {
            display: flex;
            justify-content: center;
            background-color: #4CAF50;
            padding: 10px;
        }

        .navbar a {
            color: white;
            padding: 14px 20px;
            text-decoration: none;
            text-align: center;
            border-radius: 5px;
            margin: 0 10px;
        }

        .navbar a:hover {
            background-color: #45a049;
        }

        .container {
            max-width: 1200px;
            margin: 50px auto;
            padding: 20px;
            background-color: white;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        .container h2 {
            color: #333;
            margin-bottom: 20px;
        }

        .container p {
            color: #666;
            line-height: 1.6;
        }

        .logout-btn {
            display: inline-block;
            padding: 10px 20px;
            background-color: red;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            margin-top: 20px;
            transition: background-color 0.3s ease;
        }

        .logout-btn:hover {
            background-color: darkred;
        }

        /* Additional form styles */
        .form-container {
            margin-top: 20px;
        }

        button {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            margin-top: 10px;
        }

        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

    <div class="header">
        <h1>Welcome to Employee Dashboard</h1>
    </div>

    <div class="container">
        <h2>Hello, ${ name }</h2>
        
        <!-- Hidden Name Form -->
        <div class="form-container">
            <form action="Employee_work_see" method="post">
                <!-- Hidden name field -->
                <input type="hidden" id="name" name="name" value=${ name }>

                <!-- Button labeled 'Work' -->
                <button type="submit">Work</button>
            </form>
        </div>
    </div>

</body>
</html>

