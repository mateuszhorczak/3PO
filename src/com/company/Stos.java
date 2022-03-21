package com.company;

public class Stos {
    int length;
    int lengthMax;
    int[] tab;

    public void init(int sizeIn) {
        lengthMax = sizeIn;
        length = 0;
        tab = new int[lengthMax];
    }


    void push(int value) {
        if (!full()) {
            tab[length] = value;
            length++;
        }
    }

    int pop() {
        if (length >= 0) {
            length--;
            return tab[length];
        }
        return 0;
    }

    int top() {
        return tab[length-1];
    }

    boolean empty() {
        return length == 0;
    }

    boolean full() {
        return length == lengthMax;
    }

    void destroy(){
        length = 0;
    }
}
