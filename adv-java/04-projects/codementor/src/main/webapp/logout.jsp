<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Logout</title>
    <style>
        /* Global Styles */
        body {
            margin: 0;
            padding: 0;
            font-family: 'Arial', sans-serif;
            background: linear-gradient(to right, #6a11cb, #2575fc);
            color: white;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            text-align: center;
        }

        /* Container */
        .logout-container {
            background: rgba(255, 255, 255, 0.1);
            padding: 30px 50px;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.3);
        }

        .logout-container h1 {
            font-size: 2rem;
            margin-bottom: 20px;
        }

        .logout-container a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background: #2575fc;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            font-size: 1rem;
            transition: background-color 0.3s ease;
        }

        .logout-container a:hover {
            background: #6a11cb;
        }

        /* Mobile Responsive */
        @media (max-width: 768px) {
            .logout-container {
                width: 90%;
                padding: 20px;
            }

            .logout-container h1 {
                font-size: 1.5rem;
            }

            .logout-container a {
                font-size: 0.9rem;
                padding: 8px 16px;
            }
        }
    </style>
</head>
<body>
    <div class="logout-container">
        <h1>You have successfully logged out.</h1>
        <a href="login.jsp">Login Again</a>
    </div>
</body>
</html>
