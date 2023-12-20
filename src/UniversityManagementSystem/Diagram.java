package UniversityManagementSystem;

public class Diagram {



}

class University {
    //-employees:Employees[]
    // No specific attributes or methods for University class
}

class Class {
    // No specific attributes or methods for Class class
}

class Office {
    // No specific attributes or methods for Office class
}

class Department {
    // - offices: Office[]
}

class Employee {
    // - office: Office
    // -department: Department
}

// University "1" -- "*" Class : includes classes
// University "1" -- "*" Department : includes departments
// Department "1" -- "*" Office : includes offices
// Employee "1" -- "1" Office : works in an office