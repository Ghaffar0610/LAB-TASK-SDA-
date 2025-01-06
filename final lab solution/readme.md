# Home Automation System

## Topic
**Home Automation System** using the MVC (Model-View-Controller) Architecture.

## Architecture Used
This project implements the **MVC (Model-View-Controller)** architecture.

### Architectural Style
The MVC architecture separates an application into three main components:
- **Model:** Represents the data and business logic.
- **View:** Represents the user interface.
- **Controller:** Handles the input, processes it, and updates the Model and View accordingly.

### Principles Followed in the Architecture
1. **Separation of Concerns:** Each component has a distinct responsibility, making the application easier to maintain and extend.
2. **Modularity:** Components can be developed, tested, and debugged independently.
3. **Reusability:** Components like Model and View can be reused across different parts of the application.
4. **Ease of Testing:** Because of clear separation, individual components can be tested separately, which improves testing efficiency.

## How to Run the Code

### Step 1: Compile the Java Files
Open your terminal or command prompt and navigate to the directory containing your Java files. Then run:
```sh
javac User.java UserView.java UserController.java Main.java

run the main class
java Main


1. Register
2. Login
3. Exit
Choose option 1 to register a new user.

Choose option 2 to login with an existing user.

Choose option 3 to exit the application.
