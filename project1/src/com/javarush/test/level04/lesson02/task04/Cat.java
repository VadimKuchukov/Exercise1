package com.javarush.test.level04.lesson02.task04;

public class Cat {
    private String fullName;
    public void setName(String firstName, String lastName)
    {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;
    }

    public static void main(String [] args){
        Cat cat1 = new Cat();
        cat1.setName("Vlad", "Stasov");
        System.out.println(cat1.fullName);

    }
}
