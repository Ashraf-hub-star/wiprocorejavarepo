package com.wipro.inheritance;


class Animal {
 String name;

 public Animal(String name) {
     this.name = name;
 }

 public void eat() {
     System.out.println(name + " is eating.");
 }

 public void sleep() {
     System.out.println(name + " is sleeping.");
 }
}


class Dog extends Animal {
 public Dog(String name) {
     super(name); 
 }

 public void bark() {
     System.out.println(name + " is barking.");
 }
}


class Cat extends Animal {
 public Cat(String name) {
     super(name); 
 }

 public void meow() {
     System.out.println(name + " is meowing.");
 }
}


public class Inheritance {
 public static void main(String[] args) {
     Dog dog = new Dog("Buddy");
     dog.eat();
     dog.bark();
     dog.sleep();

     Cat cat = new Cat("Kitty");
     cat.eat();
     cat.meow();
     cat.sleep();
 }
}

