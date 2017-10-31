# COMP 271 002 F17 Lab 5 (Week 7)



    1. What is the purpose of the various auxiliary methods populateList, populateFifoList, and ReverseLines.printReverse?
    - To  not have to iterate through a loop, you actually can print out recursivly instead and change the stack if a method needs something to be changed.
    2. Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?
    - So that they can keep calling on themslves until they get to a base case. It goes node to node (that's where the arugment is changed).

    3. What are the time and space complexity of each of the populateList populateFifoList methods, as well as ReverseLines.printReverse?
    - All of the above are O(n).

    4. Which of these methods can be implemented using while loops?
    - All of the above. 
