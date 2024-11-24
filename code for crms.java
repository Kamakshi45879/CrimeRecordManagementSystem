import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CrimeRecord> crimeRecords = new ArrayList<>();
        int idCounter = 1; // To generate unique IDs for crime records

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a crime record");
            System.out.println("2. Search for a crime record");
            System.out.println("3. List all crime records");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Choose crime type:");
                    System.out.println("1. Theft");
                    System.out.println("2. Assault");
                    System.out.println("3. Homicide");
                    System.out.println("4. Burglary");
                    System.out.println("5. Vandalism");
                    System.out.println("6. Fraud");
                    System.out.println("7. Kidnapping");
                    System.out.println("8. Drug-related");
                    int crimeChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    String crimeType = "";
                    switch (crimeChoice) {
                        case 1: crimeType = "Theft"; break;
                        case 2: crimeType = "Assault"; break;
                        case 3: crimeType = "Homicide"; break;
                        case 4: crimeType = "Burglary"; break;
                        case 5: crimeType = "Vandalism"; break;
                        case 6: crimeType = "Fraud"; break;
                        case 7: crimeType = "Kidnapping"; break;
                        case 8: crimeType = "Drug-related"; break;
                        default: System.out.println("Invalid choice. Defaulting to Theft."); crimeType = "Theft"; break;
                    }

                    System.out.println("Enter date of crime (YYYY-MM-DD):");
                    String dateOfCrime = scanner.nextLine();
                    System.out.println("Enter location of crime:");
                    String location = scanner.nextLine();

                    System.out.println("Enter suspect's name:");
                    String suspectName = scanner.nextLine();

                    System.out.println("Enter suspect's gender (male/female):");
                    String gender = scanner.nextLine();

                    System.out.println("Choose suspect's ID proof type:");
                    System.out.println("1. License");
                    System.out.println("2. PAN Card");
                    System.out.println("3. Aadhar Card");
                    System.out.println("4. Driving License");
                    int idProofChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    String idProofType = "";
                    switch (idProofChoice) {
                        case 1: idProofType = "License"; break;
                        case 2: idProofType = "PAN Card"; break;
                        case 3: idProofType = "Aadhar Card"; break;
                        case 4: idProofType = "Driving License"; break;
                        default: System.out.println("Invalid choice. Defaulting to License."); idProofType = "License"; break;
                    }

                    System.out.println("Enter " + idProofType + " number:");
                    String idProof = scanner.nextLine();

                    CrimeRecord newRecord = new CrimeRecord(idCounter++, crimeType, dateOfCrime, location, suspectName, gender, idProofType, idProof);
                    crimeRecords.add(newRecord);
                    System.out.println("Crime record added successfully!");
                    break;

                case 2:
                    System.out.println("Enter crime type to search for:");
                    String searchType = scanner.nextLine();
                    boolean found = false;
                    for (CrimeRecord record : crimeRecords) {
                        if (record.getCrimeType().equalsIgnoreCase(searchType)) {
                            System.out.println(record);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No crime record found for that crime type.");
                    }
                    break;

                case 3:
                    if (crimeRecords.isEmpty()) {
                        System.out.println("No crime records available.");
                    } else {
                        for (CrimeRecord record : crimeRecords) {
                            System.out.println(record);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class CrimeRecord {
    private int id; // Unique ID for the crime record
    private String crimeType;
    private String dateOfCrime;
    private String location;
    private String suspectName;
    private String gender;
    private String idProofType; // Type of ID proof (e.g., License, PAN Card)
    private String idProof; // ID proof number of the suspect

    public CrimeRecord(int id, String crimeType, String dateOfCrime, String location, String suspectName, String gender, String idProofType, String idProof) {
        this.id = id;
        this.crimeType = crimeType;
        this.dateOfCrime = dateOfCrime;
        this.location = location;
        this.suspectName = suspectName;
        this.gender = gender;
        this.idProofType = idProofType;
        this.idProof = idProof;
    }

    public int getId() {
        return id;
    }

    public String getCrimeType() {
        return crimeType;
    }

    @Override
    public String toString() {
        return "CrimeRecord{" +
                "ID=" + id +
                ", crimeType='" + crimeType + '\'' +
                ", dateOfCrime='" + dateOfCrime + '\'' +
                ", location='" + location + '\'' +
                ", suspectName='" + suspectName + '\'' +
                ", gender='" + gender + '\'' +
                ", idProofType='" + idProofType + '\'' +
                ", idProof='" + idProof + '\'' +
                '}';
    }
}