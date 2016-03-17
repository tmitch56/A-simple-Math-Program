Moving in a Maze

This lab has the goal of teaching you how to:
Read input from the user and perform error checking.
Instantiate a Maze object and call its methods.
See your code control user interface.
Use control loops to manage movement in the Maze.
Description

This assignment features you, the student, as the star of the show. The goal of this program is to move yourself around the maze according to a precise set of rules. If you follow the rules, you will find the Java logo . Note: You must follow the exact path we specify to receive full credit on this program, finding the Java logo is not enough!
Instructions

In Recitation 5 you should have started on P4.java. If not, follow the directions here. Leave in the code you wrote that instantiates the Maze object and retrieves the dimensions. Remove any code from the recitation that moves the student around in the maze. Then add code to implement the algorithm shown below. This will require multiple control loops, which can be either while or for statements. Here is a complete specification of the Maze methods you can call:
// Constructor, parameter is name of maze file
public Maze(String fileName)

// Get height of maze, in rows
public int getHeight()

// Get width of maze, in columns
public int getWidth()

// Move commands, returns true if move successful, false is blocked
public boolean moveRight()
public boolean moveLeft()
public boolean moveUp()
public boolean moveDown()

// Returns true when the student finds the java logo, false otherwise
public boolean isDone()
Algorithm

The student always starts at the top left corner, that is row and column zero.
The Java logo can be anywhere in the maze, which also contains obstacles shown as "Wrong Way" signs.
You must traverse every row in the maze from top to bottom according to the rules below, until you find the Java logo.
Row and column numbers are zero based, so the first row and column is index 0. the second row and column is index 1, and so on. The number zero is even.
On even rows, you must move left to right using maze.moveRight(), on odd rows, you must move right to left using maze.moveLeft().
After completing each row, use maze.moveDown() to proceed to the next row, until you reach the last row or find the Java logo.
You can detect that you have encountered an obstacle by checking the return value from move methods in the Maze object, true means no obstacle, false means obstacle.
If you run into an obstacle when moving left to right:
Move down, right, right, and up.
Adjustment the loop counter for the extra move right!
If you run into an obstacle when moving right to left:
Move down, left, left, and up.
Adjustment the loop counter for the extra move left!
You must know where the column and row boundaries are without trying to move past them.
Every time you move left or right, not including when avoiding an obstacle, you must call maze.isDone() to see if you have found the Java logo.
When you find the Java logo, you must immediately break out of all loops, and exit the program.
There are mazes that cannot be solved using the algorithm, but we will not test your program with any of them.
