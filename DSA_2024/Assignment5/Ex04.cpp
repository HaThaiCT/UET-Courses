#include <iostream>
#include <unordered_map>
#include <sstream>
using namespace std;

struct Student {
    int id;
    string name;
    string studentClass;

    Student(int id = 0, string name = "", string studentClass = "") {
        this->id = id;
        this->name = name;
        this->studentClass = studentClass;
    }
};

struct StudentManagement {
    unordered_map<int, Student> studentMap;

    void insert(int id, string name, string studentClass) {
        Student student(id, name, studentClass);
        studentMap[id] = student;
    }

    void remove(int id) {
        studentMap.erase(id);
    }

    string infor(int id) {
        if (studentMap.find(id) != studentMap.end()) {
            return studentMap[id].name + "," + studentMap[id].studentClass;
        } else {
            return "NA,NA";
        }
    }
};

int main() {
    StudentManagement sm;
    string command;
    
    while (getline(cin, command)) {
        stringstream ss(command);
        string operation;
        ss >> operation;

        if (operation == "Insert") {
            int id;
            string name, studentClass;
            ss >> id >> name >> studentClass;
            sm.insert(id, name, studentClass);
        } else if (operation == "Delete") {
            int id;
            ss >> id;
            sm.remove(id);
        } else if (operation == "Infor") {
            int id;
            ss >> id;
            cout << sm.infor(id) << endl;
        }
    }

    return 0;
}
