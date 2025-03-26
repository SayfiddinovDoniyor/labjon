package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Controller {

    @GetMapping("/home")
    public String home() {
        return "Welcome to Home Page!";
    }
    @GetMapping("/services") public String services () {
        return
                "<h2>Our Services </h2>"
                        + "<ul>"
                        + "<li>Web Development </li>"
                        + "<li>Mobile App Development </li>"
                        + "<li>SEO Optimization </li>"
                        + "</ul>";
    }
    @GetMapping("/about")
    public String about() {
        return "My app initilized from spring initializr";
    }
    @GetMapping("/faq")
    public String faq() {
        return "Why people breath?" +
                "Because of he or she human.";
    }
    @GetMapping("/contact-us")
    public String contactUs() {
        return "Contact us at: newuu@uu.z or call us at +998777777777";
    }

    @GetMapping("/team")
    public String team() {
        return "Our team includes Doniyor   (Developer), Tom (Designer), and Jerry (Project Manager).";
    }





    //Task5
    //Task5




    @GetMapping("/filter")
    public List<String> filter(
            @RequestParam(name = "keyword") String keyword,
            @RequestParam(name = "category") String category) {
        List<String> products = Arrays.asList(
                "Laptop - Electronics",
                "Phone - Electronics",
                "Shirt - Clothing",
                "Jeans - Clothing"
        );

        return products.stream()
                .filter(product -> product.toLowerCase().contains(keyword.toLowerCase()) &&
                        product.toLowerCase().contains(category.toLowerCase()))
                .collect(Collectors.toList());
    }
    @GetMapping("/calculate")
    public String calculate(
            @RequestParam(name = "x") double x,
            @RequestParam(name = "y") double y,
            @RequestParam(name = "operation") String operation) {

        double result;
        if ("add".equalsIgnoreCase(operation)) {
            result = x + y;
        } else if ("subtract".equalsIgnoreCase(operation)) {
            result = x - y;
        } else if ("multiply".equalsIgnoreCase(operation)) {
            result = x * y;
        } else if ("divide".equalsIgnoreCase(operation)) {
            if (y != 0) {
                result = x / y;
            } else {
                return "Error: Division by zero!";
            }
        } else {
            return "Error: Unsupported operation!";
        }

        return String.format("Result of %s operation: %.2f", operation, result);
    }

    @GetMapping("/convert")
    public String convertTemperature(@RequestParam(name = "temperature") double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;

        return celsius + "°C is equal to " + fahrenheit + "°F";
    }

    @GetMapping("/discount")
    public String calculateDiscountedPrice(
            @RequestParam(name = "originalPrice") double originalPrice,
            @RequestParam(name = "discountRate") double discountRate) {

        double discountedPrice = originalPrice * (1 - discountRate / 100);

        return "Original Price: $" + originalPrice + ", Discount Rate: " + discountRate + "%, " +
                "Discounted Price: $" + discountedPrice;
    }





    @GetMapping("/greet")
    public String greetd(
            @RequestParam(name = "name", defaultValue = "Guest") String name) {
        return "Hello, " + name + "!"; }





    //Task2
    //Task2
    //Task2




    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/square/{num}")
    public String square(@PathVariable int num) {
        return "The square of " + num + " is " + (num * num) + ".";
    }

    @GetMapping("/double/{num}")
    public String doubleValue(@PathVariable int num) {
        return "Twice the value of " + num + " is " + (num * 2) + ".";
    }
    @GetMapping("/length/{text}")
    public String length(@PathVariable String text) {
        return "The length of the text \"" + text + "\" is " + text.length() + ".";
    }

    @GetMapping("/reverse/{text}")
    public String reverse(@PathVariable String text) {
        StringBuilder reversed = new StringBuilder(text);
        return "reverse \"" + reversed.reverse().toString() + "\".";
    }

    @GetMapping("/concat/{str1}/{str2}")
    public String concat(@PathVariable String str1, @PathVariable String str2) {
        return "concatenated  \"" + str1 + str2 + "\".";
    }
    @GetMapping("/add/{x}/{y}")
    public String add(@PathVariable int x, @PathVariable int y) {
        return "The sum of " + x + " and " + y + " is " + (x + y) + "."; }

    @GetMapping("/multiply/{x}/{y}")
    public String multiply(@PathVariable int x, @PathVariable int y) {
        return "The product of " + x + " and " + y + " is " + (x * y) + "."; }

    @GetMapping("/subtract/{x}/{y}")
    public String subytact(@PathVariable int x, @PathVariable int y) {
        return "The substraction of " + x + " and " + y + " is " + (x - y) + "."; }

    @GetMapping("/divide/{x}/{y}")
    public String divide(@PathVariable int x, @PathVariable int y) {
        return "The divition of " + x + " and " + y + " is " + (x / y) + "."; }

    @GetMapping("/modulus/{x}/{y}")
    public String modulus(@PathVariable int x, @PathVariable int y) {
        return "The modulus of " + x + " and " + y + " is " + (x % y) + "."; }

    @GetMapping("/power/{base}/{exp}")
    public String power(@PathVariable int base, @PathVariable int exp) {
        int result = (int) Math.pow(base, exp);
        return "The result of " + base + " raised to the power of " + exp + " is " + result + ".";
    }




}
