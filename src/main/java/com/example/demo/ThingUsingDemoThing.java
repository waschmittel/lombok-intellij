package com.example.demo;

public class ThingUsingDemoThing {
    public static void main(String... args) {
        var demoThing = new DemoThing();
        demoThing.setSomeProperty("hello world");
        demoThing.setaPropertyWhereBeanspecCapitalizationIsDifferent("bye world");
        System.out.println(demoThing.getSomeProperty());
        System.out.println(demoThing.getaPropertyWhereBeanspecCapitalizationIsDifferent());
    }
}