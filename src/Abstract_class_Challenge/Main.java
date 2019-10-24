package Abstract_class_Challenge;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(null);
        myLinkedList.traverse(myLinkedList.getRoot());

        String s = "5 8 9 1 6 4 2 3 7";
        String[] data = s.split(" ");
        for(String i: data){
            myLinkedList.addItem(new Node(i));
        }

        myLinkedList.traverse(myLinkedList.getRoot());
        for(int i = 1; i < 10; i++) {
            s = String.valueOf(i);
            myLinkedList.removeItem(new Node(s));
            myLinkedList.traverse(myLinkedList.getRoot());
        }
    }
}
