C&M Mining Machines Reservation System

Overview
The C&M Mining Machines Reservation System is a console-based Java application designed to manage customer records for a mining machine reservation service. The system allows users to perform CRUD (Create, Read, Update, Delete) operations on customer records, manage inventory details, and calculate costs for reserved items. The application uses file-based storage to persist customer data.

Features
- User Authentication: Simple login interface to ensure secure access.
- CRUD Operations:
  - Add Customer Records: Input and validate customer details (ID, name, item details).
  - View All Records: Display all customer records in a formatted table.
  - Search Customer by ID: Quickly find and display a customer’s record.
  - Update Customer Records: Modify existing customer details.
  - Delete Customer Records: Remove a customer record from the system.
- Price Calculation: Automatically calculate the total cost based on item price and quantity.
- User-Friendly Menu: Navigate through the options with a simple numbered menu.
- File Persistence: Customer data is stored in a text file, ensuring records persist even after closing the program.

Project Structure
- Main Class: KHALIL.java
  - Handles all the logic for the system including login, menu navigation, and CRUD operations.
- Data Storage: Customer records are stored in a text file (CUSTOMER.txt) in a comma-separated format.

How to Run the Project
1. Clone the Repository:
   git clone https://github.com/yourusername/your-repository-name.git
2. Navigate to the Project Directory:
   cd your-repository-name
3. Compile the Java Program:
   javac KHALIL.java
4. Run the Program:
   java KHALIL

Usage Instructions
1. Login: Enter the username and password to access the system.
   - Default Credentials:
     - Username: MUHAMMAD
     - Password: KHALIL
2. Menu Options: After logging in, choose from the menu options:
   - 1: Add Customer Records
   - 2: View All Records
   - 3: Search Customer by ID
   - 4: Update Customer Records
   - 5: Delete Customer Records
   - 6: Calculate Customer Price
   - 7: Exit the Program

File Storage
The customer records are stored in a file named CUSTOMER.txt. Each record is saved as a line in the format:

ID,Name,ItemName,Quantity,Price

Input Validation
The program validates inputs such as numeric values for IDs, quantities, and prices, and ensures names and item names contain only alphabetical characters.

Requirements
- Java Development Kit (JDK): Version 8 or above.

Example Run
Username: MUHAMMAD
Password: KHALIL

Logged In Successfully.

1. To Add Customer Records
2. To View Customer Records
3. To Search Customer Records
4. To Update Customer Records
5. To Delete Customer Records
6. To Calculate Customer Items
7. To Exit the Program

Enter Your Choice [1-7]:

Future Improvements
- GUI Implementation: Convert the system to a graphical user interface for better usability.
- Database Integration: Replace file storage with a relational database for better scalability and performance.
- Advanced Validation: Implement more sophisticated validation mechanisms to handle edge cases and erroneous inputs.

Contribution
Feel free to fork this repository, create feature branches, and submit pull requests for any improvements or bug fixes.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
For any inquiries or issues, please open an issue on the repository or contact the project maintainer:
- Name: Khalil Muhammad Sani
- Email: ksani1@hawk.iit.edu

This project was created as part of a software development course and is supervised by Mr. Nazifi Musa.
