import java.util.*;

public class ComparatorTest {
    int roll;
    String name;
    ComparatorTest(int roll, String name){
        this.name=name;
        this.roll=roll;
    }

    @Override
    public String toString() {
        return "ComparatorTest{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}

class Comptest implements Comparator<ComparatorTest>{
    public int compare(ComparatorTest s1, ComparatorTest s2){
        return s1.roll-s2.roll;
    }
}

class Miantest{
    public static void main(String[] args) {
        List<ComparatorTest> lt= new ArrayList<>();
       lt.add(new ComparatorTest(1,"Jeet"));
       lt.add(new ComparatorTest(1,"Jayant"));
       lt.add(new ComparatorTest(2,"Janardan"));
        Collections.sort(lt,new Comptest());
        for (int i = 0; i < lt.size(); i++)
            System.out.println(lt.get(i));
    }
}