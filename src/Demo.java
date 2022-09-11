
public class Demo{
    public static void main(String[] args) {
//        Singleton s= new Singleton();
//        s.getMessage();
        Singleton st=Singleton.getInstance();
        st.showMessage();
    }
}
