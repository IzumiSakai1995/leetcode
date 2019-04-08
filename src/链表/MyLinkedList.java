package 链表;

/**
 * 设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next
 * 是指向下一个节点的指针/引用。如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。
 * 实现功能
 * get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 * addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 * addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末
 * 尾。如果 index 大于链表长度，则不会插入节点。
 * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 * Design your implementation of the linked list.You can choose to use the singly linked or the doubly linked list.A node in
 * singly linked list should have two attributes: val and next .val is the value of current node,and next is a pointer/reference to
 * the next node. if you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node
 * in the linked list. Assume all nodes in the linked list are 0-index.
 * note: Do not use the built-in LinkedList library
 */
public class MyLinkedList {

    class Node{
        int val;
        Node next;
        Node last;
        Node(int val){
            this.val = val;
        }
    }

    int size = 0;
    private Node head = new Node(0);
    private Node tail = head;
    public MyLinkedList(){

    }
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size){
            return -1;
        }
        Node curr = head;
        while ( index >= 0){
            index--;
            curr = curr.next;
        }
        return curr.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        size++;
        Node node = new Node(val);
        node.next = head.next;
        head.next = node;
        if (tail == head){
            tail = node;
        }
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        size++;
        Node node = new Node(val);
        tail.next = node;
        tail = tail.next;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > size){
            return;
        }
        size ++;
        Node node = new Node(val);
        if (index == size - 1){
            tail.next = node;
            tail = tail.next;
            return;
        }
        Node curr = head;
        // 找到前一个
        while (index > 0){
            index --;
            curr = curr.next;
        }
        node.next = curr.next;
        curr.next = node;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size){
            return;
        }
        size --;
        Node curr = head;
        // 找到被删除的前一个
        while (index > 0){
            index--;
            curr = curr.next;
        }
        if (curr.next != null){
            curr.next = curr.next.next;
        }
        if (curr.next == null){
            tail = curr;
        }

    }

}

