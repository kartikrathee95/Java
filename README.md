# Smart Parking Lot System

This project is a simple **Smart Parking Lot System** designed to simulate parking lot management, including parking ticket creation, tracking parking time, and calculating parking fees. It includes core functionality such as managing parking spots, handling ticket creation, and calculating fees based on time spent in the parking lot.

## Features

- **Parking Ticket Management**: Generates a parking ticket with a start time and allows parking and unparking of vehicles.
- **Fee Calculation**: Calculates parking fees based on time spent in the parking lot, using simple rates.
- **Spot Availability**: Tracks the availability of parking spots on each floor.
- **JUnit Tests**: Comprehensive unit tests to ensure the system works as expected.

## Technologies

- Java 17 (or above)
- JUnit 5 for unit testing
- Maven for dependency management and project build

## Project Setup

### Prerequisites

- **Java**: Ensure you have [Java 17+](https://openjdk.java.net/) installed.
- **Maven**: Ensure you have [Apache Maven](https://maven.apache.org/) installed for project build and dependency management.

### Cloning the Repository

To get started with the project, clone the repository to your local machine:

```bash
git clone https://github.com/your-username/parking-lot-system.git
cd parking-lot-system


.
├── src/
│   ├── main/java/com/example/parking/
│   │   ├── ParkingTicket.java       # Represents a parking ticket
│   │   ├── ParkingSpot.java         # Represents a parking spot
│   │   ├── Floor.java               # Represents a parking floor with spots
│   │   └── ParkingLotSystem.java    # Manages the overall parking system
│   └── test/java/com/example/parking/
│       ├── ParkingTicketTest.java   # Unit tests for ParkingTicket class
│       ├── FloorTest.java           # Unit tests for Floor class
│       └── ParkingLotSystemTest.java # Unit tests for overall system
└── pom.xml                          # Maven build file



Certainly! Here is the text in Markdown (.md) format:

```markdown
# Parking Lot System Project Structure

This document outlines the structure of the Parking Lot System project, including its main source files, tests, and the build configuration file.

## Project Directory Structure

```
.
├── src/
│   ├── main/java/com/example/parking/
│   │   ├── ParkingTicket.java       # Represents a parking ticket
│   │   ├── ParkingSpot.java         # Represents a parking spot
│   │   ├── Floor.java               # Represents a parking floor with spots
│   │   └── ParkingLotSystem.java    # Manages the overall parking system
│   └── test/java/com/example/parking/
│       ├── ParkingTicketTest.java   # Unit tests for ParkingTicket class
│       ├── FloorTest.java           # Unit tests for Floor class
│       └── ParkingLotSystemTest.java # Unit tests for overall system
└── pom.xml                          # Maven build file
```

## File Descriptions

### Source Files

- **ParkingTicket.java**  
  Represents a parking ticket, which contains attributes such as the ticket ID, vehicle information, parking duration, etc.

- **ParkingSpot.java**  
  Represents a parking spot in the parking lot. This class may have attributes like spot number, availability status, and size (compact, standard, oversized).

- **Floor.java**  
  Represents a floor in the parking structure. Manages multiple parking spots and may contain methods for finding available spots, adding cars, etc.

- **ParkingLotSystem.java**  
  The main class responsible for managing the overall parking system. It coordinates between floors, spots, and tickets. This class may include methods for parking a vehicle, retrieving a vehicle, and generating tickets.

### Test Files

- **ParkingTicketTest.java**  
  Contains unit tests to validate the functionality of the `ParkingTicket` class, ensuring that it behaves as expected under various scenarios.

- **FloorTest.java**  
  Contains unit tests to validate the functionality of the `Floor` class, checking methods related to spot management and vehicle parking.

- **ParkingLotSystemTest.java**  
  Contains unit tests for the `ParkingLotSystem` class, testing the integration of the overall parking system and its interaction with `Floor`, `ParkingSpot`, and `ParkingTicket`.

### Build Configuration

- **pom.xml**  
  The Maven build configuration file that defines the project's dependencies, build settings, and plugins needed to manage the project lifecycle.

## Usage Instructions

1. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd parking-lot-system
   ```

2. **Build the Project**
   Ensure you have Maven installed, then run:
   ```bash
   mvn clean install
   ```

3. **Run Tests**
   To execute the unit tests, run:
   ```bash
   mvn test
   ```
