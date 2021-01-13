[Github Classroom Assignment URL](https://classroom.github.com/a/-TwiapST)

#### **Submission Questions are answered below  under Submission**

#### **Prework**

** Please complete [ICL: Week 1](https://seattleu.instructure.com/courses/1596305/assignments/6864506 "ICL: Week 1") before completing this homework assignment. **

Note: Though you may complete [ICL: Week 1](https://seattleu.instructure.com/courses/1596305/assignments/6864506 "ICL: Week 1") in groups, HW 1 must be completed individually.

#### **Requirements**

In HW 1, you will make one or more extensions to the `Greeter` module we developed in [ICL: Week 1](https://seattleu.instructure.com/courses/1596305/assignments/6864506 "ICL: Week 1"). For assignment submission, you will include [Zippy the Pinhead (Links to an external site.)](http://www.zippythepinhead.com/) quotes in the greeting by completing the following: 

1.  Start by creating your own project and copying in the source files from the class GitHub repository which includes sample solutions for versions 1-4 and the `yow.lines` file (see data folder). The file `yow.lines` contains Zippy quotes, one per line.

2.  Extend the template language so the variable `$zippy` will insert a random Zippy quote into the greeting.

3.  You have noticed that Zippy quotes make the greeting pretty long; extend the template language so the template variable `$newline` will insert a newline character into the greeting. Place a `$newline` before the Zippy quote is displayed.

4.  Demonstrate all newly implemented functionality in the driver.

5.  Documentation is not required for this homework; however, please review the [(Java) Documentation & Style Standards](https://seattleu.instructure.com/courses/1596305/pages/java-documentation-and-style-standards "(Java) Documentation & Style Standards") for subsequent assignments.

#### **Sample Output**

Good night Mcmastes - that's a nice blue shirt.
 Zippy quote: Did I SELL OUT yet??

#### **Extra Credit**

Extra Credit assignments will not be graded unless you receive at least an 85% on the regular assignment.

1.  The Zippy module can optionally emit the quotes in the order in which they appear in the file. You should make the greeter generator configurable so it will can generate either random or sequential Zippy quotes. Come up with some way that the driver program can communicate to the greeter generator whether it wants random or sequential Zippy quotes.

2.  Our implementation of the template language has problems with certain edge cases.
    -   For example,
        -   `"Hello $name."` doesn't work because of the period at the end of the template variable.
        -   `"I owe you $1.25"` will act as though the dollar amount is a variable.
    -   Both edge case examples above will throw an exception.
    -   Define the template language precisely as it relates to how variables are handled, and fix the code in `Template.java` accordingly. 
3.  In class we hardcoded the person's name into a variable `$name` that was passed to the greeter generator. Extend this functionality as follows:
    -   If the greeter is asked to instantiate a name and the name appears in its input dictionary, it uses that name. Otherwise, it finds the user's (system) username, and uses that instead, capitalizing the first letter in the username. Hint: you may want to use `System.getProperty("user.name");`.
    -   For example,
        -   My username is "mcmastes" so a greeting of `"Hello $name"` on my system without supplying a name explicitly should be "Hello Mcmastes".
        -   If the input hash does not contain a name and the system cannot provide a username, the variable should be instantiated as "Unnamed Person".

#### **Sample Output (for EC #3)**

Good night Mcmastes - that's a nice green shirt.
 Zippy quote: Am I in GRADUATE SCHOOL yet?

Notes:

-   Demonstrate all implemented extra credit functionality in the driver.
-   You may receive at most 5 extra credit points. 

#### **Submission**

-   Push to your assignment repository in Github Classroom.
-   Include a README.md file with informal comments answering the following questions:
    -   Is your solution fully working or not? How does your driver program demonstrate this?
    
    The homework week 1 solution can be found in v4. When you run the Driver, the solution is fully working. The driver demonstrates this by printing the string template and associating the HashMap to the correct string output. I print a random zippy quote; I chose not to create an array and just print a random quote. 
    
    -   What extra credit problem(s) did you work on (#1, 2, 3, all)? Briefly describe how do you demonstrate the functionality?
    
    I attempted all of the extra credit. I ...
    
    -   How much time did you spend on the assignment?
    
    I spent around 4 hours on the homework and extra credit. The extra credit was challenging.
    
    -   Any feedback on the assignment?
    
    Nothing comes to mind. 
