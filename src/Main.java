public class Main {
    public static void main(String[] args) {
        MyList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("arr list size: " + arrayList.size());

        System.out.println("arr list elements");
        for (Integer item : arrayList) {
            System.out.println(item);
        }

        MyList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linked list size " + linkedList.size());

        System.out.println("linked list elements:");
        for (Integer item : linkedList) {
            System.out.println(item);
        }
    }
}