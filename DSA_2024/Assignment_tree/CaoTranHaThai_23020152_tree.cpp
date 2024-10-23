#include <iostream>
#include <queue>
#include <limits.h>

using namespace std;

// Một Node trong cây
class Node {
public:
    int data;
    Node* fatherNode;
    Node* firstChild;
    Node* nextSibling;

    Node(int data) {
        this->data = data;
        this->fatherNode = nullptr;
        this->firstChild = nullptr;
        this->nextSibling = nullptr;
    }
};

class Tree {
    Node* root;

public:
    Tree() {
        root = nullptr;
    }

    bool insert(int father, int data) {
        if (root == nullptr) {
            root = new Node(data);
            return true;
        }
        Node* parentNode = findNode(root, father);
        if (parentNode == nullptr) {
            return false;
        }

        Node* newNode = new Node(data);
        newNode->fatherNode = parentNode;

        if (parentNode->firstChild == nullptr) {
            parentNode->firstChild = newNode;
        } else {
            Node* current = parentNode->firstChild;
            Node* prev = nullptr;
            while (current != nullptr && current->data < data) {
                prev = current;
                current = current->nextSibling;
            }
            if (prev == nullptr) {
                newNode->nextSibling = parentNode->firstChild;
                parentNode->firstChild = newNode;
            } else {
                newNode->nextSibling = current;
                prev->nextSibling = newNode;
            }
        }
        return true;
    }

    Node* findNode(Node* node, int data) {
        if (node == nullptr) return nullptr;
        if (node->data == data) return node;

        Node* found = findNode(node->firstChild, data);
        if (found) return found;

        return findNode(node->nextSibling, data);
    }

    int remove(int data) {
        Node* nodeToDelete = findNode(root, data);
        if (nodeToDelete == nullptr) return 0;

        return removeHelper(nodeToDelete);
    }

    int removeHelper(Node* node) {
        if (node == nullptr) return 0;

        int count = 1;
        Node* child = node->firstChild;
        while (child != nullptr) {
            count += removeHelper(child);
            child = child->nextSibling;
        }

        if (node->fatherNode != nullptr) {
            Node* parent = node->fatherNode;
            if (parent->firstChild == node) {
                parent->firstChild = node->nextSibling;
            } else {
                Node* sibling = parent->firstChild;
                while (sibling->nextSibling != node) {
                    sibling = sibling->nextSibling;
                }
                sibling->nextSibling = node->nextSibling;
            }
        }

        delete node;
        return count;
    }

    void preorder() {
        preorderHelper(root);
        cout << endl;
    }

    void preorderHelper(Node* node) {
        if (node == nullptr) return;
        cout << node->data << " ";
        preorderHelper(node->firstChild);
        preorderHelper(node->nextSibling);
    }

    void postorder() {
        postorderHelper(root);
        cout << endl;
    }

    void postorderHelper(Node* node) {
        if (node == nullptr) return;
        postorderHelper(node->firstChild);
        cout << node->data << " ";
        postorderHelper(node->nextSibling);
    }

    bool isBinaryTree() {
        return isBinaryTreeHelper(root);
    }

    bool isBinaryTreeHelper(Node* node) {
        if (node == nullptr) return true;
        Node* child = node->firstChild;
        int count = 0;
        while (child != nullptr) {
            count++;
            child = child->nextSibling;
        }
        return count <= 2 && isBinaryTreeHelper(node->firstChild) && isBinaryTreeHelper(node->nextSibling);
    }

    bool isBinarySearchTree() {
        return isBinarySearchTreeHelper(root, INT_MIN, INT_MAX);
    }

    bool isBinarySearchTreeHelper(Node* node, int min, int max) {
        if (node == nullptr) return true;
        if (node->data < min || node->data > max) return false;
        Node* child = node->firstChild;
        if (child == nullptr) return true;
        if (child->data > node->data || (child->nextSibling && child->nextSibling->data < node->data)) return false;

        return isBinarySearchTreeHelper(child, min, node->data) && isBinarySearchTreeHelper(child->nextSibling, node->data, max);
    }

    bool isMaxHeapTree() {
        return isMaxHeapHelper(root);
    }

    bool isMaxHeapHelper(Node* node) {
        if (node == nullptr) return true;
        Node* child = node->firstChild;
        while (child != nullptr) {
            if (child->data > node->data) return false;
            child = child->nextSibling;
        }
        return isMaxHeapHelper(node->firstChild) && isMaxHeapHelper(node->nextSibling);
    }

    int height() {
        return heightHelper(root);
    }

    int heightHelper(Node* node) {
        if (node == nullptr) return 0;
        int maxHeight = 0;
        Node* child = node->firstChild;
        while (child != nullptr) {
            maxHeight = max(maxHeight, heightHelper(child));
            child = child->nextSibling;
        }
        return maxHeight + 1;
    }

    int findMax() {
        return findMaxHelper(root);
    }

    int findMaxHelper(Node* node) {
        if (node == nullptr) return INT_MIN;
        int maxValue = node->data;
        maxValue = max(maxValue, findMaxHelper(node->firstChild));
        maxValue = max(maxValue, findMaxHelper(node->nextSibling));
        return maxValue;
    }

    int numOfLeaves() {
        return numOfLeavesHelper(root);
    }

    int numOfLeavesHelper(Node* node) {
        if (node == nullptr) return 0;
        if (node->firstChild == nullptr) return 1;
        int count = 0;
        count += numOfLeavesHelper(node->firstChild);
        count += numOfLeavesHelper(node->nextSibling);
        return count;
    }
};

int main(int argc, char const* argv[]) {
    Tree tree;

    tree.insert(0, 20);
    tree.insert(20, 15);
    tree.insert(20, 30);
    tree.insert(15, 10);
    tree.insert(15, 18);
    tree.insert(30, 25);
    tree.insert(30, 40);

    tree.preorder();
    tree.postorder();
    cout << tree.isBinaryTree() << endl;
    cout << tree.isBinarySearchTree() << endl;
    cout << tree.isMaxHeapTree() << endl;
    cout << tree.height() << endl;
    cout << tree.numOfLeaves() << endl;
    cout << tree.findMax() << endl;

    return 0;
}
