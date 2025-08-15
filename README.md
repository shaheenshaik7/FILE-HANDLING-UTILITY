# FILE-HANDLING-UTILITY
*COMPANY*: CODTECH IT SOLUTIONS
*NAME*: SHAIK SHAHEEN
*INTERN ID*: CT04DY655
*DOMAIN*: JAVA PROGRAMMING
*DURATION*: 4 WEEKS
*MENTOR*: NEELA SANTOSH

##The FileHandling.java program is a java based utility it contains four fundamental file operations are creating,writing,reading and modifying the files.The program has been organized into separate static methods for each operation, making the code modular, reusable, and easier to maintain.This is used in real-world applications where text files are used to store configuration data, logs, or user-generated content.

First operation is file creation this method is used to implemented through the createFile() method.This method uses the java.io.File class to represent the createNewFile() method to create it in the file system.This method provide the user-friendly message to indicate the users the given file is created or already existed.If any input/output exceptions are occurred during the file creation the IOException is handled.

Second operation is writing to a file this method is used to implemented through the writingFile() method. This method uses the java.io.FileWriter class in overwrite mode to store text data into the file. If the file already contains text, the existing text is replaced with the new text.This is suitable for where only the latest information such as generating fresh reports or resetting configuration files.If any input/output exceptions are occurred during the writing to the file IOException is handled.

Third operation is reading from a file this method is used to implemented through the readFile() method.This method the uses java.io.BufferedReader combined with java.io.FileReader to read file content line by line. This is useful for large files where reading the entire content into memory at once would be inefficient. The method prints each line to the console making it suitable for debugging, log inspection or displaying stored information to the user.

Fourth operation is modifying an existing file this method is to implemented through the modifyFile() method. This method reads the file contents into memory, replaces all content of a specified text with a new text using the String.replace() method, and writes the modified content back to the file using FileWriter. This is useful for automated text replacement tasks, such as updating company names, changing configuration parameters, or performing batch corrections on stored data.If any input/output exceptions are occurred during the file modification the IOException is handled.

The main method is demonstrates these operations in sequence.This is starts with creating a file named Java.txt writes the string “Hello World” into it reads and displays the contents, modifies the “World” to “CodTech IT Solutions” and then reads the file again to display the updated content by calling the methods.This is a step-by-step demonstration process where the all operations are executes in a single cycle.

This program relies on standard Java I/O packages (java.io.*) making it highly portable and platform-independent. It can be compiled and run on any operating system with Java installed. The modular design means that individual methods could be reused or adapted in larger applications without modification.

The FileHandling.java is a demonstrates core Java file handling concepts with clear and  structured code. At the same time it has real-world utility for small-scale file management tasks, text automation and data processing scripts. It can be developed and run in Visual Studio Code.
