<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Login</title>
    <style>
        /* Global Styles */
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(to bottom, #2575fc, #6a11cb);
            color: white;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        /* Centering Container */
        .container {
            max-width: 400px;
            width: 90%;
            background: linear-gradient(to bottom right, #ffffff, #e4e4f5);
            border-radius: 12px;
            box-shadow: 0 8px 15px rgba(0, 0, 0, 0.3);
            overflow: hidden;
            animation: fadeIn 1s ease-in-out;
        }

        /* Header Styling */
        .container h1 {
            text-align: center;
            font-size: 2rem;
            margin: 20px 0;
            color: #6a11cb;
        }

        /* Form Styles */
        form {
            padding: 20px;
            display: flex;
            flex-direction: column;
            gap: 15px;
        }

        label {
            font-weight: bold;
            color: #333;
        }

        input {
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 8px;
            font-size: 1rem;
            outline: none;
            transition: border 0.3s;
        }

        input:focus {
            border-color: #6a11cb;
        }

        button {
            padding: 12px;
            background: linear-gradient(to right, #2575fc, #6a11cb);
            color: white;
            border: none;
            border-radius: 8px;
            font-size: 1rem;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        button:hover {
            background: linear-gradient(to right, #6a11cb, #2575fc);
        }

        /* Link Styles */
        .register-link {
            text-align: center;
            margin: 10px 0 20px;
            font-size: 0.9rem;
            color: #555;
        }

        .register-link a {
            text-decoration: none;
            color: #2575fc;
            font-weight: bold;
            transition: color 0.3s;
        }

        .register-link a:hover {
            color: #6a11cb;
        }

        /* Responsive Design */
        @media (max-width: 480px) {
            .container {
                padding: 15px;
            }

            .container h1 {
                font-size: 1.5rem;
            }

            button {
                font-size: 0.9rem;
                padding: 10px;
            }
        }

        /* Fade-in Animation */
        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(-10%);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>User Login</h1>
        <form action="login" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" placeholder="Enter your username" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" placeholder="Enter your password" required>

            <button type="submit">Login</button>
        </form>
        <div class="register-link">
            <p>Don't have an account? <a href="index.jsp">Register here</a></p>
        </div>
    </div>
</body>
</html>
