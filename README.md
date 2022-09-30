# MilesPerGallonGUI

In Competency Exercises, you demonstrate your skill and ability to use the programming principles you've learned in the current and previous modules. You must complete this assignment by yourself, much like a module exam. You can ask instructors for clarification about the project -- you can not ask instructors or other students for help with logic or coding. If you are struggling with the project, you can look at previous assignments where you did similar work, and you can review the pertinent sections in the book.

 

Module 4 Competency Project: Miles Per Gallon GUI

You have previously written a project for a Miles Per Gallon calculator. Here, you will create a GUI to do that same work. The calculator needs 2 text fields, where the user will enter the miles and the gallons. It needs another text field for displaying the result – make this text field uneditable. It needs labels to identify which text field is for miles and which is for gallons. It needs a button to do the calculations, which should test if there is numeric data in the miles and gallons text fields. Add color for the content pane’s background, and a different color for the calculate button.

Here are examples of valid input:

M4 MPG GUI good1    M4 MPG GUI good2

If there are problems with the numbers in the text fields, throw an exception, which will write an error message in the text field for displaying the result. Here are examples of invalid input:

M4 MPG GUI bad1    M4 MPG GUI bad2

Note in the first example of valid input, where the answer is 35, the GUI displays 35.00. That requires the use of the DecimalFormat class. You learned about NumberFormat in the tip calculator project in Ch. 17. This DecimalFormat class works the same, except it doesn't add any symbols like a dollar sign. You must add an import statement to the project:

import java.text.DecimalFormat;

As with NumberFormat, this class needs to be instantiated in your project. With NumberFormat, the constructor used specified the currency format or percentage format. With the DecimalFormat class, the constructor has a parameter containing the pattern for how to format a number. For example:

DecimalFormat output = new DecimalFormat("##.###");
double result = 36.5429876;
String answer = "The answer is " + output.format(result);

As with NumberFormat, to use the DecimalFormat object, named "output" in this example, call its format method with the variable to be formatted as its parameter. Above, the DecimalFormat object is "output", with a pattern of "##.###". The variable containing the number to be formatted using that pattern is "result". To apply that pattern to the variable "result", write: output.format(result)

The variable "answer" contains "The answer is 36.543" -- only 3 decimal places because the pattern shows 3 "#" after the decimal point, with rounding occurring when the rest of the decimal places are removed.

If the pattern uses "#" after the decimal point, and the value to print has a zero there (called a trailing zero), that zero won't display. You could say the "#" refers to numbers that are not zero. To get the trailing zero to display, you specify that zero, like this:

DecimalFormat output = new DecimalFormat("##.00");

If the value to display is 27.0, this pattern would print 27.00.

Make sure you use DecimalFormat to format the result to show 2 decimal places always.

Take 2 screenshots showing normal execution with valid input, and 2 screenshots with invalid input that show exceptions.

 

Submission:the specified screenshots and the root folder for the project

 

Pay careful attention to the rubric for this assignment.

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.
