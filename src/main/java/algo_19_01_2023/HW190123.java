package algo_19_01_2023;

import java.util.Arrays;
import java.util.Stack;


public class HW190123 {
//    First level: 1. Реализовать метод search() у написанного на занятии стека MyStack (см. код в репозитории).
//    public int search(int element) -  определяет, существует ли объект в стеке.
//    Если элемент найден, возвращает позицию элемента с вершины стека. В противном случае он возвращает -1.


    @Override
    public String toString() {
        return "HW190123{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    private int[] array;
        private int count;
        public HW190123(int size) {
            array = new int[size];
            count = 0;
        }
        public void push(int element) {
            if (count == array.length) throw new RuntimeException("Stack is full");
            array[count++] = element;
        }

        public int search(int element) {  //todo  done
            for (int i = 0; i < array.length; i++) {
                if (array[i]==element){
                    return i;
                }
             }
            return -1;
        }

        public static void main(String[] args) {

            HW190123 myStack = new HW190123(5);
            myStack.push(1);
            myStack.push(2);
            myStack.push(3);
            myStack.push(4);
            myStack.push(5);

            System.out.println(myStack);
            System.out.println(myStack.search(3));
            System.out.println(myStack.search(6));

            Queue myQueue = new Queue(4);
            int[] arr = {1,2,3,4};

//            int 1= myQueue.head;
//
//
//
//
//            myQueue.enQueue(2);
//            myQueue.enQueue(1);
//            myQueue.display();
//            myQueue.deQueue();
//            myQueue.peak();



       }

//    Классическая Queue - реализовать используя массив (Array)
//    pushToEnd(int data) - вставляет элемент в конец queue
//    remove() - удаляет элемент из начала queue
//    peek() - возвращает элемент из начала не удаляя его
//    isEmpty()
//    size()
//    начало:

    public static class Queue {
    private int[] arr;      // массив для хранения элементов queue
    private int head;      // head указывает на передний элемент в queue
    private int tail;       // tail часть указывает на последний элемент в queue
    private int capacity;   // максимальная емкость queue
    private int count;      // текущий размер queue

     //Конструктор для инициализации queue
    public Queue(int size)
    {
        arr = new int[size];
        capacity = size;
        head = 0;
        tail = -1;
        count = 0;
    }

    }
}
