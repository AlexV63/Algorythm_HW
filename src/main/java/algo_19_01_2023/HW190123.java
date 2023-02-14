//package algo_19_01_2023;
//
//import java.util.Arrays;
//import java.util.Stack;
//
//
//public class HW190123 {
////    First level: 1. Реализовать метод search() у написанного на занятии стека MyStack (см. код в репозитории).
////    public int search(int element) -  определяет, существует ли объект в стеке.
////    Если элемент найден, возвращает позицию элемента с вершины стека. В противном случае он возвращает -1.
//
//
//    @Override
//    public String toString() {
//        return "HW190123{" +
//                "array=" + Arrays.toString(array) +
//                '}';
//    }
//
//    private int[] array;
//    private int count;
//
//    public HW190123(int size) {
//        array = new int[size];
//        count = 0;
//    }
//
//    public void push(int element) {
//        if (count == array.length) throw new RuntimeException("Stack is full");
//        array[count++] = element;
//    }
//
//    public int pop() {
//        return array[count--];
//    }
//
//    public int search(int element) {  //todo  done
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == element) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
////    Классическая Queue - реализовать используя массив (Array)
////    pushToEnd(int data) - вставляет элемент в конец queue
////    remove() - удаляет элемент из начала queue
////    peek() - возвращает элемент из начала не удаляя его
////    isEmpty()
////    size()
//
//    public static class Queue {
//        private int[] arrQueue;      // массив для хранения элементов queue
//        private int head;      // head указывает на передний элемент в queue
//        private int tail;       // tail часть указывает на последний элемент в queue
//        private int capacity;   // максимальная емкость queue
//        private int count;      // текущий размер queue
//
//        //Конструктор для инициализации queue
//        public Queue(int size) {
//            arrQueue = new int[size];
//            int length = size;
//            int head = 0;
//            int tail = -1;
//            int count = 0;
//        }
//
//        public void pushToEnd(int n) {
//            if (tail == arrQueue.length - 1) {
//                System.out.println("Queue is full.");
//            } else {
//                System.out.println(arrQueue[++tail] = n);
//            }
//        }
//
//        public int remove() {
//            if (head == tail) {
//                System.out.println("Queue is empty.");
//                return -1;
//            } else {
//                System.out.println(arrQueue.toString());
//                return arrQueue[++head];
//            }
//        }
//
//        public int peek() {
//            System.out.println(arrQueue[head + 1]);
//            if (head == tail) {
//                System.out.println("Queue is empty.");
//                return -1;
//            } else {
//                return arrQueue[head + 1];
//            }
//        }
//
//        public boolean isEmpty() {
//            if (head == tail) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//
//        public int size() {
//            count = tail - head;
//            System.out.println(count);
//            return count;
//        }
//
//    }
//    public static void main(String[] args) {
//
//        HW190123 myStack = new HW190123(5);
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(4);
//        myStack.push(5);
//
//        System.out.println(myStack);
//        System.out.println(myStack.search(3));
//        System.out.println(myStack.search(6));
//
////        arrQmyQueue = new Queue(4);
////
////        int[] myQueue = {1, 2, 3, 4};
//
//        arrQ.
//        myQueue.pushToEnd(1);
//        myQueue.pushToEnd(2);
//        myQueue.pushToEnd(3);
//        myQueue.pushToEnd(4);
//
//
//        myQueue.(5);
//        myQueue.remove();
//        myQueue.peek();
//        myQueue.isEmpty();
//        myQueue.size();
//    }
//}
