package My_Method;

public class Student {
    private int id;
    private String name;
    private String address;
    private boolean gender;
    private String phonenumber;
    public static String school = "C0422G1";

    public Student() {
    }

    public Student(int id, String name, String address, boolean gender, String phonenumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.phonenumber = phonenumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
