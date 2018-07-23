package com.corejava;

import java.util.Stack;

import static java.lang.Integer.parseInt;

public class BaseBallStack {
    public int calPoints(String[] ops) {
        Integer sum = 0;
        Integer num;
        Integer num1;
        Integer num2;
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            switch (op) {
                case "+":
                    num1 = stack.pop();
                    num2 = stack.peek();
                    stack.push(num1);
                    stack.push(num1 + num2);
                    sum = sum + num1 + num2;
                    break;

                case "C":
                    num = stack.pop();
                    sum = sum - num;
                    break;

                case "D":
                    num = stack.peek();
                    stack.push(num * 2);
                    sum = sum + num * 2;
                    break;

                default:
                    stack.push(parseInt(op));
                    sum = sum + parseInt(op);
            }
        }


        return sum;
    }
}
