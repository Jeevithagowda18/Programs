package Pogram312;

class Animal {
    public void makeSound() 
    {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal 
{
    @Override
    public void makeSound() 
    {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal 
{
    @Override
    public void makeSound()
    {
        System.out.println("The cat meows.");
    }
}

public class AnimalMain 
{
    public static void main(String[] args) 
    {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        System.out.println("Animal Object:");
        animal.makeSound();
        System.out.println("Dog Object:");
        dog.makeSound();
        System.out.println("Cat Object:");
        cat.makeSound();
    }
}