package studentdetails;

import java.util.Comparator;

public class StockComparator implements Comparator<Student> {


    public int compare(Student s1, Student s2) {
        if (s1.gpa == s2.gpa)
            return 0;
        else if (s1.gpa > s2.gpa)
            return 1;
        else
            return -1;
    }
}
