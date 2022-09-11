public class Reverse {
    public static void main(String[] args) {
        String s="Hello bro how are you";
        String []str=s.split(" ");
        for(int i=str.length-1;i>=0;i--){
            System.out.print(str[i]+" ");
        }
    }
}
