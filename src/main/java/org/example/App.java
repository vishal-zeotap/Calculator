package org.example;

import lombok.Data;

@Data
public class App {

    DummyInterface dummy;

    public App(DummyInterface dummy) {
        this.dummy = dummy;
    }

    public Integer func1(Integer num1, Integer num2) {
        return add(num1, num2) + dummy.func2(num1, num2);
    }

    public Integer add(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer sub(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Integer mul(Integer num1, Integer num2) {
        return num1 * num2;}

    public Integer div(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {

    }
}