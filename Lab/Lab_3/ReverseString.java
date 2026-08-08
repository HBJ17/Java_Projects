import java.util.Scanner; 

public class ReverseString { 

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a string: "); 

        String str = sc.nextLine();

        System.out.print("Reversed String using charAt(): "); 

        for (int i = str.length() - 1; i >= 0; i--) { 

            System.out.print(str.charAt(i)); 

        } 
        StringBuffer sb = new StringBuffer(str); 

        System.out.println("\nReversed String using StringBuffer: " + sb.reverse()); 

        sc.close(); 
    } 

} 