package com.corejava.ImplementingQueueUsingTwoStacks;

import java.util.Arrays;
import java.util.Stack;

public class StacksQueue {
    static Stack<Integer> inbox = new Stack<>();
    static Stack<Integer> outbox = new Stack<>();

    public void implementationQueue(Integer[] num){
        for(int i = 0 ; i< num.length; i++){
            inbox.push(num[i]);
        }
    }

    public Stack<Integer> result() {
            while (!(inbox.isEmpty())) {
                outbox.push(inbox.pop());
            }
        return outbox;
    }

    public void printStack(Stack<Integer> stack){
        while(!(stack.isEmpty())) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args){
        StacksQueue stacksQueue = new StacksQueue();
        Integer [] num = {1,2,3,4,5};
        stacksQueue.implementationQueue(num);
        System.out.println("what the input look like: ");
                System.out.println(Arrays.toString(num));
        System.out.println("Pop from the second stack to achieve the functionality of Queue");
        stacksQueue.printStack(stacksQueue.result());
    }
}
