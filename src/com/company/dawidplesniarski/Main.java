package com.company.dawidplesniarski;


import com.company.dawidplesniarski.solid.dependencyinversion.BadMood;
import com.company.dawidplesniarski.solid.dependencyinversion.MoodLogic;

public class Main {

    public static void main(String[] args) {
        BadMood badMood = new BadMood();
        MoodLogic moodLogic = new MoodLogic();
        MoodLogic.doSomething(badMood);
    }
}

// TODO: Tutaj zostały umieszczone zakomentowane wywołania metod

//interface Mood{
//    void writeSomething();
//}
//class GoodMood implements Mood{
//    @Override
//    public void writeSomething() {
//        System.out.println("I have good mood! 😁");
//    }
//}
//class BadMood implements Mood{
//    @Override
//    public void writeSomething() {
//        System.out.println("I have bad mood! 😥");
//    }
//}
//class ScaredMood implements Mood{
//    @Override
//    public void writeSomething() {
//        System.out.println("I'm scared! 🙀");
//    }
//}
//class MoodLogic{
//    static void doSomething(Mood mood){
//        mood.writeSomething();
//    }
//}


//        PersonValidator validator = new PersonValidator();
//        AdultPerson person = new AdultPerson("Jan","Kowalski","asdf3#gmai.com",17);
//
//        if(!validator.isEmailAddressValid(person.getEmailAddress())){
//            throw new DataFormatException("Nieprawidłowy e-mail!");
//        }
//        if(!validator.isPersonAdult(person.getAge())){
//            throw new DataFormatException("Osoba niepełnoletnia!");
//        }
//        Calculator calculator = new Calculator();
//        Square square = new Square(4);
//        Rectangle rectangle = new Rectangle(4,5);
//        Triangle triangle = new Triangle(4,3);
//        System.out.println(calculator.area(triangle));
//        List<String> someList = new ArrayList<>();
//        someList.add("asdf");
//        someList.add("qwer");
//        someList.add("zxcv");
//
//        Set<String> someSet = new HashSet<>();
//        someSet.add("asdf");
//        someSet.add("qwer");
//        someSet.add("zxcv");
//
//        Queue<String> someQueue = new PriorityQueue<>();
//        someQueue.add("asdf");
//        someQueue.add("qwer");
//        someQueue.add("zxcv");
//
//        DoSomethingWithCollection.printCollection(someList);
//        DoSomethingWithCollection.printCollection(someSet);
//        DoSomethingWithCollection.printCollection(someQueue);
//class Logic{
//    static void writeSomethingGood(){
//        System.out.println(":)");
//    }
//
//    static void writeSomethingBad(){
//        System.out.println(":(");
//    }
//}
//class MoodLogic{
//    static void doSomething(String mood){
//        if(mood.equals("happy")){
//            Logic.writeSomethingGood();
//        }else if(mood.equals("sad")){
//            Logic.writeSomethingBad();
//        }
//    }
//}

//    Pizzeria pizzeria = new Pizzeria();
//        Pizza pizza = new Pizza(PizzaType.Margerita);
//        pizzeria.newPizza(pizza);
