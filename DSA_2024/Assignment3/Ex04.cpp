#include <bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    Node* next;
};

struct SingleLinkedList{
    Node* head;
    SingleLinkedList(){
        head = nullptr;
    }
    void push_back(int value) {
        Node* newNode = new Node();
        newNode->data = value;
        if(head == nullptr) {
            head = newNode;
            return;
        }
        Node* ptr = head;
        while(ptr->next != nullptr) {
            ptr = ptr->next;
        }
        ptr->next = newNode;
    }
    void pop_front() {
        if(head == nullptr) {
            cout << "Can't pop front";
            return;
        }
        Node* ptr = head;
        head = head->next;
        delete ptr;
    }

    void print_list() {
        for(Node* ptr = head; ptr != nullptr; ptr = ptr->next) {
            cout << ptr->data << " ";
        }
    }
};
struct Queue {
    SingleLinkedList list;
    /*
        push method : complexity O(n)
    */
    void push(int value) { 
        list.push_back(value);
    }
    /*
        pop method : complexity O(1)
    */
    void pop() {
        list.pop_front();
    }
    /*
        print method : complexity O(n)
    */
    void printQueue() {
        list.print_list();
    }
};

int main()
{
    Queue q;
    q.push(1);
    q.push(2);
    q.push(19);
    q.pop();
    q.printQueue();
    return 0;
}