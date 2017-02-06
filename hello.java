public class hello {
   public static void main(String[] args) {
    if(args.length != 0){
        String name= new String(args[args.length-1]);
        name = Character.toUpperCase(args[args.length-1].charAt(0))+args[args.length-1].substring(1);   
        System.out.println("Hello, " + name);
    }
    else{
      System.out.println("Hello, Jay!");
    }
   }
}
