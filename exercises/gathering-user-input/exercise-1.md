# Exercise One

Create a method that uses a Scanner to parse any input from the console (System.in) and prints out the number of vowels in the line.

**Note**: When you create a scanner that reads from System.in, it relies on the fact that this input stream is by default open. If you close your Scanner that reads from System.in, then the System.in input stream will be closed for the rest of the program. This will cause you trouble if you go to create a new Scanner that uses System.in within the same program.

A simple work around is to create a single Scanner object as a static field. Then use the same scanner in all of your methods. Finally, close this Scanner object at the end of the main method. Just before your program finishes. (This will be needed if you try to have both Exercise One and Two in the same class.) 