<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String logged = (String) request.getAttribute("isLoggedIn");
    String cookieUser = (String) request.getAttribute("cookieUsername");
    String name = (String) request.getAttribute("name");
    String username = (String) request.getAttribute("username");
    String email = (String) request.getAttribute("email");
    String phone = (String) request.getAttribute("phone");

    if (name == null || username == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="User Dashboard showcasing courses and user details.">
    <meta name="author" content="Your Name">
    <title>User Dashboard</title>
    <style>
        /* Global Styles */
        body {
            margin: 0;
            font-family: 'Arial', sans-serif;
            background: linear-gradient(to right, #6dd5ed, #2193b0);
            color: #fff;
        }

        .dashboard {
            display: flex;
            
            min-height: 100vh;
            
            
        }

        /* Sidebar */
        .sidebar {
            width: 250px;
            overflow:wrap;
            margin-right:10px;
            background: #1e3c72;
            padding: 20px;
            position: fixed;
            height: 100%;
            box-shadow: 2px 0 5px rgba(0, 0, 0, 0.5);
        }

        .sidebar h2 {
            text-align: center;
            color: #f1c40f;
            margin-bottom: 20px;
        }

        .sidebar ul {
            list-style: none;
            padding: 0;
        }

        .sidebar ul li {
            margin: 15px 0;
            font-size: 1rem;
        }

        .sidebar ul li p {
            color: #ecf0f1;
        }

        /* Content */
        .content {
            margin-left: 270px;
            padding: 20px;
            flex-grow: 1;
        }

        .content h1 {
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
            margin-bottom: 20px;
        }

        /* Button Styles */
        button {
            background: #f39c12;
            color: white;
            border: none;
            padding: 10px 15px;
            border-radius: 5px;
            cursor: pointer;
            transition: all 0.3s ease;
        }

        button:hover {
            background: #d35400;
        }

        /* Courses Section */
        .courses {
            margin-top: 30px;
        }

        .course-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 20px;
        }

        .course-card {
            background: white;
            color: #2c3e50;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.2);
            padding: 20px;
            text-align: center;
            transition: transform 0.3s ease, box-shadow 0.3s ease;
        }

        .course-card h3 {
            color: #2980b9;
            margin-bottom: 10px;
        }

        .course-card:hover {
            transform: translateY(-10px);
            box-shadow: 0 8px 15px rgba(0, 0, 0, 0.3);
        }

        @media (max-width: 768px) {
            .dashboard {
                flex-direction: column;
            }

            .sidebar {
                width: 100%;
                height: auto;
                position: relative;
            }

            .content {
                margin-left: 0;
            }
        }
    </style>
</head>
<body>
    <div class="dashboard">
        <!-- Sidebar -->
        <aside class="sidebar">
            <h2>Dashboard</h2>
            <ul>
                <li><p><strong>From Database: <hr>Name:</strong> <%= name %></p></li>
                <li><p><strong>Username:</strong> <%= username %></p></li>
                <li><p><strong>Email:</strong> <%= email %></p></li>
                <li><p><strong>Phone:</strong> <%= phone %></p></li>
                <hr>
            </ul>
        </aside>
		<div style="width:50px; height:100%;"></div>
        <!-- Main Content -->
        <main class="content">
            <h1>Welcome, <%= name %>!</h1>
            <p>Your personalized dashboard is here.</p>

            <!-- Logout Button -->
            <form action="logout" method="get">
            <p>( <strong>From Cookies username:</strong> <%= cookieUser + " (" + logged + ")" %>)</p>
                <button type="submit">Logout</button>
                <hr>
            </form>

    <!-- Courses Section -->
<section class="courses">
    <h2>Available Programming Courses</h2>
    <div class="course-grid">
        <% 
        String[] courses = {
            "Java Fundamentals",
            "Advanced Java",
            "React.js",
            "Python for Beginners",
            "Node.js",
            "HTML & CSS Basics",
            "JavaScript Essentials",
            "Bootstrap for Responsive Design",
            "TypeScript Basics",
            "Angular.js",
            "Vue.js",
            "Next.js",
            "Express.js",
            "MongoDB Basics",
            "PostgreSQL",
            "MySQL Essentials",
            "PHP for Beginners",
            "Ruby on Rails",
            "Django Framework",
            "Flask Framework",
            "Core JavaScript",
            "jQuery Basics",
            "RESTful API Development",
            "GraphQL Basics",
            "Redux for State Management",
            "Microservices Architecture",
            "Docker Essentials",
            "Kubernetes Basics",
            "AWS Fundamentals",
            "Azure Cloud",
            "Google Cloud Platform",
            "Linux Command Line",
            "Git and GitHub",
            "CI/CD with Jenkins",
            "Testing with Selenium",
            "JUnit Testing",
            "Spring Boot Basics",
            "Spring Security",
            "Hibernate ORM",
            "Kotlin for Android",
            "Swift for iOS Development",
            "Flutter for Cross-Platform Apps",
            "React Native Basics",
            "Unity Game Development",
            "Machine Learning with Python",
            "Data Science with Python",
            "Artificial Intelligence Essentials",
            "Big Data with Hadoop",
            "Apache Spark Basics",
            "Blockchain Development",
            "Cybersecurity Basics",
            "Penetration Testing",
            "IoT Essentials",
            "Augmented Reality (AR)",
            "Virtual Reality (VR)"
        };
        for (String course : courses) { 
        %>
        <div class="course-card">
            <h3><%= course %></h3>
            <p>Master <%= course %> with hands-on projects and real-world applications.</p>
            <button class="enroll-button">Enroll Now</button>
        </div>
        <% 
        } 
        %>
    </div>
</section>

<script>
    // Select all buttons with the "enroll-button" class
    const buttons = document.getElementsByClassName("enroll-button");

    // Iterate through all buttons and add an event listener to each
    for (let i = 0; i < buttons.length; i++) {
        buttons[i].addEventListener("click", function () {
            this.innerText = "Enrolled";
            this.style.backgroundColor = "green";
            this.style.color = "white";
        });
    }
</script>
    
</body>
</html>
