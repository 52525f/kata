# Kata - TDD kata practice

## Checking Groups 

From: https://www.codewars.com/kata/54b80308488cb6cd31000161/train/java?collection=train

In English and programming, groups can be made using symbols such as "()" and "{}" that change meaning. However, these groups must be closed in the correct order to maintain correct syntax. 

Your job in this kata will be to make a program that checks a string for correct grouping. For instance, the following groups are done correctly:

```
({})
[[]()]
[{()}]
```
The next are done incorrectly

```
{(})
([]
[])
```
A correct string cannot close groups in the wrong order, open a group but fail to close it, or close a group before it is opened.

Your function will take an input string that may contain any of the symbols "()" "{}" or "[]" to create groups.

It should return True if the string is empty or otherwise grouped correctly, or False if it is grouped incorrectly.

## Word Ladder

From: https://leetcode.com/problems/word-ladder/

Given two words (*beginWord* and *endWord*), and a dictionary's word list, find the length of shortest transformation sequence from *beginWord* to *endWord*, such that:

1. Only one letter can be changed at a time
2. Each intermediate word must exist in the word list

For example,

Given:   
*beginWord* = `"hit"`   
*endWord* = `"cog"`  
*wordList* = `["hot","dot","dog","lot","log"]`  

As one shortest transformation is `"hit" -> "hot" -> "dot" -> "dog" -> "cog"`,
return its length `5`.

**Note:**

* Return 0 if there is no such transformation sequence.
* All words have the same length.
* All words contain only lowercase alphabetic characters.
