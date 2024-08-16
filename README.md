# C&M Mining Machines Reservation System

### Overview
The **C&M Mining Machines Reservation System** is a console-based Java application designed to manage customer records for a mining machine reservation service. The system allows users to perform CRUD (Create, Read, Update, Delete) operations on customer records, manage inventory details, and calculate costs for reserved items. The application uses file-based storage to persist customer data.

### Features
- **User Authentication**: Simple login interface to ensure secure access.
- **CRUD Operations**:
  - **Add Customer Records**: Input and validate customer details (ID, name, item details).
  - **View All Records**: Display all customer records in a formatted table.
  - **Search Customer by ID**: Quickly find and display a customer’s record.
  - **Update Customer Records**: Modify existing customer details.
  - **Delete Customer Records**: Remove a customer record from the system.
- **Price Calculation**: Automatically calculate the total cost based on item price and quantity.
- **User-Friendly Menu**: Navigate through the options with a simple numbered menu.
- **File Persistence**: Customer data is stored in a text file, ensuring records persist even after closing the program.

### Project Structure
- **Main Class**: `KHALIL.java`
  - Handles all the logic for the system including login, menu navigation, and CRUD operations.
- **Data Storage**: Customer records are stored in a text file (`CUSTOMER.txt`) in a comma-separated format.
  
### How to Run the Project
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/your-repository-name.git
