// P4 Assignment
// Author: Tori Mitchell
// Date: Jun 30, 2015
// Class:  CS160
// Email: tmitch56@rams.colostate.edu  

public class P4 {
	public static void main(String[] args) {
		// Create maze
		String fileName = args[0];
		Maze maze = new Maze(fileName);
		System.out.println("Maze name: " + fileName);

		// Get dimensions
		int mazeWidth = maze.getWidth();
		int mazeHeight = maze.getHeight();
		System.out.println("Maze width: " + mazeWidth);
		System.out.println("Maze height: " + mazeHeight);


		int rowNumber = 0;
		int columnNumber = 0;

		System.out.println(maze.isDone());


		while (!maze.isDone() && (rowNumber < mazeHeight)) { // controlling statement = while maze is not done
			
			if (rowNumber % 2 == 0){
				columnNumber = columnNumber + 1;
				if(!maze.moveRight()) {// can't move right
					maze.moveDown();
					maze.moveRight();
					maze.moveRight();
					maze.moveUp();
					columnNumber = columnNumber + 1;
				}
				if ((columnNumber == mazeWidth - 1) && (!maze.isDone())) {
					maze.moveDown();
					rowNumber = rowNumber + 1;

				}
			}
			else { // controlling statement = in an odd row and maze is not done.
				columnNumber = columnNumber - 1; 
				if(!maze.moveLeft()) {// can't move left
					maze.moveDown();
					maze.moveLeft();
					maze.moveLeft();
					maze.moveUp();
					columnNumber = columnNumber - 1;
				}

				if ((columnNumber == 0) && (!maze.isDone())) {
					maze.moveDown();
					rowNumber = rowNumber + 1;

				}





			}
			System.out.println(columnNumber);
		}
















	}
}
