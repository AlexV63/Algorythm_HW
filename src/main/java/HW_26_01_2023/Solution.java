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

        linkedList.add("abc");
        linkedList.add("def");
        linkedList.add("ghi");
        linkedList.add("klm");

        linkedList.print();

    }
}

//        ListEx.list.add(10);
//        ListEx.list.add(8);
//        ListEx.list.add(3);
//        ListEx.list.add(15);
//        ListEx.list.add(9);
//
//        System.out.println(ListEx.list);
//
//        ListEx.pushToIndex(3, 5);
//        System.out.println(ListEx.list);
//
//        ListEx.removeByIndex(5);
//        System.out.println(ListEx.list);
//
//        System.out.println(ListEx.sizeList());
//

//        DoublyLinkedList doublyLinkedList =  new ArrayList<>();



//    public class ListEx {
//        private static LinkedList list = new LinkedList();

//        public static boolean pushToIndex(int index, int data) {
////            if (index >= 0 && index <= list.size()) {
////                list.add(index, data);
////                return true;
////            }
////            return false;
////        }
////
////        public static int removeByIndex(int index) {
////            if (index >= 0 && index < list.size()) {
////                return list.remove(index);
////            }
////            return -1;
////        }
////
////        public static int sizeList() {
////            return list.size();
////        }
////    }
////}

//    public class DoublyLinkedList<T> extends ArrayList<T> {
//        private Node head;
//        private Node tail;
//
//
//        public  void reverse() {
//            Node current = head;
//            Node temp = null;
//
//            while (current != null) {
//                temp = current.prev;
//                current.prev = current.next;
//                current.next = temp;
//                current = current.prev;
//            }
//
//            temp = head;
//            head = tail;
//            tail = temp;
//        }
//    }
//}

