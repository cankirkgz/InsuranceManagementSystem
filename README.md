<h1>Insurance Management System</h1>
   <p>The Insurance Management System is a Java-based application that allows users to manage their insurance
        policies. It provides a text-based user interface to interact with the system and perform various tasks such as
        creating accounts, logging in, adding different types of insurance policies, and viewing existing policies.</p>

   <h2>Features</h2>
   <ul>
        <li>Account Management: Users can create individual and enterprise accounts to access the system.</li>
        <li>Authentication: The system supports login functionality with email and password for secure access.</li>
        <li>Insurance Types: Different types of insurance policies are available, including Car Insurance, Health
            Insurance, Residence Insurance, and Travel Insurance.</li>
        <li>Policy Pricing: Each insurance policy's premium is automatically calculated based on specific criteria, such
            as the car's make and model, age, coverage options, and more.</li>
        <li>Address Management: Users can add and remove addresses associated with their accounts.</li>
    </ul>

  <h2>Getting Started</h2>
  <h3>Prerequisites</h3>
   <p>Java Development Kit (JDK) version 8 or above is required to run the application.</p>

  <h3>Installation and Running</h3>
   <ol>
        <li>Clone the repository to your local machine:<br>
            <code>git clone https://github.com/yourusername/insurance-management-system.git</code></li>
        <li>Navigate to the project directory:<br>
            <code>cd insurance-management-system</code></li>
        <li>Compile the Java files:<br>
            <code>javac Main.java</code></li>
        <li>Run the application:<br>
            <code>java Main</code></li>
    </ol>

   <h2>Usage</h2>
   <ol>
        <li><strong>Create an Account:</strong> From the main menu, choose "Create Individual Account" or "Create
            Enterprise Account" and provide the necessary details such as name, email, password, job, and age.</li>
        <li><strong>Login:</strong> Choose "Login" from the main menu and enter your email and password to access your
            account.</li>
        <li><strong>Add Insurance:</strong> Once logged in, choose "Insurance Menu" to add different types of insurance
            policies. Follow the on-screen prompts to enter relevant details for each policy type.</li>
        <li><strong>View Insurances:</strong> From the "Insurance Menu," select "View Insurances" to see the list of
            insurance policies associated with your account.</li>
        <li><strong>Logout:</strong> To logout from your account, choose "Logout" from the "Insurance Menu."</li>
    </ol>

   <h2>Sample Data</h2>
   <p>The application includes sample data to demonstrate its functionality. You can find the sample data in the
        <code>initializeSampleData</code> method in the <code>Main</code> class. These include two user accounts
        (individual and enterprise) and associated addresses.</p>

  <h2>Future Enhancements</h2>
   <ul>
        <li>Implement a database to store user accounts and insurance policies for persistent data storage.</li>
        <li>Add more sophisticated pricing algorithms for insurance policies.</li>
        <li>Implement options to update and delete existing insurance policies.</li>
        <li>Improve error handling and input validation to enhance the user experience.</li>
    </ul>

  <h2>Contributing</h2>
   <p>Contributions to the Insurance Management System are welcome! If you encounter any issues or have suggestions for
        improvements, feel free to open an issue or submit a pull request.</p>

   <h2>License</h2>
   <p>The Insurance Management System is open-source software licensed under the <a
            href="LICENSE">MIT License</a>.</p>

  <h2>Credits</h2>
  <p>The Insurance Management System was developed by <a href="https://github.com/cankirkgz">Can Kırkgöz</a>.</p>
