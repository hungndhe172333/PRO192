
import java.util.ArrayList;

public class StudentList extends ArrayList<Student> {

    public StudentList() {
        super();
    }

    public Student search(String code) {
        code = code.trim().toUpperCase();

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equals(code)) {
                return this.get(i);
            }
        }
        return null;
    }

    private boolean isCodeDuplicated(String code) {
        code = code.trim().toUpperCase();
        return this.search(code) != null;
    }

    public void addStudent() {
        String newCode, newName;
        int newMark;

        boolean codeDuplicated = false;

        do {
            newCode = Inputter.inputPattern("St. code S000: ", "[sS][\\d]{3}");
            newCode = newCode.trim().toUpperCase();
            codeDuplicated = isCodeDuplicated(newCode);

            if (codeDuplicated) {
                System.out.println("Code is duplicated!");
            }
        } while (codeDuplicated == true);

        newName = Inputter.inputNonBlankStr("Name of new student: ");
        newName = newName.toUpperCase();
        newMark = Inputter.inputInt("Mark: ", 0, 10);

        Student st = new Student(newCode, newName, newMark);

        this.add(st);

        System.out.println("Student " + newCode + " has been added.");
    }

    public void searchStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list. No search can be performed!");
        } else {
            String searchCode = Inputter.inputStr("Input student code for search: ");
            Student st = this.search(searchCode);

            if (st == null) {
                System.out.println("Student " + searchCode + " doesn't existed!");
            } else {
                System.out.println("Found: " + st);
            }
        }
    }

    public void updateStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list. No update can be performed!");
        } else {
            String updateCode = Inputter.inputStr("Input code of updated student: ");
            Student student = this.search(updateCode);

            if (student == null) {
                System.out.println("Student " + updateCode + " doesn't existed!");
            } else {
                String oldName = student.getName();
                String msg = "Old name: " + oldName + ", new name: ";

                String newName = Inputter.inputNonBlankStr(msg);
                student.setName(newName);
                
                int oldMark = student.getMark();
                msg = "Old mark: " + oldMark + ", new mark 0..10: ";

                int newMark = Inputter.inputInt(msg, 0, 10);
                student.setMark(newMark);

                System.out.println("Student " + updateCode + " has been updated.");
            }
        }
    }

    public void removeStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list. No remove can be performed!");
        } else {
            String removeCode = Inputter.inputStr("Input code of removed student: ");
            Student student = this.search(removeCode);

            if (student == null) {
                System.out.println("Student " + removeCode + " doesn't existed!");
            } else {
                this.remove(student);

                System.out.println("Student " + removeCode + " has been removed.");
            }
        }
    }

    public void printAll() {
        if (this.isEmpty()) {
            System.out.println("Empty list.");
        } else {
            System.out.println("Student list: ");

            for (Student student : this) {
                System.out.println(student);
            }

            System.out.println("Total: " + this.size() + " student(s).");
        }
    }
}
