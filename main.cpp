//
//  main.cpp
//  practice
//
//  Created by Jeannie An on 8/17/16.
//  Copyright © 2016 Heejin An. All rights reserved.
//

#include <iostream>

using namespace std;

char word[] = "baaa";
char* frontPtr;
char* endPtr;
string s;

bool palindrome = false;

bool check(char charArray[]) {
    frontPtr = &charArray[0];
    int length = strlen(frontPtr);
    endPtr = &charArray[length-1];
        for(int i = 0; i < (length/2); i++) {
            if(*frontPtr == *endPtr) {
                palindrome = true;
                cout << palindrome << endl;
            } else if(*frontPtr != *endPtr) {
                palindrome = false;
                return palindrome;
            }
            endPtr--;
            frontPtr++;
        }
    
    cout <<"palindrome : "<< palindrome << endl;
    return palindrome;
}


string makePalindrome(char charArray[]) {
    s = charArray;
    frontPtr = &charArray[0];
    endPtr = &charArray[strlen(frontPtr)-1];
    
    if(!check(charArray)) {
        for(int i = 1; i < strlen(frontPtr); i++) {
            if (palindrome) {
                return s;
            }
            s = *(endPtr) + s;
            endPtr--;
        }
    }
    
    return s;
}


int main(int argc, const char * argv[]) {
    // insert code here...
    
    makePalindrome(word);
    cout << s << endl;
    return 0;
}
