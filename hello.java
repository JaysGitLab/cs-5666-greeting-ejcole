public class hello {
   public static void main(String[] args) {
    if(args.length != 0){
        String name= new String(args[0]);
        name = Character.toUpperCase(args[0].charAt(0))+args[0].substring(1);   
        System.out.println("Hello, " + name);
    }
    else{
      System.out.println("Hello, Jay!");
    }
   }
}
