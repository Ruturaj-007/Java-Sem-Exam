# Java-Sem-Exam 📝

A collection of **Java programs** covering core concepts of Object-Oriented Programming (OOP) and other fundamental topics, prepared for semester exams.  

This repository is designed as a **study resource** for quick revision, hands-on practice, and clear understanding of Java concepts that are frequently asked in exams.  

---

## 📖 About
Java is a versatile, object-oriented programming language widely used in academics and industry.  
This repo contains examples that demonstrate:
- **Basic OOP principles** (inheritance, abstraction, polymorphism, encapsulation)
- **Core Java features** such as static keyword, constructors, recursion, native methods, etc.
- **Memory concepts** like shallow copy vs deep copy
- **Practical problem-solving** with simple, readable code  

Each file is a **standalone program** focused on a specific concept, so you can run and test them individually.

---

## 🎯 Motivation
- To have all **semester exam-focused Java programs in one place**.
- To help students (including myself 😅) quickly revise with **ready-to-run code**.
- To build a foundation for larger Java projects by mastering the basics.

---

## ✨ Features
- 📂 Organized collection of **Java files by topic**  
- 📝 Each example has **clear and minimal code** for learning  
- 🎓 Covers **important exam concepts**  
- 💻 Tested with `javac` and `java` commands  

---

## 🚀 Examples

### Example: Using `super` Keyword
```java
class Vehicle {
    int speed = 50;
}

class Bike extends Vehicle {
    int speed = 100;

    void display() {
        System.out.println(speed);       // prints child speed = 100
        System.out.println(super.speed); // prints parent speed = 50
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.display();
    }
}
