


Crime Record Management System (CRMS)
This project is a Crime Record Management System (CRMS) implemented in Java. It allows users to manage, search, and track crime records. The system can store details about various crime types, suspects, and their ID proofs.

Features
Add Crime Records: Allows users to add new crime records with relevant details.
Search Crime Records: Users can search for crime records based on crime type.
List All Crime Records: Display all stored crime records.
ID Proofs: Supports different types of suspect identification like License, PAN Card, Aadhar Card, and Driving License.
How to Use

markdown
Copy code
Choose an option:
1. Add a crime record
2. Search for a crime record
3. List all crime records
4. Exit
Search for a Crime Record:
You can search crime records by crime type. The program will display all matching records.

Example:

bash

Enter crime type to search for: Theft
List All Crime Records:
The system can display all stored crime records.

Example:

arduino

CrimeRecord{ID=1, crimeType='Theft', dateOfCrime='2024-11-01', location='New York', suspectName='John Doe', gender='Male', idProofType='License', idProof='123456'}
Code Structure
Main Class
The Main class contains the primary logic of the program, including:

Displaying options for the user.
Handling input and performing actions based on the user's choice.
CrimeRecord Class
The CrimeRecord class defines the attributes of a crime record:

id: Unique identifier for the crime record.
crimeType: Type of the crime (e.g., Theft, Assault).
dateOfCrime: Date when the crime occurred.
location: Location where the crime occurred.
suspectName: Name of the suspect.
gender: Gender of the suspect.
idProofType: Type of the suspect's identification.
idProof: ID proof number of the suspect
Future Enhancements
Database Integration: Store crime records in a database instead of an ArrayList for better scalability.
User Authentication: Add user authentication and role management for secure access to the system.
Web Interface: Create a web interface using technologies like Spring Boot for easier user interaction.
License
This project is licensed under the MIT License - see the LICENSE file for details.
