import java.util.Stack;

public class BracesBalance {
    static boolean checkBalance(String str){
    Stack<Character> s=new Stack<>();
  for(int i=0;i<str.length();i++){
      char c = str.charAt(i);
      if(c=='(' || c=='{' || c=='['){
          s.push(c);
          continue;
      }
      if(s.empty()){
          return false;
      }

      char check;
      switch(c){
          case ')':
                 check=s.pop();
                if(check=='}' || check==']') return false;
                break;
          case '}':
               check=s.pop();
              if(check==')' || check==']') return false;
              break;
          case ']':
              check=s.pop();
              if(check==')' || check=='}') return false;
              break;
      }
  }
    return s.empty();
    }


    public static void main(String[] args) {
        String s= "{[()]";
       if( checkBalance(s)){
           System.out.println("Balanced");
       }else{
           System.out.println("Not Balanced");
       }
    }
}
