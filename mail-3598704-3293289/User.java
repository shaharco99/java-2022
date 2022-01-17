
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class User
{
    public static void main(String [] args) {
        Person p1 = new Person(123);
        Person p2 = new Person("Dan", 1234);

        Student s1 = new Student("Dana", 2231);

        String [] c = {"aaa", "awwa", "bnm"};
        double [] g = {90, 87, 95};

        Student s2 = new Student("Haim", 3321, c, g);
        /*
        System.out.println(p1 + "\n");
        System.out.println(p2 + "\n");
        System.out.println(s1 + "\n");
        System.out.println(s2 + "\n");
         */      
        Person [] persons = new Person[4];
        persons[0] = p1;
        persons[1] = p2;
        persons[2] = (Person)s1;
        persons[3] = s2; //automatic Casting

        for (int i=0; i<4; i++) {
            System.out.println(persons[i].toString());
            if (persons[i] instanceof Student) {
                System.out.println(((Student)persons[i]).getAvr());
            }
            System.out.println();
        }
    }

}
