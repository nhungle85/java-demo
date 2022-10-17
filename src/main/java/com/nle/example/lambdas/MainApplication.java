package com.nle.example.lambdas;

public class MainApplication {
    public static void main(String[] args) {
        //way 1
        Greeting greeting1 = new HelloGreeting();
        greeting1.sayHello();

        //way 2
        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello World2");
            }
        };
        greeting2.sayHello();

        //way 3 using lambda
        Greeting greeting3 = () -> System.out.println("Hello World 3");
        greeting3.sayHello();
    }
}
