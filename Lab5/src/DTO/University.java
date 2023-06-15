package DTO;

public class University extends Organization {

    protected String name;

    public University() {
        super();
    }

    public University(String name) {
        this.name = name;
    }

    public University(String name, int size) {
        super(size);
        this.name = name;
    }

    @Override
    public void communicateByTool() {
        System.out.println("In the university, people communicate by voice");
    }

    public void enroll() {
        System.out.println("The registration for enrollment is only valid"
                + "when the university has received all enrollment documents "
                + "and enrollment fees");
    }

    public void educate() {
        System.out.println("provide education at university standard");
    }

    @Override
    public String toString() {
        return "University{" + "name=" + name + '}';
    }

}
