# Day 01 - Tight Coupling and Java `var`

## Objective

Learn the basics of object creation, tight coupling, constructors, and Java's `var` keyword using a simple gaming example.

---

## Concepts Covered

- Tight Coupling
- Constructor Injection (without Spring)
- Java `var` keyword
- Object Creation using `new`
- Method Calling
- Basic Package Structure

---

## Project Explanation

This project contains two game classes:

- MarioGame
- SuperContraGame

The `GameRunner` class directly depends on `SuperContraGame`, making it an example of **tight coupling**.

```java
var game = new SuperContraGame();
var gameRunner = new GameRunner(game);
```

Since `GameRunner` accepts only `SuperContraGame`, switching to another game requires changing the class itself.

---

## Java `var`

Instead of writing

```java
SuperContraGame game = new SuperContraGame();
```

we can write

```java
var game = new SuperContraGame();
```

The compiler automatically infers the variable type.

---

## Output

```
Running game...
up
sit down
Go back
Shoot a bullet
```

---

## What I Learned

- How objects communicate
- Why tight coupling is not flexible
- How constructors work
- Java local variable type inference (`var`)
- Calling methods through objects

---

## Next Topic

Loose Coupling using Interfaces and Spring Dependency Injection.
