package homework2.employee;

public class employee {
    int id;
    int departmentNumber;
    int age;
    char gender;
    public employee(int id, int departmentNumber, int age, char gender){
        this.id = id;
        this.departmentNumber = departmentNumber;
        this.age = age;
        this.gender = gender;
    }
    public void printEmployee(){
        System.out.println("Employee's id: " + this.id);
        System.out.println("Employee's department number: " + this.departmentNumber);
        System.out.println("Employee's age: " + this.age);
        if(this.gender == 'f' || this.gender == 'F'){
            System.out.println("Employee's gender: Female");
        } else if (this.gender == 'm' || this.gender == 'M') {
            System.out.println("Employee's gender: Male");
        }else{
            System.out.println("Not valid gender, please change");
        }

    }

    public static void main(String[] args) {
        employee Ashot = new employee(1,3, 27, 'm');
        employee Armen = new employee(2, 6, 32, 'M');
        employee Maria = new employee(3, 6,32,'f');
        Ashot.printEmployee();
        Armen.printEmployee();
        Maria.printEmployee();
    }
}