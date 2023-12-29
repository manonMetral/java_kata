# Roman Numerals
## About this Kata
I wasn’t there, but I believe this Kata was performed at XP2001 by Kent Beck. Here is [a video of Karl Scotland doing this Kata in Excel at agile 2008] Here is [a video of JonJagger doing this Kata in Ruby using CyberDojo]

## Problem Description
The Romans were a clever bunch. They conquered most of Europe and ruled it for hundreds of years. They invented concrete and straight roads and even bikinis [1]. One thing they never discovered though was the number zero. This made writing and dating extensive histories of their exploits slightly more challenging, but the system of numbers they came up with is still in use today. For example the BBC uses Roman numerals to date their programmes.

The Romans wrote numbers using letters : I, V, X, L, C, D, M. (notice these letters have lots of straight lines and are hence easy to hack into stone tablets)

### Part I
The Kata says you should write a function to convert from normal numbers to Roman Numerals: eg

     1 --> I
     10 --> X
     7 --> VII
etc.

For a full description of how it works, take a look at [this useful reference website] : which includes an implementation of the Kata in javascript.

There is no need to be able to convert numbers larger than about 3000. (The Romans themselves didn’t tend to go any higher)

### Part II
Write a function to convert in the other direction, ie numeral to digit

### Clues
Can you make the code really beautiful and highly readable?
does it help to break out lots of small named functions from the main function, or is it better to keep it all in one function?
if you don’t know an algorithm to do this already, can you derive one using strict TDD?
does the order you take the tests in affect the final design of your algorithm?
Would it be better to work out an algorithm first before starting with TDD?
if you do know an algorithm already, can you implement it using strict TDD?
Can you think of another algorithm?
what are the best data structures for storing all the numeral letters? (I, V, D, M etc)
can you define the test cases in a csv file and use FIT, or generate test cases in xUnit?
what is the best way to verify your tests are correct?

## Dependencies
This project is a java 21 project with 3 libraries:
* junit jupiter
* assertj
* maven-surefire-plugin

## Constraints to execute this kata
Principle of a kata is to be repeated to increase our skills in development, but just repeat the same exercise without objective can be lazy, so I propose you to have little objectives each time you repeat this kata. These objectives are so generic, so they can be operated for others kata.

This kata has been created to improve our competence to do TDD, so that's the first constraint is that you have to use TDD each time you do it.

Second constraint will be to optimize code by doing :

a maximum variable
having the least repeated code at the end.
optimized iterations (as if-else)
Third constraint should be to minimize the time to code :

less than an hour first
less than 30 min second
less than 15 min third
... and so on if you can
Fourth constraints should be to do it in another language after well understanding.