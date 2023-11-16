package DesignPattern.solid;

public class Overview {

    /*

SOLID:-
Single Responsibility
Open/Closed
Liskov Substitution
Interface Segregation
Dependency Injection

        Helps to write better code:-
        -avoid duplicate code
        -easy to maintain
        -easy to understand
        -flexible software
        -reduce complexity
     */




    /*

    Single Responsibility:- one class should have only 1 responsibility
    we should write , change, and maintain a class only for one purpose

    In invoice class is having 3 methods , so need to create 3 classes
    Invoice -> calculate the price of the marker
    InvoiceDao -> save it to Dao
    InvoicePrinter -> print the


    Open/Closed principle:-
    Open for extension but closed for modification

    create an interface InvoiceDao and have a method

    create 2 classes DatabaseInvoiceDao and FileInvoiceDao and implement the InvoiceDao interface

    if any other functions need to add then create a class and implement the interface


    Liskov substitution principle:-
    If Class B is subtype of Class A, then we should be able to replace object of A with B
    without breaking the behaviour of the program

    Subclass should extend the capability of parent class not narrow it down

    Parent newObj1 = new Child1();
    Car class having 1 method hasEngine.
    extended by Car class, Bike class and Bicycle class
    it will break the code and will return null pointer exception in Bicycle

    create a Vehicle class and put a generic method
    create an EngineVehicle class end extend the Vehicle and create Bicycle and extend the Vehicle



    Interface Segmented principle:-
    lets take an Interface RestaurantEmployee() and having 3 methods
    washDishes();
    serveCustomers();
    cookFoods();

    create a class Waiter and implement RestaurantEmployee()
    but waiter do not do all the methods

    So create 2 different interfaces and implement in the class
    WaiterInterface -> serveCustomer() , takeOrder()
    ChefInterface -> cookFood(), decideMenu()


    Dependency inversion;-
    Class should depend on interfaces rather than concrete classes
    Mouse(interface)

    KeyBoard(interface)




     */




}
