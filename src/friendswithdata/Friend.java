package friendswithdata;

public class Friend {
    private String name;
    private String phone;
    private String email;


    // GETTER ----------------
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    // SETTER ----------------
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    // Constructor -------------
    public Friend(String name, String phone, String email) {
        setName(name);
        setPhone(phone);
        setEmail(email);
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
