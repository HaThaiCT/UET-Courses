#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    Node* prev;
    Node* next;
};

struct DoubleLinkedList {
    Node* head = nullptr;

    void addInLastList(int val) {
        Node* newNode = new Node();
        newNode->data = val;
        newNode->prev = nullptr;
        newNode->next = nullptr;
        if(head == nullptr) {
            head = newNode;
            return;
        }
        Node* ptr = head;
        while(ptr->next != nullptr) {
            ptr = ptr->next;
        }
        ptr->next = newNode;
        newNode->prev = ptr;
        return;
    }

    int count_triplets() {
        int answer = 0;
        Node* ptr = head;
        while(ptr != nullptr) {
            if(ptr->prev != nullptr && ptr->next != nullptr && (ptr->prev->data) + (ptr->data) + (ptr->next->data) == 0) {
                answer ++;
            }
            ptr = ptr->next;
        }
        return answer;
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
    DoubleLinkedList list;
    int n;
    cin >> n;
    while(n--) {
        int x;
        cin >> x;
        list.addInLastList(x);
    }
    //list.printList();
    cout << list.count_triplets();
    return 0;
}