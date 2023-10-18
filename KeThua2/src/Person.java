public class Person {
    private String name;
    private String address;

    /** constructor. */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /** get name. */
    public String getName() {
        return name;
    }

    /** set name. */
    public void setName(String name) {
        this.name = name;
    }

    /** get address. */
    public String getAddress() {
        return address;
    }

    /** set address. */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /** to string person. */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]"; 
    }

    public static void main(String[] args) {
        Staff sf = new Staff("ander", "119 walter street", "hw", 5000);
        System.out.println(sf.toString());
    }
}
