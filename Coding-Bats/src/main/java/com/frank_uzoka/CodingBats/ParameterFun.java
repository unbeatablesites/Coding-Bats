package com.frank_uzoka.CodingBats;

public class ParameterFun {

    public static void main(String[] args) {


        int myNum = 5;

        addToMe(myNum);

        System.out.println("Value of myNum after being passes into method = " + myNum);

        Person myPerson = new Person("John Doe", "Astronaut");

        System.out.println("Name of person before passing into method = " + myPerson.getName());

        changeMyName(myPerson);

        System.out.println("Name of person being passed into method = " + myPerson.getName());

    }

    public static void addToMe(int number){

        System.out.println("Number passed in = " + number);

        number = number + 1;

        System.out.println("Number value after adding one = " + number);

    }

    public static void  changeMyName(Person person){

        System.out.println("The name of the person passed in as a variable = " + person.getName());

        person.setName("Frank Uzoka ");

        System.out.println("Name of person  after changing it in method " + person.getName());
    }

}
