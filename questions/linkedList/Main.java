package questions.linkedList;

class LinkedList {
    Node head;
    class Node {
        int a;
        Node nextNode;
        Node (int data){
            this.a=data;
            this.nextNode=null;
        }
    }

    public LinkedList add(LinkedList list , int data){

        Node node = new Node(data);
        if(list.head == null){
            list.head=node;
        }else{
            Node temp = list.head;
            while(temp.nextNode != null){
                temp=temp.nextNode;
            }
            temp.nextNode = node;
        }
        return list;
    }

    public LinkedList addFirst(LinkedList list , int data){

        Node node = new Node(data);
        if(list.head == null){
            list.head=node;
        }else{
            node.nextNode=list.head;
            list.head=node;
        }
        return list;
    }

    public LinkedList addLast(LinkedList list , int data){

        Node node = new Node(data);
        if(list.head == null){
            list.head=node;
        }else{
            Node temp = list.head;
            while(temp.nextNode != null){
                temp=temp.nextNode;
            }
            temp.nextNode = node;
        }
        return list;
    }

    public LinkedList addPos(LinkedList list , int data, int pos){

        Node node = new Node(data);
        if(list.head == null){
            list.head=node;
        } else if(pos == 1){
            node.nextNode=list.head;
            list.head=node;
        } else{
            Node temp = list.head;
            Node prev;
            int count =1;
            while(temp.nextNode != null){
                prev=temp;
                temp=temp.nextNode;
                count ++;
                if(count == pos){
                    prev.nextNode=node;
                    node.nextNode=temp;
                }
            }
        }
        return list;
    }

    public void show(LinkedList list) {
        Node temp = list.head;
        System.out.print(temp.a);
        while(temp.nextNode !=null){
            temp=temp.nextNode;
            System.out.print(" -> " + temp.a);
        }
    }

    public LinkedList remove (LinkedList list, int pos){
        Node prev;
        int count =1;
        Node temp = list.head;

        while(temp.nextNode != null){
            prev=temp;
            temp=temp.nextNode;
            count++;
            if(count == pos){
                prev.nextNode=temp.nextNode;
            }
        }
        return list;
    }

    public int size(LinkedList list){
        int count = 0;
        if(list == null){
            return count;
        } else{
            Node temp = head;
            count++;
            while(temp.nextNode !=null){
                temp=temp.nextNode;
                count++;
            }
        }
        return count;
    }

//    public LinkedList reverse(LinkedList list){
//
//          Node temp = head;
//          while(temp.nextNode !=null){
//              temp=temp.nextNode;
//          }
//          head=temp;
//          return list;
//    }

}

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list = list.add(list,5);
        list = list.add(list,6);
        list = list.add(list,7);
        list.show(list);
        System.out.println("\n");
        // list = list.reverse(list);
        list.show(list);
    }

}
