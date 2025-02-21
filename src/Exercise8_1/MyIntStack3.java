package Exercise8_1;

import java.util.Arrays;

public class MyIntStack3 {
    private int[] contents;
    private int tos;

    public MyIntStack3(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    public void push(int element) {
        if (isFull()) {
            contents = Arrays.copyOf(contents, contents.length * 2);
        }
        contents[++tos] = element;
    }


    public int pop() {
        return contents[tos--];
    }

    public int peek() {
        return contents[tos];
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    public boolean isFull() {
        return tos == contents.length - 1;
    }
}
