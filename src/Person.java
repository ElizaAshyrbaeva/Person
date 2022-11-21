public abstract class Person {
    private int id;
    private String fullName;
    private byte age;
    private char gender;
    private String email;
    private String phoneNumber;
    private double governmentsSalary;

    public Person(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.governmentsSalary = governmentsSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getGovernmentsSalary() {
        return governmentsSalary;
    }

    public void setGovernmentsSalary(double governmentsSalary) {
        this.governmentsSalary = governmentsSalary;
    }

}
