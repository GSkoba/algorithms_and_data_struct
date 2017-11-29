package seminar;


import seminar.collections.IQueue;
import seminar.collections.IStack;
import seminar.collections.LinkedQueue;
import seminar.collections.LinkedStack;
import seminar.collections.TwoStackQueue;

public class Main {

    public static void main(String[] args) {
        System.out.println("LinkedStack");
        IStack<Integer> stack = new LinkedStack<>();
        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }
        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("LinkedQueue");
        IQueue<Integer> queue = new LinkedQueue<>();
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i);
        }
       for (int i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("TwoStackQueue");
        queue = new TwoStackQueue<>();
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
