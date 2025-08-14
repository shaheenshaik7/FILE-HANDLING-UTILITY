/*
 * FileHandling.java
 * 
 *  file operations in Java:
 *  - create file
 *  - write (overwrite) file
 *  - read file
 *  - modify file
 *
 * Compile: javac FileHandling.java
 * Run:     java FileHandling
 *
 */
// Package declaration
package FileHandling;
// Importing required Java classes
// Reading text from a file
import java.io.BufferedReader; 
// Creating and managing file objects
import java.io.File;   
// Reading file content        
import java.io.FileReader;
// Handling input/output exceptions
import java.io.IOException;
// Writing content to a file
import java.io.FileWriter;

	public class FileHandling{  
		//---------------- File Operations-------------------------------
		//---------------------Creating a file---------------------------
		//Create a new text file 
		public static void createFile(String filename)throws IOException {
	        try{
	        	// Create a File for the given filename
	             File file = new File(filename);
	             // To create the file
	            if (file.createNewFile()) {
	            	// File created successfully
	                System.out.println(file.getName()+ " is created.");
	            } else {// File already exists
	                System.out.println(file.getName()+ " is already exists.");
	            }
	        }// Handle any errors during file creation
	        catch(IOException e){
	            System.out.println("Error is occurred during the file reading.");

	        }
	    }
		//------------------Writing a file-------------------------------------
		// Write text to a file 
		public static void writeFile(String filename, String content) throws IOException{
			// overwrite mode
	        try (FileWriter writer = new FileWriter(filename)) { 
	        	// Write the provided content to the file
	            writer.write(content); 
	         // Confirmation message
	            System.out.println(filename + " is written successfully.");
	         // Handle errors during file writing
	        } catch (IOException e) {
	            System.out.println("Error is occurred during the file writing.");
	           
	        }
	    }
		//---------------------Reading a file-------------------------------------
		 // Read and displays the text in the file
		 public static void readFile(String fileName) throws IOException {
			//Open file for reading
		        BufferedReader reader = new BufferedReader(new FileReader(fileName));
				//Variable to hold each line read
		        String line;
                 //Printing the reading file content
		        System.out.println("Reading file content:");
		     // Read file line by line until end
		        while ((line = reader.readLine()) != null) {
		        	// Print each line to console
		            System.out.println(line);
		        }
		      
		    }
			//------------Modifing a file--------------------------------------------
		// modify the oldtext with new text
		public static void modifyFile(String filename, String oldtext, String newtext) throws IOException {
			// Open file for reading
			BufferedReader reader=new BufferedReader(new FileReader(filename));
			 // StringBuilder to store modified content
			StringBuilder b= new StringBuilder();
			// Variable to hold each line read
			String line;
			 // Read file line by line
			while((line = reader.readLine())!=null){
			// Replace oldtext with newtext and append
			b.append(line.replace(oldtext,newtext)).append("\n");
			}
			try(FileWriter writer=new FileWriter(filename)){ // Open file in overwrite mode
				writer.write(b.toString()); // Write modified content back to file
			//Printing and modify the old  with newtext
			System.out.println("The " + filename + " is modified  " + oldtext +  " with " + newtext + "");
			}// Handle errors during modification
			catch(IOException e) {
				System.out.println("Error is occurred during the file modification");
			}
		}
		 // ----------------------------- Demonstration of main function ---------------------
		// Main method
	    public static void main(String[] args) throws IOException {
	    	// Name of the file to be used
	    	String filename="Java.txt";
	    	// Create the file if it doesn't exist
	        createFile(filename);
	       // Write initial content
	        writeFile(filename," Hello World");
	        // read the text and display
	        readFile(filename);
	     // Modify specific text in the file
	        modifyFile(filename,"World"," CodTech IT Solutions");
	     // read the text and display 
	        readFile(filename);
	    }
	


}
