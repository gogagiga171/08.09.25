#include <iostream>
#include <stack>

int main(){
    std::stack<int> s;
    s.push(1);
    s.push(2);
    std::cout<<s.top();
    s.pop();
    std::cout<<s.top();
}