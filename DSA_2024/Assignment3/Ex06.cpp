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
    void pop_back() {
        if(head == nullptr) {
            cout << "Can't pop back";
            return;
        }
        if(head->next == nullptr){
            head = nullptr;
        }
        Node* ptr = head;
        while(ptr->next->next != nullptr) {
            ptr = ptr->next;
        }
        Node* deleteNode = ptr->next;
        ptr->next = nullptr;
        delete deleteNode;
    }

    void print_list() {
        for(Node* ptr = head; ptr != nullptr; ptr = ptr->next) {
            cout << ptr->data << " ";
        }
    }
};
struct Stack {
    SingleLinkedList list;
    /*
        push method : complexity O(n)
    */
    void push(int value) { 
        list.push_back(value);
    }
    /*
        pop method : complexity O(n)
    */
    void pop() {
        list.pop_back();
    }
    /*
        print method : complexity O(n)
    */
    void printStack() {
        list.print_list();
    }
};

int main()
{
    Stack s;
    s.push(1);
    s.push(2);
    s.push(19);
    s.pop();
    s.printStack();
    return 0;
}