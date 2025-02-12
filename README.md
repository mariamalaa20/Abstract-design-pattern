# 🖥️ Abstract Factory Pattern - Java Implementation

A simple Java implementation of the **Abstract Factory Pattern** for creating different types of computers (PCs and Servers).

## ✨ Features

- Implements the **Abstract Factory Pattern** in Java
- Supports creating **PCs** and **Servers** with specific configurations
- Encapsulates object creation logic in dedicated factory classes

## 📋 Requirements

- Java 8 or higher

## ⚙️ Installation

Clone the repository and compile the Java files:

```bash
# Clone the repository
git clone https://github.com/yourusername/yourproject.git
cd yourproject

# Compile the Java files
javac *.java

# Run the program
java Main
```

## 📁 Project Structure

```
.
├── Computer.java        # Abstract class defining computer specs
├── Factory.java         # Abstract factory class
├── Main.java            # Main execution file
├── PC.java              # Concrete class for PC type
├── PCFactory.java       # Factory class for creating PCs
├── Server.java          # Concrete class for Server type
├── ServerFactory.java   # Factory class for creating Servers
```

## 🚀 Usage

Modify `Main.java` to create different computer configurations:

```java
public class Main {
    public static void main(String[] args) {
        Factory serverFactory = new ServerFactory("16GB", "Intel Xeon");
        Computer server = serverFactory.createComputer();
        System.out.println("Server Config: " + server.getRam() + " RAM, " + server.getCpu() + " CPU");
    }
}
```



