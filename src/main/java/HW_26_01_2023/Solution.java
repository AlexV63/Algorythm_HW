package HW_26_01_2023;

/**
 * В MyLinkedList завершить реализацию public T get(int i)
 * <p>
 * Реализовать дополнительные методы:
 * public boolean pushToIndex(int index, int data) - добавляет элемент по индексу
 * public T remove(int index) - удаляет элемент по индексу
 * size
 * <p>
 * Со звёздочкой
 * Добавить  метод reverse - разворачивает список
 * Сделать список двусвязным (все методы должны работать корректно)
 */

public class Solution {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();


        linkedList.add(5);
        linkedList.add(15);
        linkedList.add(25);
        linkedList.add(35);
        linkedList.add(45);
        linkedList.add(55);

        linkedList.print();
        System.out.println();

        linkedList.remove(35);
        System.out.println("After remove");
        linkedList.print();

    }
}


//        linkedList.add("abc");
//        linkedList.add("def");
//        linkedList.add("ghi");
//        linkedList.add("klm");
