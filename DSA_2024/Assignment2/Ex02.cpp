#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    Node* next;
};

struct SingleLinkedList {
    Node* head = nullptr;

    void addList(int p , int x) {
        Node* newNode = new Node();
        newNode->data = x;
        if(p == 0) {
            newNode->next = head;
            head = newNode;
            return;
        }

        Node* ptr = head;
        for(int i = 0 ; i < p - 1 && ptr != nullptr ; i++) {
            ptr = ptr->next;
        }
        if(ptr == nullptr) {
            cout << "Error to insert";
        }
        else {
            newNode->next = ptr->next;
            ptr->next = newNode;
        }
    }

    void remove(int p) {
        if(head == nullptr) {
            cout << "List can't delete";
            return;
        }
        Node *ptr = head;
        if(p == 0) {
            head = head->next;
            delete ptr;
            return;
        }
        for(int i = 0 ; i < p - 1 && ptr != nullptr ; i++) {
            ptr = ptr -> next;
        }
        if(ptr == nullptr || ptr -> next == nullptr) {
            cout << "Error to delete";
            return;
        }
        Node* deleteNode = ptr->next;
        ptr->next = deleteNode->next;
        delete deleteNode;
        return;
    }

    void printList() {
        Node* ptr = head;
        while(ptr != nullptr) {
            cout << ptr->data << " ";
            ptr = ptr -> next;
        }
    }
};


int main()
{
    SingleLinkedList list;
    int n;
    cin >> n;
    while(n --) {
        string method;
        cin >> method;
        if(method == "insert") {
            int p , x;
            cin >> p >> x;
            list.addList(p , x);
        }
        if(method == "delete") {
            int p;
            cin >> p;
            list.remove(p);
        }
    }
    list.printList();
    return 0;
}