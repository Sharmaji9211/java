<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration</title>
    <style>
        /* Global Styles */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f9;
            color: #333;
        }

        /* Header */
        header {
            background: linear-gradient(to right, #fbb034, #2575fc);
            color: white;
            padding: 20px;
            text-align: center;
        }

        .logo {
            font-size: 2rem;
            font-weight: bold;
        }

        /* Navbar */
        .navbar {
            display: flex;
            align-items: center;
            justify-content: space-between;
            padding: 10px 20px;
            background: linear-gradient(90deg, #1a73e8, #ffd700);
            box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
        }

        .navbar .logo {
            font-size: 1.5rem;
            font-weight: bold;
            color: white;
            text-transform: uppercase;
        }

        .navbar .nav-links {
            display: flex;
            gap: 15px;
        }

        .navbar .nav-links a {
            text-decoration: none;
            color: white;
            font-size: 1rem;
            padding: 8px 15px;
            border-radius: 5px;
            transition: background-color 0.3s ease, transform 0.3s ease;
        }

        .navbar .nav-links a:hover {
            background-color: rgba(255, 255, 255, 0.3);
            transform: scale(1.1);
        }

        @media (max-width: 768px) {
            .navbar {
                flex-direction: column;
            }

            .navbar .nav-links {
                flex-direction: column;
                align-items: center;
            }
        }

        /* Hero Section */
        .hero {
            background: linear-gradient(to right, #fbb034, #2575fc);
            color: white;
            text-align: center;
            padding: 50px 20px;
        }

        .hero h1 {
            font-size: 2.5rem;
            margin: 0;
        }

        .hero p {
            font-size: 1.2rem;
            margin: 10px 0 20px;
        }

        /* Form Styles */
        .form-container {
            max-width: 500px;
            margin: 30px auto;
            padding: 20px;
            background: white;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            display: none;
            position: relative;
        }

        .form-container.active {
            display: block;
        }
        .form-container.close {
            display: none;
        }

        .form-container h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        .form-container label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
        }

        .form-container input {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        .form-container button {
            width: 100%;
            padding: 10px;
            background: #2575fc;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 1rem;
            cursor: pointer;
        }

        .form-container button:hover {
            background: #0056b3;
        }

        /* Courses Section */
        .courses {
            margin: 30px 20px;
        }

        .courses h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        .course-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 20px;
            padding: 0 20px;
        }

        .course-card {
            background: white;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.2);
            padding: 20px;
            text-align: center;
            transition: transform 0.3s ease, box-shadow 0.3s ease;
        }

        .course-card:hover {
            transform: translateY(-10px);
            box-shadow: 0 8px 15px rgba(0, 0, 0, 0.3);
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
        

        /* Footer */
        footer {
            text-align: center;
            padding: 20px;
            background: linear-gradient(135deg, #FFD700, #FF8C00);
            color: white;
            font-size: 0.9rem;
        }
      
    </style>
</head>
<body>
    <div class="navbar">
        <div class="logo">CODE MENTOR</div>
        
        <div class="nav-links">
            <a href="#home">Home</a>
            <a href="#about">About</a>
            <a href="#services">Services</a>
            <a href="#contact">Contact</a>
            <a href="#" class="reg-button" onclick="openForm()">Register</a>
            <a href="login.jsp">Login</a>
        </div>
    </div>

    <!-- Hero Section -->
    <div class="hero">
        <h1>Welcome to Code Mentor </h1>
        <p>Join us today and explore amazing features!</p>
    </div>

    <!-- Registration Form -->
    <div class="form-container" id="reg-form">
     
			     <button  style="background: white; opacity:0.8; width:50px; border-radius:100%; " onclick="closeForm()" >
						     <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="24" height="24" color="#ff011f" fill="none">
						    <path d="M15 9L12 12M12 12L9 15M12 12L15 15M12 12L9 9" stroke="currentColor" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
						    <path d="M2 12C2 17.5228 6.47715 22 12 22C17.5228 22 22 17.5228 22 12C22 6.47714 17.5228 1.99998 12 1.99998" stroke="currentColor" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
						    <path d="M2.5 8.49998C2.86239 7.67055 3.3189 6.89164 3.85601 6.17676M6.17681 3.85597C6.89168 3.31886 7.67058 2.86237 8.5 2.49998" stroke="currentColor" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
							</svg>
				</button>
				
        <h2>Register</h2>
        <form action="register" method="post">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            <label for="phone">Phone:</label>
            <input type="tel" id="phone" name="phone" required>
            <button type="submit">Register</button>
        </form>
    </div>

    <!-- Courses Section -->
    <section class="courses">
        <h2>Available Programming Courses</h2>
        <div class="course-grid">
            <% String[] courses = { "Java Fundamentals",
            	    "React.js",
            	    "Python for Beginners",
            	    "Node.js",
            	    "HTML & CSS Basics",
            	    "C Programming",
            	    "Data Structures and Algorithms",
            	    "Web Development with Django",
            	    "SQL and Database Management",
            	    "Machine Learning with Python",
            	    "Docker and Kubernetes",
            	    "Angular for Web Development",
            	    "Introduction to Cloud Computing",
            	    "Cybersecurity Basics",
            	    "Mobile App Development with React Native",
            	    "JavaScript for Web Development",
            	    "Advanced Java Programming",
            	    "Introduction to Blockchain",
            	    "Artificial Intelligence Fundamentals",
            	    "Git and GitHub for Version Control",
            	    "DevOps and Continuous Integration",
            	    "UI/UX Design Principles",
            	    "Software Testing and Quality Assurance",
            	    "Responsive Web Design",
            	    "Vue.js for Frontend Development" }; 
            for (String course : courses) { %>
            <div class="course-card">
                <h3><%= course %></h3>
                <p>Master <%= course %> with hands-on projects.</p>
                <button class="enroll-button">Enroll Now</button>
            </div>
            <% } %>
        </div>
    </section>

    <!-- Footer -->
    <footer>
        <p>&copy; 2024 Tecresearch. All Rights Reserved.</p>
        <p>Contact Us: <a href="mailto:bnlv1212@gmail.com" style="color: white; text-decoration: none;">bnlv1212@gmail.com</a></p>
        <p>Mr.Brijesh(Research & Development Head: CSE-IoT Elite Club)</p>
    </footer>

<script>
    // Function to open the registration form
    function openForm() {
        const form = document.getElementById('reg-form');
        form.classList.add('active');
        form.classList.remove('close');
    }

    // Function to close the registration form
    function closeForm() {
        const form = document.getElementById('reg-form');
        form.classList.add('close');
        form.classList.remove('active');
    }
</script>

</body>
</html>
