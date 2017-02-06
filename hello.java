public class hello {
   public static void main(String[] args) {
    if(args.length != 0 && args.length < 3){
        String name= new String(args[args.length-1]);
        name = Character.toUpperCase(args[args.length-1].charAt(0))+args[args.length-1].substring(1);   
        System.out.println("Hello, " + name);
    }
    else if (args.length == 3){
    String convo = new String(args[args.length-1]);
    String pname= new String(args[args.length-2]);

    convo = Character.toUpperCase(args[args.length-1].charAt(0))+args[args.length-1].substring(1);
    pname = Character.toUpperCase(args[args.length-2].charAt(0))+args[args.length-2].substring(1);

    System.out.println("Hello, " + convo + ". My Name is " + pname +". How are you today, "+ convo + "?");
    
    }

    else{
      System.out.println("Hello, Jay!");
    }
   }
}
