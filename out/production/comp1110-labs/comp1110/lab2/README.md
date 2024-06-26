# COMP1110 Week 2 Lab

Before you start, you may wish to take a minute to watch the [intro video](https://cs.anu.edu.au/courses/comp1110/labs/mp4/lab2-intro.mp4) that runs through the goals of this lab.

Each lab you will have some Tasks and Exercises. *Tasks* must be completed whilst *Additional Exercises* are extra practice related to this lab and/or the lecture content. Even if you don’t finish the lab, it is recommended that you make use of the additional exercises. All the tasks/exercises are done with your labs repo, and the Java tasks/exercises are done in IntelliJ.

This lab contains material from modules [**J4**](https://cs.anu.edu.au/courses/comp1110/lectures/theme/#J4) (Introductory Java 4), [**J6**](https://cs.anu.edu.au/courses/comp1110/lectures/theme/#J6) (Iteration) and [**O1**](https://cs.anu.edu.au/courses/comp1110/lectures/theme/#O1) (Classes and Objects).

**Tasks:**

0. [Gitlab: Fork Assignment 1](#0-gitlab-fork-assignment-1)
1. [Gitlab: Pull Upstream Commits](#1-gitlab-pull-upstream-commits)
2. [Imperative Coding](#2-imperative-coding)
3. [Classes and Objects](#3-classes-and-objects)

**Additional Exercises:**
1. [Imperative Coding - Triangle](#1-imperative-coding-triangle)
2. [Debugging](#2-debugging)
3. [Extension Exercises](#3-extension-exercises)

## Before the Lab

* Complete your [personal journal](../../../journal.md) for Week 2, commit it and push at least 5 minutes prior to the lab.
* Watch the [lab demo video](https://cs.anu.edu.au/courses/comp1110/labs/mp4/lab2-demo.mp4) for this lab. This is a short video introducing some key concepts in this lab.

## Purpose

In this lab you will learn a little more about GitLab before you write, test, and debug some small, *imperative* Java programs.

You may use either the VirtualBox, the ANU lab computers, or your own natively-installed version of IntelliJ and Java.

**Your tutor will mark your engagement during the lab.**

## Part I: Check-In

During the first 30 minutes you will check in with **your tutor**.   This is your chance to very briefly let your tutor know that you're at the lab, and to look at your journal entry together, and to note any issues you would particularly like to get help with during the lab.   You won't be getting help from your tutor in the first 30 minutes; rather, your tutor will be finding out what peoples' needs are, and they'll be making a plan for how best to help their students during the next 90 minutes.

Getting the lab organized can take time.   While you're waiting for things to happen, **introduce yourself to someone else in your lab now** - it'll help you later! Then watch the [lab intro video](https://cs.anu.edu.au/courses/comp1110/labs/mp4/lab2-intro.mp4) and start working on the lab tasks in Part II below.

## Part II: Your Lab Tasks

If you have a question or a problem during a lab, chances are someone else is having the same issue. If you get stuck, we encourage you to discuss with other people in your lab as well as your tutor.
There will also be a few chances to discuss concepts and compare solutions with others.

### 0. Gitlab: Fork Assignment 1
If you haven't already, fork the [Assignment 1](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass1) repository. If you've forgotten how to do this, you can follow the steps from [Lab 1](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-labs/-/tree/master/src/comp1110/lab1#set-up-gitlab). You should still follow the process for pulling upstream commits below to set up the upstream remote.

### 1. GitLab: Pull Upstream Commits

Remember that your labs and assignment repos are *forks*; your own version of the original repositories.
Once you've forked a repository, your fork is independent, and any changes made to the original repository will not be automatically applied to your fork.

Sometimes you may want to pull changes from the repo from which	you originally forked, and apply those changes to your repo.
For example, in this class, the master repo may be updated with corrections or improvements, which you need to merge into your forked repository.
In this lab exercise you will learn how to do that.

In Git, an [*upstream*](http://stackoverflow.com/questions/2739376/definition-of-downstream-and-upstream) repository is the repository from which a fork originally derived.
In your case, the *upstream* repo is the class version of the repo from which your repo was forked.
Git has [advanced mechanisms for pulling changes](https://git-scm.com/book/en/v2/Git-Basics-Working-with-Remotes) from an upstream repo; we'll explore one mechanism in this lab.

Before the start of this lab, we made some changes to the course version of the comp1110-labs repo.
Update your fork of the repo to include these changes using the following steps:

1. Open your comp1110-labs repo in IntelliJ.
2. If you have any uncommitted changes, commit them before starting the upstream pull (select **Git > Commit...**).
3. Select **Git > Manage Remotes...** and then click ![add button](../../../assets/icon-add.png) **Add** to add the comp1110 labs repo as a remote upstream repo (Name: `upstream` URL:`https://gitlab.cecs.anu.edu.au/comp1110/comp1110-labs.git`). 
   Click **OK**.
5. Select **Git > Pull...** which will bring up a dialog titled "Pull to master". 
6. There are two drop-down menus which allow you to select the remote repository (e.g. "origin") and the branch to pull from (e.g. "master"). 
   Change the remote to `upstream`.
7. You may not have an up-to-date list of the branches in the upstream repository.
   Update the list of branches by typing `Ctrl+F5`.
8. Select the `upstream/master` branch, and click **Pull**.
   Just like in Lab 1, Git should be able to merge the changes automatically.
   If not, you may need to merge, in which case you should consult your tutor if you're unsure what to do.
10. Bring up the **Git** tool window at the bottom of your IntelliJ workspace, and select **Log**, and notice that you now have new changes in your history.
11. Select **Git > Push...** to push the newly merged changes to your fork of the comp1110-labs repo on GitLab.

Go to the GitLab web page for your labs repo, and from the ![Repository sidebar button - file](../../../assets/icon-repository-sidebar.png) **Repository** sidebar menu, use the **Commits** and **Graph** menu options  to see how the changes you pulled have been integrated into your own repo.
 
Once you've merged upstream changes into your forked version of the repository on GitLab, you can merge those changes into any other clones of your forked repo (e.g. on your home computer) using a simple Git pull.

Once you have completed this task, close the associated issue (#10) with a
suitable comment.

Repeat the above exercise for the homework and assignment repos.
The steps are the same, but you need to change the repo name in steps 1 and 3 (using `comp1110-homework` instead of `comp1110-labs`).

Note: it is crucial that you **frequently pull from upstream** all the homework, labs and assignment repos.
We will try to alert you any time we make changes to these repos, but it would be frustrating to work according to tests or specifications which have changed!
A good habit is to pull from upstream each time you start working on one of these repos. 

### 2. Imperative Coding

The following programming tasks exercise simple *imperative* programming, demonstrating *sequence*, *selection*, and *repetition*.

1. **Countries**
    
    **A. Create a new class**
    
    Inside the package `comp1110.lab2` make a new class `Countries`. Add a main method to this class (Remember: use `psvm` or `main` as the completion shortcut to create the main method). 
    
    **B. Create an array**
    
    Inside your main method create an array of `String`s that has the names of the following countries: Germany, Argentina, Netherlands, Brazil.
   
    **C. Repetition: print elements of the array**

    Print out the all of elements of the array on separate lines (you do not need to use a loop at this stage, just manually choose the elements by their index).

    **D. Test your program**
    
    Test your program using the `L2 Countries` test. It should *fail* two of the four tests.   The error message should indicate that the test was *not* expecting the country "Argentina", and that the program produced extraneous output.

    If it fails any other tests you'll have to debug your code. The first
    thing to try is reading through the tests and analysing the
    response from the test e.g. 'Did not print Germany'. If you get
    stuck, have a look at the [debugging](#2-debugging) exercise coming up.
   
    If you are stuck, ask another student in your group! If all else fails, ask your tutor!

    **E. Selectively print elements of the array**

    If you didn't originally use a for loop in part C, modify your implementation to make use of one now.
    Now use *selection* by adding an `if` statement to the inside of your loop so that your program will only print out elements if they are not equal to "Argentina".

    **F. Test your program again**

    Test your program again using the `L2 Countries` test. It should now *pass* all tests.
   
    If it fails any tests you'll have to debug your code. As in the step above, the first
    thing to try is reading through the tests and analysing the
    response from the test. If you get
    stuck, have a look at the [debugging](#2-debugging) exercise coming up.

    If you are stuck, ask another student in your group! If all else fails, ask your tutor!
   
	**G. Discuss with someone else** 
   
    Identify the use of *sequence*, *selection*, and *iteration* in your implementations.

2. **Reverse**

    The [**J6** lecture resources](https://cs.anu.edu.au/courses/comp1110/lectures/theme/#J6) include [this example](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+ControlFlowWhile+%7B%0A%0A%09public+static+void+main(String%5B%5D+args)+%7B%0A%09%09int+i+%3D+0%3B++%0A%09%09while+(i+%3C+5)+%7B%0A%09%09%09System.out.println(%22while+i+is%3A+%22%2Bi)%3B%0A%09%09%09i%2B%2B%3B%0A%09%09%7D%0A%09%09i+%3D+0%3B%0A%09%09do+%7B%0A%09%09%09System.out.println(%22while+i+is%3A+%22%2Bi)%3B%0A%09%09%09i%2B%2B%3B%0A%09%09%7D+while+(i+%3C+5)%3B%0A%09%0A%09%7D%0A%0A%7D&mode=) that illustrates `while` loops using the Waterloo visualizer.

    **A. Create a new class**
    
    Make a new class `Reverse` within the `comp1110.lab2` package. Write your code within the main method of the class.
   
    **B. Iterate over sequence**

    Using a `while` loop, write a program that prints (on separate lines) the numbers between and including 10 and 30 in reverse order, i.e. the program should print on separate lines: 30 29 28 ... 10.
    
    **C. Test & debug your program**
    
    Test your program using the `L2 Reverse` test.

    **D. Discuss with someone else**
   
    If you changed the `while` to a	`do while` loop, how would the output change?
    (How many numbers would you expect to be printed?)
    Is this the same for both your code and theirs?
    Have you solved the	problem the same way?

### 3. Classes and Objects

Take a look at the short [lab 2 demo video](https://cs.anu.edu.au/courses/comp1110/labs/mp4/lab2-demo.mp4) which steps through an example similar to the one below.

1. **Coordinate**

    The [**O1** lecture resources](https://cs.anu.edu.au/courses/comp1110/lectures/theme/#O1) include [this example](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+Objects+%7B%0A%09public+static+class+Person+%7B%0A%09%09private+int+age%3B%0A%09%09private+String+name%3B%0A%0A%09%09public+Person(String+name,+int+age)+%7B%0A%09%09%09this.age+%3D+age%3B%0A%09%09%09this.name+%3D+name%3B%0A%09%09%7D%0A%0A++++++public+Person(String+name)+%7B%0A%09%09%09this.name+%3D+name%3B%0A%09%09%7D%0A++++++%0A++++++public+void+setAge(int+age)+%7B%0A+++++++++this.age+%3D+age%3B%0A++++++%7D%0A++++++%0A%09%09%40Override%0A%09%09public+String+toString()+%7B%0A%09%09%09return+name+%2B+%22,+aged+%22%2Bage%3B%0A%09%09%7D%0A%09%7D%0A%0A%09public+static+void+main(String%5B%5D+args)+%7B%0A%09%09Person+fred+%3D+new+Person(%22Fred%22,+21)%3B%0A%09%09Person+mary+%3D+new+Person(%22Mary%22)%3B%0A%09%09System.out.println(%22I+know+about+%22%2Bfred)%3B%0A%09%09System.out.println(%22I+know+about+%22%2Bmary)%3B%0A++++++mary.setAge(20)%3B%0A++++++System.out.println(%22I+know+about+%22%2Bmary)%3B%0A%09%7D%0A%09%09%0A%7D%0A%0A&mode=) that illustrates a simple class and object example using the Waterloo visualizer.
    
    **A. Create a new class**
    
    Inside the package `comp1110.lab2` make a new class `Coordinate`. This class will represent two
    dimensional integer coordinates.
    
    **B. Declare two instance fields, x and y**
    
    Inside your class, declare two private fields of type `int`, with names `x` and `y`.
   
    **C. Create a public constructor for your class**

    Create a constructor for the class that takes two `int` arguments, `x`, and `y`, and use those arguments to initilize the instance variables.  Remember that the constructor is like a method, but its name *must* be the same as the class (e.g. `Coordinate`), and since this is public, you need to use the `public` modifier.   Inside the constructor, initilize the two instance fields, `x`, and `y`.   Notice that, confusingly, you have two `x`s and two `y`s at this moment.  One `x` is the argument to the constructor, and the other is the instance field.   You can disambiguate the instance field by making it clear that it is a field of *this* instance, referring to it as `this.x`.  You can do the same for y.

    **D. Create a second public constructor for your class**

    Create a second constructor (yes, in Java, classes can have multiple constructors).  This one will be just like the one above, but it will take just one argument, `v`, and it will set both `x` and `y` to be equal to `v`.

    **E. Create getter and setter methods**

    Create public methods for setting and getting `x` and `y`, with names `setX`, `getX`, etc.   The setters should be of `void` type and take an `int` argument, while the getters should return an `int` and take no arguments.

    **F. Create a toString method**

    Create a public toString method that returns the string `(1, 3)` when `x` and `y` are 1 and 3, etc.

    **G. Test your program**
    
    Test your program using the `L2 Coordinate` test. 

    If it fails any tests you'll have to debug your code. If you get
    stuck, have a look at the [debugging](#2-debugging) exercise coming up.
   
    If you are stuck, ask another student in your group! If all else fails, ask your tutor!

	**H. Discuss with someone else** 
   
    What are the notable differences between the Coordinate example and the [Person](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+Objects+%7B%0A%09public+static+class+Person+%7B%0A%09%09private+int+age%3B%0A%09%09private+String+name%3B%0A%0A%09%09public+Person(String+name,+int+age)+%7B%0A%09%09%09this.age+%3D+age%3B%0A%09%09%09this.name+%3D+name%3B%0A%09%09%7D%0A%0A%09%09%40Override%0A%09%09public+String+toString()+%7B%0A%09%09%09return+name+%2B+%22,+aged+%22%2Bage%3B%0A%09%09%7D%0A%09%7D%0A%0A%09public+static+void+main(String%5B%5D+args)+%7B%0A%09%09Person+fred+%3D+new+Person(%22Fred%22,+21)%3B%0A%09%09Person+mary+%3D+new+Person(%22Mary%22,+20)%3B%0A%09%09System.out.println(%22I+know+about+%22%2Bfred)%3B%0A%09%09System.out.println(%22I+know+about+%22%2Bmary)%3B%0A%09%7D%0A%09%09%0A%7D%0A%0A&mode=) example from the [**O1** lecture resources](https://cs.anu.edu.au/courses/comp1110/lectures/theme/#O1)?

## Part III: Additional Exercises

These are additional exercises related to the lab and lecture content so far. They are not compulsory, but are great practice, and your tutor will be able to provide assistance and feedback during the lab. You are also welcome to discuss these (and any of the lab tasks) on Piazza! 

### 1. Imperative Coding - Triangle

**A. Create a class**

Create a class `Triangle` within the `comp1110.lab2` package that will draw simple triangles by printing ASCII characters to standard output. 
    Write your code within the main method of the class.
    
**B. Read integer from console**
    
The program should read in from the console an integer which represents the height (in characters) of the triangle.
    (You may want to remind yourself of how to read input from the console.
    This was covered in lecture unit [J01](https://cs.anu.edu.au/courses/comp1110/lectures/theme/#J1), in the example IOTest.java.)
    
**C. Draw the triangle**
    
Use the `*` character to draw the resulting triangle. 
    The first line should have one`*`, the second will have a `*` followed by one space, followed by a `*`, the third will have three spaces, the fourth will have five, etc.
    The last line will have (height x 2) - 1 `*`'s.
    For example, for an input of 5, the output should look like the illustration at the bottom of this section (here a "_" is drawn to represent a space character).

**D. Test & debug your program**
	
Test your program using the `L2 TriangleTest` test.
    
**E. Discuss with someone else**
   
Have a look at a friend's code-without testing it first.
Discuss: what will happen if you run the code with `-1` as the input?
    
```
____*
___*_*
__*___*
_*_____*
*********
```

4. **Commit and push your work**

    Commit your changes locally (select **Git > Commit...** or press `Ctrl+K`).
    Write a commit message that says: `Done with Lab 2!` and click **Commit**.

    Push your changes, which will allow your tutor to see them (**Git > Push...** or `Ctrl+Shift+K`).

    Close the associated issue (#11) with a suitable comment.


### 2. Debugging

Removing
[bugs](https://blog.patracompany.com/the-history-of-the-computer-bug)
(debugging) is a very important process in software development. While
we can take active measures to reduce the number of errors introduced
into code, no developer is perfect and the art of quickly identifying
and fixing bugs is worth perfecting.

In this exercise, you will explore some simple code samples that contain bugs.
In each sample a different debugging technique will be demonstrated.
In Lab 3, it will be your job to debug a more substantial piece of code, making use of the tools we describe below.
Each of the examples can be followed through by making a new class and making the changes and actions we describe in the procedures (you may need to make a main method using `psvm` and print the outputs of the functions with the described inputs).
The large code sample in the [Code Reduction](#code-reduction) section is provided as a class called `RunLengthDecoder`. 

#### Print Statements

A commonly-used method of debugging is to add print statements at important points in the program.

Consider the following code: 

```
public static int countEvens(int[] nums) {
  int count = 0;
  for (int i : nums){
    count += (i % 2 == 0 ? 0 : 1);
  }
  return count;
}
```

The countEvens function is given an array of `int`'s and is expected
to return an integer representing how many of the given values are
even. This function uses two important concepts, the modulus operator
(`%`) and the ternary operator. The modulus operator is of the form `a
% b` and returns the remainder result of the integer division
`a/b`. For example, `4 % 2 = 0` and `4 % 3 = 1`. The ternary operator
is a useful way of assigning the result of a boolean operator to a
variable. The ternary operator has the syntax 
`<boolean statement> ? <true output> : <false output> `. 
For example, the value of the variable `a` in the statement
`a = (0 == 1) ? 0 : 1` will be `1`. We note that in all cases, the
ternary operator is a shortening of the statement:
```
if (<boolean condition>) then {
	result = <true output>;
}
else{
	result = <false output>;
}
```
At first glance, the code appears reasonable (suspend your disbelief
if the error appears obvious), so we give it some sample inputs. 
The input `[0,1, ..., 9]` returns `5` which is the correct
output.
However the input `[0,1, ..., 10]` returns `5`, which is not quite right (we would expect `6`).
Let's use print statement debugging. 
We could modify the code to include a print statement as follows:

```
public static int countEvens(int[] nums) {
  int count = 0;
  for (int i : nums){
	boolean result = i % 2 == 0;
	System.out.println("Our program thinks that the number " + i + " is " + (result ? "Even" : "Odd"));
    count += result ? 0 : 1;
  }
  return count;
}
```
With the input `[0,1,...,10]` we get the output:
```
Our program thinks that the number 0 is Even
Our program thinks that the number 1 is Odd
Our program thinks that the number 2 is Even
Our program thinks that the number 3 is Odd
...
```
And the program output is still incorrect (`5`). Our program seems to
know if the numbers are odd or even, but doesn't count them
correctly. Let's find out which numbers result in an increase in our
count. We can modify the code to create:

```
public static int countEvens(int[] nums) {
    int count = 0;
    for (int i : nums){
        boolean result = i % 2 == 0;
        System.out.println("Our program thinks that the number " + i + " is " + (result ? "Even" : "Odd"));
        System.out.println("Our program is adding " + (result ? 0 : 1) + " to the count as a result.");
        count += result ? 0 : 1;
    }
    return count;
}
```
Which for the same input produces the output:
```
Our program thinks that the number 0 is Even
Our program is adding 0 to the count as a result.
Our program thinks that the number 1 is Odd
Our program is adding 1 to the count as a result.
Our program thinks that the number 2 is Even
Our program is adding 0 to the count as a result.
Our program thinks that the number 3 is Odd
Our program is adding 1 to the count as a result.
...
```
Aha! The program is adding the wrong number to the count. We have
narrowed the issue to the value of the ternary operator `result ? 0
: 1`. Can you see it now? According to our previous definition of the
ternary operator, we have the `0` and `1` swapped! Indeed, if we
change our original program to reflect this:

```
static public int countEvens(int[] nums) {
  int count = 0;
  for (int i : nums){
    count += (i % 2 == 0 ? 1 : 0);
  }
  return count;
}
```
it works as expected. While this example is simple, it shows that we
can narrow down the source of an error by giving extra feedback to the user
about how each component is working. 

#### Code Reduction
This debugging strategy is more subtle and is generally more useful in
larger programs. If we have a bug that cannot be isolated to a
particular area, particularly bugs which cause crashes, we have two
options to proceed. We could eliminate all but a solid, known to be
working section of code, and gradually re-introduce code sections
until the program/error re-occurs, or we can start from the full
program and gradually eliminate layers until the error
disappears. This is particularly useful for more hard-to-trace errors
such as those occurring remotely or in environments where error
feedback is poor (for example, in GUIs). 

Let's look at a larger program which decodes the result of Run Length
Encoding (RLE) on a binary sequence. RLE exploits the fact that in
binary sequences, there are often repeating sequences. If a binary
digit occurs once, it does not change, if it occurs more than once,
the number of repetitions is the next number. Some examples are
provided below:


|     Input    |   Output   |
|:------------:|:----------:|
| 010101       | 010101     |
| 000110100111 | 0312010213 |
| 00000001     | 071        |

A class is provided in `src/lab2/RunLengthDecoder` which attempts to expand this encoding.
As you can see, this program is non-trivial in complexity and combines
multiple functions, repetition and selection to achieve a task of some
difficulty. Currently, the output when ran for the sample input 
`0312010213` is `100000000000`!
Let's try using code reduction to debug this program.
In the `decode` function we notice this functional composition:
`return
intToString(concatenate(groupedIntegers(stringToInteger(sequence))));`.
This is the perfect basis for reduction. We begin by viewing the
output of `return stringToInteger("0312010213");` which is as we
expect; `0312010213`. We now add in `groupedIntegers` to our
composition (`groupedIntegers(stringToInteger("0312010213"))`)
and look at the output (noting that some playing
with formatting is required):
```
000
11
0
1
00
111
```
This seems fine so far. Continuing on we try the
`concatenate` function as well, the output of the composition is
`100000000000`. Aha! This is where the bug lies. Let's dig into the
concatenate function:
```
private static int[] concatenate(int[][] grouped_sequence){
        int total_length = 0;

        // Calculate the total length
        for (int outer_index = 0; outer_index < grouped_sequence.length; outer_index ++){
            total_length += grouped_sequence[outer_index].length;
        }

        // Proceed through the arrays depth first and place into output
        int[] output = new int[total_length];
        int output_index = 0;
        for (int outer_index = 0; outer_index < grouped_sequence.length; outer_index ++){
            for (int inner_index = 0; inner_index < grouped_sequence[outer_index].length; inner_index ++){
                output[output_index] = grouped_sequence[outer_index][inner_index];
            }
        }
        return output;
    }
```
We have narrowed down where the bug lies, now it's up to you! If you
can spot the bug just by reading the code, great, otherwise, make use of
print debugging or the debugger strategy below to debug this
function. Once you have debugged this function, write some sample
input and output values and make sure the code works as you expect. 


#### The _Debugger_ (Breakpoints and Step Through Debugging) 

IntelliJ has an incredibly powerful Java debugger built right in. It
is designed to be easy to use and intuitive, but it is a powerful tool
and it has many advanced features. To get started, have a look at this
[tutorial](https://www.jetbrains.com/help/idea/debugging-your-first-java-application.html).
You may find that the debugger is useful in completing the above
activity.

### 3. Extension Exercises 

Note: Extension exercises are **not** assessable- if you need to prepare for a lab exam or work on a group assignment, do that first.
Extension exercises are here to give you some extra (more challenging) problems to extend the lab work.


**Use the `break` keyword**

Create an array that contains {11,22,33,44,5,66,77,88,99,100} 

Using a loop containing the `break` keyword, write a program that will:

* print 5 and nothing else if the array contains the number 5.

* print the sum of the elements in the array and nothing else if the array doesn't contain the number 5.

When you run the code it should print `5`. Remove the 5 from the array-your program should now print `540`.

**Use the `continue` keyword**


Using the `continue` keyword, write a program to add all the numbers between 1 and 100 (inclusive) but skip multiples of 3 (3,6,9,12...)
So your code should calculate 1+2+4+5+7+8+10+11...+98+100.

Hint: If your code is working correctly, the sum should be `3367`.



