package javaInterview.wissen;

public class DetectLoop {

    static class Node {
        int value;
        Node nextNode;

        public Node(int value) {
            super();
            this.value = value;
            //this.nextNode=null;
        }


    }

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);


        n5.nextNode = n2;

        n1.nextNode = n2;
        n2.nextNode = n3;
        n3.nextNode = n4;
        n4.nextNode = n5;


        boolean detect = detect(n2);

        System.out.println(detect);

    }

    public static boolean detect(Node head) {
        if (head == null || head.nextNode == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.nextNode;

        if (fast != null && fast.nextNode != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
        }
        return false;

    }
}
