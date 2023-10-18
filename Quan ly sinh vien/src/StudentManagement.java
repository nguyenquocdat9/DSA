public class StudentManagement {  

    /** khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100). */
    public Student[] students = new Student[100];
    public int index = 0;

    /** check group. */
    public static boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
    }

    /** them student. */
    public void addStudent(Student newStudent) {
        if (index <= 100) {
            students[index] = new Student(newStudent);
            index++;
        }
    }

    /** in theo danh sach. */
    public String studentsByGroup() {
        String s = "";
        boolean[] flag = new boolean[index];
        for (int i = 0; i < index; i++) {
            flag[i] = false;
        }
        for (int i = 0; i < index; i++) {
            if (flag[i]) {
                continue;
            } else {
                s = s + students[i].getGroup() + "\n";
                for (int j = i; j < index; j++) {
                    if (StudentManagement.sameGroup(students[i], students[j])) {
                        s = s + students[j].getInfo() + "\n";
                        flag[j] = true;
                    }
                }
            }
        }
        return s;
    }

    /** bo student khoi array. */
    public void removeStudent(String id) {
        if (index == 0) {
            return;
        } else if (index == 1) {
            students[0] = null;
            index--;
        }
        int k = 0;
        for (int i = 0; i < index; i++) {
            if (students[i].getId().equals(id)) {
                k++;
            } 
        }
        while (k != 0) {
            for (int i = 0; i < index; i++) {
                if (students[i].getId().equals(id)) {
                    for (int j = i; j < index; j++) {
                        students[j] = students[j + 1];
                    }
                    index--;
                    students[index] = null;
                }
            }
            k--;
        }
    }

    /** main. */
    public static void main(String[] args) {
        Student a = new Student();
        Student b = new Student("Dat", "123", "abc@gmai.com");
        Student c = new Student("nguyen vawn a", "177013", "1234567@gmail.com");
        Student d = new Student("nguyen van b", "185", "drwqudihd@gmail.com");
        Student e = new Student("nguyen van c", "456", "zxcvbnm@gmail.com");
        Student f = new Student("nguyen van d", "7862", "qwertyui@gmail.com");
        StudentManagement arr = new StudentManagement();
        arr.addStudent(b);
        arr.addStudent(a);
        arr.addStudent(c);
        arr.addStudent(d);
        arr.addStudent(e);
        arr.addStudent(f);
        arr.removeStudent("177013");
        System.out.println(arr.studentsByGroup());
    }
}