package com.example.demo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    @GetMapping("/user")
    String fun(@RequestParam String name , @RequestParam boolean isAdmin){
        if(isAdmin){
            return "Hello Admin " + name;
        }
       return "Hello User  " + name;
    }


    @GetMapping("/test")
    String test(){
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Simple Demo Website</title>
                
                <style>
                
                *{
                margin:0;
                padding:0;
                box-sizing:border-box;
                font-family: Arial, sans-serif;
                }
                
                body{
                line-height:1.6;
                background:#f5f6fa;
                }
                
                /* NAVBAR */
                
                nav{
                background:#111;
                color:white;
                padding:15px 10%;
                display:flex;
                justify-content:space-between;
                align-items:center;
                }
                
                nav h2{
                color:#4CAF50;
                }
                
                nav ul{
                display:flex;
                list-style:none;
                }
                
                nav ul li{
                margin-left:20px;
                }
                
                nav ul li a{
                color:white;
                text-decoration:none;
                font-weight:bold;
                }
                
                nav ul li a:hover{
                color:#4CAF50;
                }
                
                /* HERO */
                
                .hero{
                height:80vh;
                background:linear-gradient(rgba(0,0,0,0.6),rgba(0,0,0,0.6)),
                url("https://images.unsplash.com/photo-1498050108023-c5249f4df085");
                background-size:cover;
                background-position:center;
                display:flex;
                align-items:center;
                justify-content:center;
                text-align:center;
                color:white;
                padding:20px;
                }
                
                .hero h1{
                font-size:50px;
                margin-bottom:20px;
                }
                
                .hero p{
                font-size:20px;
                margin-bottom:25px;
                }
                
                .hero button{
                padding:12px 30px;
                font-size:18px;
                background:#4CAF50;
                border:none;
                color:white;
                cursor:pointer;
                border-radius:5px;
                }
                
                .hero button:hover{
                background:#3e8e41;
                }
                
                /* FEATURES */
                
                .features{
                padding:60px 10%;
                text-align:center;
                }
                
                .features h2{
                margin-bottom:40px;
                font-size:32px;
                }
                
                .feature-container{
                display:grid;
                grid-template-columns:repeat(auto-fit,minmax(250px,1fr));
                gap:25px;
                }
                
                .feature{
                background:white;
                padding:30px;
                border-radius:10px;
                box-shadow:0 5px 15px rgba(0,0,0,0.1);
                transition:0.3s;
                }
                
                .feature:hover{
                transform:translateY(-5px);
                }
                
                .feature h3{
                margin-bottom:15px;
                color:#4CAF50;
                }
                
                /* ABOUT */
                
                .about{
                background:#111;
                color:white;
                padding:60px 10%;
                text-align:center;
                }
                
                .about h2{
                margin-bottom:20px;
                }
                
                /* CONTACT */
                
                .contact{
                padding:60px 10%;
                text-align:center;
                }
                
                .contact form{
                max-width:500px;
                margin:auto;
                display:flex;
                flex-direction:column;
                }
                
                .contact input,
                .contact textarea{
                margin:10px 0;
                padding:12px;
                border:1px solid #ccc;
                border-radius:5px;
                }
                
                .contact button{
                padding:12px;
                background:#4CAF50;
                border:none;
                color:white;
                cursor:pointer;
                border-radius:5px;
                }
                
                /* FOOTER */
                
                footer{
                background:#111;
                color:white;
                text-align:center;
                padding:20px;
                margin-top:30px;
                }
                
                </style>
                </head>
                
                <body>
                
                <!-- NAVBAR -->
                
                <nav>
                <h2>MySite</h2>
                
                <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">Features</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Contact</a></li>
                </ul>
                
                </nav>
                
                <!-- HERO -->
                
                <section class="hero">
                
                <div>
                <h1>Welcome to My Website</h1>
                <p>A simple modern website built with HTML & CSS</p>
                <button>Get Started</button>
                </div>
                
                </section>
                
                <!-- FEATURES -->
                
                <section class="features">
                
                <h2>Our Features</h2>
                
                <div class="feature-container">
                
                <div class="feature">
                <h3>Fast</h3>
                <p>Optimized performance and quick loading speed.</p>
                </div>
                
                <div class="feature">
                <h3>Responsive</h3>
                <p>Works perfectly on mobile, tablet, and desktop.</p>
                </div>
                
                <div class="feature">
                <h3>Simple</h3>
                <p>Clean and minimal design for better usability.</p>
                </div>
                
                </div>
                
                </section>
                
                <!-- ABOUT -->
                
                <section class="about">
                
                <h2>About Us</h2>
                
                <p>
                This is a demo website template built using a single HTML file.
                You can modify this template for learning or testing purposes.
                </p>
                
                </section>
                
                <!-- CONTACT -->
                
                <section class="contact">
                
                <h2>Contact Us</h2>
                
                <form>
                
                <input type="text" placeholder="Your Name" required>
                
                <input type="email" placeholder="Your Email" required>
                
                <textarea rows="5" placeholder="Your Message"></textarea>
                
                <button type="submit">Send Message</button>
                
                </form>
                
                </section>
                
                <!-- FOOTER -->
                
                <footer>
                
                <p>© 2026 MySite | Demo Website</p>
                
                </footer>
                
                </body>
                </html>
                """;
    }

    @GetMapping("/user/{id}")
    String fun1(@PathVariable int id){

        return "Hello User " + id ;
    }

    @PostMapping("/user")
    ResponseEntity<UserRequest> fun2(@RequestBody UserRequest userRequest  , @RequestHeader("Authorization") String token){
        try {
            System.out.println(userRequest);
            userRequest.setName("Abhijeet");
            return new ResponseEntity<>(userRequest, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }


}
