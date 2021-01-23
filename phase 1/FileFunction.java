package myfile;
import java.io.File;
import java.util.*;
import java.io.IOException; 
import java.io.FilenameFilter;

public class FileFunction 
{
	
	public static void main(String[] args) throws IOException
	{
	
	Scanner sc =new Scanner(System.in);
	while(true) 
	{
	System.out.println("File Menu: \n1.Create the File \n2.Delete the File \n3.Search the File ");
	int n=sc.nextInt();
	System.out.println("Already Existing Files in Ascending Order:");
	FileFunction.display();
	System.out.println("(Create/Delete/Search)Enter the Filename :");
    Scanner in8=new Scanner(System.in);
    String str=in8.nextLine();
     File file = new File(str+".txt");// 3 functions in one object
     switch(n){
	    case 1:
	    	try {
	    		if (file.createNewFile()) { 
	    				System.out.println(file.getName() + " is Created Sucessfully!"); 
	  						} 
	  						else {
	  							System.out.println("File already Created,try again another Filename");
	  						}
	  	
			} catch (IOException e) { 
				System.out.println(e.getMessage()); 
			} 
	        break;
	    case 2:
	        if(file.delete())                      //returns Boolean value  
		   {  
		   System.out.println(file.getName() + " Deleted Successfully");   //getting and printing the file name  
		   }  
		   else  
		   {  
		   System.out.println("OOPS!File is not there,try Another File");  
		   }  
		   
	        break;
 
	    case 3:
	       FileFunction.find(file.getName());
	        break;
	  
	    default:
	        System.out.println("INVAILD OPTION,Please Select the OPTIONS-->1 to 3");
	        break;
	}
	

		System.out.println("Go Again?(y/n)");
		Scanner in4 =new Scanner(System.in);
		String goAgain = in4.nextLine();
		if (!goAgain.equals("y")) 
		{
			break;
		}
		
	}
	
	}
		
 	public static void display() {
		try
		{
	      File f = new File("C:\\Users\\5033982\\Desktop\\enterprise_java\\Mypro");

          FilenameFilter filter = new FilenameFilter() {
              @Override
              public boolean accept(File f, String name) {
                  // We want to find only .txt files
                  return name.endsWith(".txt");
              }
          };

          // Note that this time we are using a File class as an array,
          // instead of String
          File[] files = f.listFiles(filter);

          // Get the names of the files by using the .getName() method
          for (int i = 0; i < files.length; i++) {
              System.out.println(files[i].getName());
              
              }
           } catch (Exception e) {
          System.err.println(e.getMessage());
      }
	}
	
 	public static void find(String name) {
 		 int count1=0;
 		try {
 			 
 			File f1 =new File("C:\\\\Users\\\\5033982\\\\Desktop\\\\enterprise_java\\\\Mypro");
 			 FilenameFilter filter = new FilenameFilter() {
 	              @Override
 	              public boolean accept(File f1, String name) {
 	                  // We want to find only .c files
 	                  return name.endsWith(".txt");
 	              }
 	          };

 	          // Note that this time we are using a File class as an array,
 	          // instead of String
 	          File[] files = f1.listFiles(filter);

 	          // Get the names of the files by using the .getName() method
 	          for (int i = 0; i < files.length; i++) {
 	             // System.out.println(files[i].getName());
 	             if(name.equalsIgnoreCase(files[i].getName())){
	        		  count1++;
	        		  System.out.println(name+" File Founded Successfully");
	        		  System.out.println("file folder is :\n"+files[i].getAbsolutePath());
	        	  }
	        	  } 
 	          if(count1==0) {
 	        	  System.out.println(name+"file Not Found"); 
 	          }
 	       
 	          }catch(Exception e) {
 					System.out.println(e.getMessage());
 		}
 	}
}
		
		 
		
		 
   



