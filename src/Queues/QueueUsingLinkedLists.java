package Queues;

import java.util.LinkedList;

public class QueueUsingLinkedLists {

    LinkedList<Integer> queue;

    QueueUsingLinkedLists(){
        queue = new LinkedList<>();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void enqueue(int data){
        queue.addLast(data);
    }

    public void dequeue(){
        queue.removeFirst();
    }

    public int getFront(){
        return queue.getFirst();
    }

    public static void main(String[] args){

        QueueUsingLinkedLists queue = new QueueUsingLinkedLists();
        for (int i =1; i <6; i++){
            queue.enqueue(i*10);
        }

        System.out.println(queue.getFront());
    }
}
