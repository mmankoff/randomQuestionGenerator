//Goals:
// 1) Add a list of 100 algorithm test quests.  -> COMPLETED.
// 2) Randomly Return a question within the list. -> COMPLETED.
// 3) Remove it from the list if it's been completed before
// 4) Save the result of each completed question in another file
// 5) Be able to retrieve it from the file to review.
// 6) Group questions based on:
//     1) Access Level Type -> Describes on which level the modifier or data structure is required
//     to access objects & methods needed to complete the search or reduction that's being passed to it.
//     2) By category of search type -> Insertion, Deletion, Search
//     3) Slowest
//     4) Fastest

    fun main(){

        val questionList: String =  listOf(
            "Print the first non-repeated character from a string.",
            "Reverse an array in place.",
            "Remove all duplicates from an array.",
            "Swap two numbers without using the third variable.",
            "Find all pairs of an integer array whose sum is equal to a given number.",
            "Remove the duplicate character from String.",
            "Find the maximum occurring character in given String.?",
            "Using quick sort algorithm, sort an integer array in it's place.",
            "Check if two strings are anagrams of each other.",
            "Find all the permutations of a string.",
            "Given string of \" String \" how can it be reversed using recursion.",
            "Check if a given string is a palindrome.",
            "Sort a linked list.",
            "Find all pairs of an integer array whose sum is equal to a given number.",
            "Remove the duplicate character from String.",
            "Find the maximum occurring character in given String.",
            "Using quick sort algorithm, sort an integer array in it's place.",
            "Check if two strings are anagrams of each other.",
            "Find all the permutations of a string.",
            "Given string of \" String \" how can it be reversed using recursion.",
            "Check if a given string is a palindrome.",
            "Find the length of the longest sub string without repeating characters.",
            "Given string str, How do you find the longest palindromic sub string in str.",
            "Check if a string contains only digits.",
            "Remove Nth Node from the end of a linked list.",
            "Merge two sorted linked list.",
            "Convert a sorted list to a binary search tree.",
            "Find duplicate characters in a given string.",
            "Count a number of vowels and consonants in a given string.",
            "Reverse words in a given sentence without using any library method.",
            "Check if two strings are a rotation of each other.",
            "Convert a byte array to String.",
            "Remove a given character from String.",
            "Find the middle element of a singly linked list in one pass.",
            "Check if a given linked list contains a cycle? How do you find the starting node of the cycle.",
            "Reverse a linked list.",
            "Check if two rectangles overlap with each other.",
            "Find the missing number in a given integer array of 1 to 100.",
            "Find duplicate numbers in an array if it contains multiple duplicates.",
            "Find the largest and smallest number in an unsorted integer array","Reverse a linked list in place.",
            "Add an element at the middle of the linked list.",
            "Reverse a singly linked list without recursion.",
            " Remove all duplicate nodes in a unsorted linked list.",
            "Find the length of a singly linked list.",
            "Find the third node from the end in a singly linked list.",
            "Find the sum of two linked lists using Stack.",
            "Remove all duplicates from a sorted linked list.",
            "Find the node at which the intersection of two singly linked lists begins.",
            "Given a linked list and a value x, partition it such that all nodes less than x come before.",
            "* nodes greater than or equal to x.",
            "Check if a given linked list is a palindrome.",
            "Remove all elements from a linked list of integers which matches with given value.",
            "Binary search tree implemented.",
            "Perform pre-order traversal in a given binary tree.",
            "Traverse a given binary tree in pre-order without recursion.",
            "Perform an in order traversal in a given binary tree.",
            "Print all nodes of a given binary tree using in order traversal without recursion.",
            "Implement a post order traversal algorithm.",
            "Traverse a binary tree in post order traversal without recursion.",
            "Print all leaves of a binary search tree.",
            "Count a s number of leaf nodes in a given binary tree.",
            "Perform a binary search in a given array.",
            "Swap two numbers without using the third variable.",
            "Implement an LRU Cache in your favorite programming language.",
            "Check if a given number is an Armstrong number.",
            "Find all prime factors of a given number.",
            "Check if a given number is positive or negative in Java.",
            "Find the largest prime factor of a given integral number.",
            "Print Floyd’s triangle.",
            "Print Pascal’s triangle.",
            "Calculate the square root of a given number.",
            "Add two numbers without using the plus operator in Java.",
            "Check if a given number is even/odd without using Arithmetic operator.",
            "Print a given Pyramid structure.",
            "Find the highest repeating world from a given file in Java.",
            "reverse a given Integer in Java.",
            "Convert a decimal number to binary in Java.",
            "Check if a given year is a leap year in Java.",
            "Implement a Binary search Algorithm without recursion.",
            "Difference between a stable and unstable sorting algorithm.",
            "What is the difference between Comparison and Non-Comparison Sorting Algorithms.",
            "Implement Sieve of Eratosthenes Algorithms for Prime Number.",
        ).random()

        println(questionList)
        println(questionList.length)

        }