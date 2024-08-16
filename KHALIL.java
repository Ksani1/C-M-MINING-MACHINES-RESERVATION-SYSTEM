import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.CREATE;
import java.util.Scanner;
import java.util.StringTokenizer;

public class KHALIL {
    public static void main(String[] args) throws Exception {

        KHALIL project = new KHALIL(); // Create new MainProj Object.
	Path file = Paths.get("B:\\2308-1903-0010\\IT209_2308-1903-0010\\KHALIL.txt");

        String s = "";
  
        project.loginPage();
        if(!Files.exists(file)){
        	project.createEmptyFile(file, s);
            project.menu();
        }
        else
        project.menu();
	}
	public  void createEmptyFile(Path file, String s)
  {    final int NUMRECS = 1000;
	try
    {
		OutputStream outputStr = new BufferedOutputStream(Files.newOutputStream(file,CREATE));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStr));

		for(int count = 0; count < NUMRECS; ++count)
				writer.write(s, 0, s.length());
		writer.close();
    }
    catch(Exception e)
    {
         System.out.println("Error message: " + e);
    }

    }
    
    	public void loginPage()throws Exception{

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String username;
		String password; 


		do {System.out.print("\nUsername: ");
                    username = input.readLine();

                    System.out.print("\nPassword: ");
                    password = input.readLine();

        if (!(password.equalsIgnoreCase("KHALIL") && username.equalsIgnoreCase("MUHAMMAD"))){
              System.out.print("\nInvalid Entry, Try Again\n");
        	
             System.out.println();
           }
         

         } while(!(password.equalsIgnoreCase("KHALIL") && username.equalsIgnoreCase("MUHAMMAD")));

         System.out.println("\nLogged In Successfully.\n");
         System.out.println();
         System.out.println();
             


	}
        
	public void menu()throws Exception  // declaring a menu method
	{
            
                  BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		             int choice;
		
	 do {
					System.out.println("\t\t**************************************************#");
					System.out.println("\t\t\t	 C&M MINING MACHINES RESERVATION SYSTEM ");
					System.out.println("\t\t**********************************************************************");
					System.out.println("\n");
					System.out.println("\n\t\t 1. To Add Customer Records");
					System.out.println("\n\t\t 2. To View Customer Records");
					System.out.println("\n\t\t 3. To Search Customer Records");
					System.out.println("\n\t\t 4. To Update Customer Records");
					System.out.println("\n\t\t 5. To Delete Customer Records");
					System.out.println("\n\t\t 6. To Calculate Customer Items");
					System.out.println("\n\t\t 7. To Exit the Program");
					System.out.print("\n\n\t\t Enter Your Choice [1-7]: ");
						choice=Integer.parseInt(input.readLine());

	   switch(choice)
		    {
				case 1:AddRecord();
				break;
				case 2:ViewAllRecord();
				break;
				case 3:SearchRecordbyID();
                break;
				case 4:updateRecordbyID();
				break;
				case 5:DeleteRecordByID();
				break;
				case 6:calculateCUSTOMERPrice();
				break;
				case 7:Exit();
				break;
				default :System.out.print("\n Invalid Choice ");
			}
		}while(choice ==1);
	}
        
     public void AddRecord() throws IOException {
    		
    		BufferedWriter fs = new BufferedWriter( new FileWriter("B:\\2308-1903-0010\\IT209_2308-1903-0010\\CUSTOMER.txt",true) );
    		Scanner strInput = new Scanner(System.in);
    		String fstech;
    		String ID, name, avail, quant, prize;
    		final String QUIT = "BACK";
                
		
                System.out.println("\n\t\t--------------------------------------");
                System.out.println("\t\t\t ADDING  CUSTOMER RECORD");
                System.out.println("\t\t--------------------------------------");
                
                
    		System.out.print("\nEnter the Customer ID: ");
    		ID = strInput.nextLine();
         while(!(ID.equals(QUIT)||!ID.matches("[0-9]+")))
            {
    		System.out.print("\nEnter the Customer Name: ");
    		name = strInput.nextLine();
                  if (!name.matches("[a-z]+")) {
                      System.out.println("Customer Name is Wrong!\n");
                  }                   
                 else {
    		System.out.print("\nEnter the Item Name: ");
    		avail = strInput.nextLine();
                  if (!avail.matches("[a-z]+")) {
                      System.out.println("Item Name is Wrong!\n");
                  }                   
                 else {
    		System.out.print("\nEnter the Item Quantity: ");
    		quant = strInput.nextLine();
                  if (!quant.matches("[0-9]+")) {
                      System.out.println("Item Quantity is Wrong!\n");
                  }                   
                 else {
    		System.out.print("\nEnter the Item Price: ");
    		prize = strInput.nextLine();
                  if (!prize.matches("[0-9]+")) {
                      System.out.println("Item Price is Wrong!\n");
                  }                   
                 else {
                  	
    		fs.write(ID+","+name+","+avail+","+quant+","+prize);
    		fs.flush();
    		fs.newLine();
    			
                  }
                    }
                        }
                           }
                System.out.print("\nEnter Next Customer ID or " + QUIT + " to Quit >> \n");
                fstech = strInput.nextLine();
                ID = fstech.toUpperCase();
            }

          fs.close();
    }
     
     public void ViewAllRecord() throws IOException {
    	BufferedReader fs = new BufferedReader( new FileReader("B:\\2308-1903-0010\\IT209_2308-1903-0010\\CUSTOMER.txt") );
    		
    	String record;
        int total = 0;
        
        System.out.println("\n\t\t------------------------------------");
        System.out.println("\t\t\t DISPLAYING CUSTOMER RECORDS");
        System.out.println("\t\t--------------------------------------");
        
    	System.out.println(" **********************************************************************---------------------");
    	System.out.println("| \t ID \t Name \t\t Item Name \t\t Item Quantity \t Item Price              ");
    	System.out.println(" **********************************************************************---------------------");
    		
    	while( ( record = fs.readLine() ) != null ) {
    			
    		StringTokenizer st = new StringTokenizer(record,",");
    			
    		System.out.println("| \t "+st.nextToken()+" \t "+st.nextToken()+"\t\t "+st.nextToken()+" \t\t\t "+st.nextToken()+" \t\t "+st.nextToken()+"\t");
                total += 1;
    	}
    		
    	System.out.println("|\t\t\t\t\t\t\t\t\t\t");
    	System.out.println(" **********************************************************************---------------------");
    	System.out.println("Total number of Item(s) is " + total);
        fs.close();    		
    		
    }
     
     
     public void SearchRecordbyID() throws IOException {
    		String ID,record;
    		Scanner strInput = new Scanner(System.in);
    		
    		BufferedReader fs = new BufferedReader( new FileReader("B:\\2308-1903-0010\\IT209_2308-1903-0010\\CUSTOMER.txt") );
    		
    			System.out.println("\n\t\t--------------------------------------");
                System.out.println("\t\t\t SEARCHING CUSTOMER RECORDS");
                System.out.println("\t\t---------------------------------------");

    	
    		
    		System.out.println("Enter the CUSTOMER ID: ");
    		ID = strInput.nextLine();
    		
                System.out.println(" **********************************************************************------------");
                System.out.println("| \t ID \t Name    \t Item Name \t Item Quantity     Item Price ");
                System.out.println(" **********************************************************************------------");
    		
    		while( ( record = fs.readLine() ) != null ) {
    			
    			StringTokenizer st = new StringTokenizer(record,",");
    			if( record.contains(ID) ) {
                                System.out.println("| \t "+st.nextToken()+" \t "+st.nextToken()+"\t "+st.nextToken()+" \t\t "+st.nextToken()+"\t\t "+st.nextToken()+"\t");

                        }
    			
    		}
    		
                System.out.println("|\t\t\t\t\t\t\t\t\t\t|");
                System.out.println(" **********************************************************************-------------");
    		
    		fs.close();	
    		
    }
     
     public void updateRecordbyID() throws IOException {
    		String newName, newAvail, newQuant, newPrize, record, ID,record2;
    		
    		File db = new File("B:\\2308-1903-0010\\IT209_2308-1903-0010\\CUSTOMER.txt");
    		File tempDB = new File("B:\\2308-1903-0010\\IT209_2308-1903-0010\\CUSTOMER_new_temp.txt");
    		
    		BufferedReader br = new BufferedReader( new FileReader(db) );
    		BufferedWriter fs = new BufferedWriter( new FileWriter(tempDB) );
    		    		
    		Scanner strInput = new Scanner(System.in);
    		
    			System.out.println("\n\t\t---------------------------------------");
                System.out.println("\t\t\t UPDATING CUSTOMER RECORD");
                System.out.println("\t\t---------------------------------------");   
		/****/		
			System.out.println("Enter the CUSTOMER ID: ");
	    		ID = strInput.nextLine();	    		
                        System.out.println("**********************************************************************--------------------");
                        System.out.println("| \t ID \t Name \t\t Item Name \t\t Item Quantity \t Item Price ");
                        System.out.println("**********************************************************************--------------------");
	    		
	    		while( ( record = br.readLine() ) != null ) {
	    			
	    			StringTokenizer st = new StringTokenizer(record,",");
	    			if( record.contains(ID) ) {
                                System.out.println("| \t "+st.nextToken()+" \t "+st.nextToken()+"\t\t "+st.nextToken()+" \t\t "+st.nextToken()+" \t\t "+st.nextToken()+"\t");
	    			}
	    			
	    		}	    		
                        System.out.println("|\t\t\t\t\t\t\t\t\t\t|");
                        System.out.println(" **********************************************************************-------------------");
	    		
	    	br.close();
		/****/    	   
    		System.out.println("\nEnter New Customer Name: ");
    		newName = strInput.nextLine();    		
                  if (!newName.matches("[a-z]+")) {
                      System.out.println("New Customer Name is Wrong!\n");
                  }                   
                 else {
    		System.out.println("\nEnter New Item Name: ");
    		newAvail = strInput.nextLine();  
			if (!newAvail.matches("[a-z]+")) {
                      System.out.println("New Item Name is Wrong!\n");
                  }                   
                 else {
    		System.out.println("\nEnter New Item Quantity: ");
    		newQuant = strInput.nextLine();  
			 if (!newQuant.matches("[0-9]+")) {
                      System.out.println("New Item Quantity is Wrong!\n");
                  }                   
                 else {
    		System.out.println("\nEnter New Item Price: ");
    		newPrize = strInput.nextLine(); 
			 if (!newPrize.matches("[0-9]+")) {
                      System.out.println("New Item Price is Wrong!\n");
                  }                   
                 else {
                
    		BufferedReader br2 = new BufferedReader( new FileReader(db) );
    			
    		while( (record2 = br2.readLine() ) != null ) {    			
    			if(record2.contains(ID)) {
    				fs.write(ID+","+newName+","+newAvail+","+newQuant+","+newPrize);
    			} else {
    			
    				fs.write(record2);	
    			}    			
    			fs.flush();
    			fs.newLine();
    		}
				
    		
    		fs.close();
    		br2.close();    		
    		db.delete();    		
    		boolean success = tempDB.renameTo(db);    		
   		System.out.println(success);    		
    		
    }
      }
				 }
				 }
				 }
     public void DeleteRecordByID() throws IOException {
    		Scanner strInput =  new Scanner(System.in);
    		String ID, record;
    		
    		
    		File tempDB = new File("B:\\2308-1903-0010\\IT209_2308-1903-0010\\CUSTOMER_new_temp.txt");
    		File db = new File("B:\\2308-1903-0010\\IT209_2308-1903-0010\\CUSTOMER.txt");
    		
    		
    		BufferedReader br = new BufferedReader( new FileReader( db ) );
    		BufferedWriter fs = new BufferedWriter( new FileWriter( tempDB ) );
    		
    		
    			System.out.println("\n\t\t-------------------------------------");
                System.out.println("\t\t\t DELETING CUSTOMER RECORD");
                System.out.println("\t\t-------------------------------------");
    		
    		System.out.println("Enter the Customer ID: ");
    		ID =  strInput.nextLine();
			
			
    		while( ( record = br.readLine() ) != null ) {
    			
    			
    			if( record.contains(ID) ) 
    				continue;
   
    			fs.write(record);
    			fs.flush();
    			fs.newLine();
 
    		}
    		
    		br.close();
    		fs.close();
    		
    		db.delete();
    		
    		tempDB.renameTo(db);
                
                System.out.print("Record removed successfully!!");
    }
	 
	
	
	public void calculateCUSTOMERPrice()throws Exception {     // declaring a method to perform calculation

			BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
			double quantity;

				System.out.println();
				System.out.println("\n\t\t\t----------------------------------------");
                System.out.println("\t\t\t\t CALCULATE CUSTOMER ITEM");
                System.out.println("\t\t\t----------------------------------------");
				System.out.println();
				System.out.print("\nEnter the Item Price: ");  
					double price=Double.parseDouble(input.readLine());			  
				System.out.print("\nEnter the Amount Of Items: ");
					 quantity=Double.parseDouble(input.readLine());
					double total = price * quantity;
				System.out.println("\nThe Total Price is: $"+ total);
}

	
	
	
	
     
     	    public void Exit()throws Exception {     // declaring a method to perform calculation

                                System.out.println("\n\t\t\t\t\t----------------------------------");
                                System.out.println("\t\t\t\t\t\tCLOSING THE PROGRAM");
                                System.out.println("\t\t\t\t\t----------------------------------");
				System.out.println("\t\t\t\t\tTHANK YOU FOR PATRONIZING US!!!\n");
				System.out.print("\t\t\t\tDesigned By:KHALIL MUHAMMAD SANI\n");
				System.out.print("\t\t\t\tWith ID NO: 2308 - 1903 - 0010\n");
				System.out.println("\t\t\t\tSupervised By: MR NAZIFI MUSA\n");
				System.out.println("\t\t\t\t\t WE ARE HONOURED TO SERVE YOU!!!\n");  
				
        }
            
}