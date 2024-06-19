# COMP1110 Week 8 Lab

Before you start, you may wish to take a minute to watch the [intro video](https://comp.anu.edu.au/courses/comp1110/labs/mp4/lab8-intro.mp4) that runs through the goals of this lab.

This lab contains material from module [**J14**](https://comp.anu.edu.au/courses/comp1110/lectures/theme/#J14) (Collections) and [**C1**](https://comp.anu.edu.au/courses/comp1110/lectures/theme/#C1) (Recursion).

**Tasks**
1. [Crop Rotation](#1-recursion-sets-and-lists-crop-rotation)

**Additional Exercises**
1. [Group Assignment](#1-work-on-your-group-assignment)

## Before the Lab

* Complete Week 8 of your personal journal, commit and push at least 5 minutes prior to the start of your lab.

## Purpose

In this lab you will solve a simple search problem to find all the different orderings of planting crops, given some basic rules.

**Your tutor will mark your engagement during the lab.**

## Part I: Check-In

Check in with **your tutor** together with the other members of your group.    Briefly outline any issues you're having that you'd particularly like help with during the lab (make sure you have your journal open and refer to it when you meet with your tutor).

## Part II:  Your Lab Tasks

### 1. Recursion, Sets, and Lists: Crop Rotation

Complete the missing methods (marked `FIXME`) in the `CropRotation` class.   This question is based on a question from the 2020 S1 final exam.

To solve it, you need to use sets and lists, and you need to solve a search problem, like the [Boggle game](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-lectures/-/blob/main/src/comp1110/lectures/C03/Boggle.java) we solved in lectures in unit J14.

1. **Handle Simple Cases**

    It is a good strategy to identify and deal with simple cases first.   In
     this problem, notice that there are a number of circumstances where you
     should return an empty list.  You should address this simple case first.

    Add an `if` statement to `getAllRotations()` that checks for the cases where an empty list must be returned, and return the empty `rotations` list.

2. **Implement Switch**

    A search typically involves moving from one possibility to another (for example,
    moving from one die in the [Boggle game](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-lectures/-/blob/main/src/comp1110/lectures/C03/Boggle.java)
    to another).  Doing so involves at least two considerations:  a) ensuring that
    the possibility you're considering is not one you've already considered (if
    you don't do this, your search will never complete because you will continuously
    revisit cases you've already encountered), and b) ensuring that you only consider
    _legal_ cases.

    Ensuring that you don't consider the same case twice was addressed in the [Boggle game](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-lectures/-/blob/main/src/comp1110/lectures/C03/Boggle.java)
    by using a set of Integers called `visited`, and the code carefully
    kept track of which dice were already considered in the current search (you
    may want to inspect the `findWords()` method in the [Boggle game](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-lectures/-/blob/main/src/comp1110/lectures/C03/Boggle.java)
    to see how this was done).   In this problem you've been given a `List` of
    `Vegetables` called `used`, which you should use in a similar way, adding
    vegetables to the list when they're being considered, and checking whether
    they're already in the set before you try to use them.

    In the [Boggle game](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-lectures/-/blob/main/src/comp1110/lectures/C03/Boggle.java),
    checking for _legal_ cases was doing by using a set of neighbours, so that
    we knew for each die which were its legal neighbours.   In this case
    you need to implement `canFollow()`, which will allow your code to determine
    whether a particular crop is a legal follower of the current crop.

    Use a switch statement to complete the `canFollow()` method, returning the correct value according the the vegetable groups of the `first` and `next` vegetables.

3. **Complete the Search**

    You should notice that the `findWords()` method in the [Boggle game](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-lectures/-/blob/main/src/comp1110/lectures/C03/Boggle.java)
    is not terribly complex once the other parts are in place.   You now
    need to write the body of `getFixedRotation()`, which will be recursive,
    filling a similar role to `findWords()` method in the [Boggle game](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-lectures/-/blob/main/src/comp1110/lectures/C03/Boggle.java).

    Write the search by completing `getFixedRotation()`, and adding a `for` loop to `getAllRotations()` that calls `getFixedRotation()` for each of the vegetables in `crops`, adding the vegetable to `used` before calling, and removing it from `used` afterwards.

## Part III: Additional Exercises

We do not have any additional exercises this week. If you finish early, you may use this time to work on any other material from this course. Your tutor will be happy to answer any questions you may have.

### 1. Work on your group assignment

Use any spare time to work on your group assignment.
