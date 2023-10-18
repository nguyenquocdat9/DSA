public class Student {
    private String name;
    private String id;
    private String group;
    private String email; 

    /** get name. */
    public String getName() {
        return name;
    }

    /** get  group. */
    public String getGroup() {
        return group;
    }

    /** get id. */
    public String getId() {
        return id;
    }

    /** get email. */
    public String getEmail() {
        return email;
    }

    /** set name. */
    public void setName(String n) {
        name = n;
    }

    /** set group. */
    public void setGroup(String n) {
        group = n;
    }

    /** set id. */
    public void setId(String n) {
        id = n;
    }

    /** set email. */
    public void setEmail(String n) {
        email = n;
    }

    /** get info. */
    String getInfo() {
        String s = name + " - " + id + " - " + group + " - " + email;
        return s;
    }

    /** constructor1. */
    Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /** constructor2. */
    Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }
    
    /** constructor3. */
    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }
}
