public class Employee {
    private int id;
    private String name;
    private String surname;
    private String lastName;
    private String position;
    private String email;
    private long phoneNumbers;
    private long salary;
    private int years;

    public Employee (id, name, surname, lastName, position, email, phoneNumbers, salary, years)
                this.id = id;
                this.name = name;
                this.lastName = lastName;
                this.position = position;
                this.email = email;
                this.phoneNumbers = phoneNumbers;
                this.salary = salary;
                this.years = years;

    public void printEmployeeInfo() {
        System.out.println("ФИО: " + this.firstName + " " + this.lastName);
        System.out.println("Должность: " + this.position);
        System.out.println("Email: " + this.email);
        System.out.printf("Телефон: , this.phoneNumber);
        System.out.printf("Зарплата: , this.salary);
        System.out.println("Возраст: " + this.age);
    }
}