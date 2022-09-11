import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8 {

    static class Students{
        String name;
        int roll;

        public Students(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }

        @Override
        public String toString() {
            return "Students{" +
                    "name='" + name + '\'' +
                    ", roll=" + roll +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRoll() {
            return roll;
        }

        public void setRoll(int roll) {
            this.roll = roll;
        }
    }
    public static void main(String[] args) {
        char c='7';

        int a=Character.getNumericValue(c);
        System.out.println(a);
        List<Students> list=new ArrayList<>();
        list.add(new Students("Jeet",2));
        list.add(new Students("Jayant",1));
        list.add(new Students("Aayant",1));

     list.stream().sorted((s1,s2)->
             {
                 if(s1.getRoll()==s2.getRoll())
                     return s1.getName().compareTo(s2.getName());
                 else if(s1.getRoll()>s2.getRoll())
                     return 1;
                 else return -1;
             }
             ).map(s1->s1.name=s1.name+" Kumar"+" "+s1.getRoll()).forEach(System.out::println);

    }
}
