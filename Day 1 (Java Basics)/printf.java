public class printf {
    public static void main(String[] args) {

        // --- SECTION 1: BASIC SPECIFIERS  ---
        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        // %s for String, %c for Character, %d for Decimal (Integer), %f for Float (Double), %b for Boolean
        // Note: \n must be added manually for a new line 
        System.out.printf("Hello %s\n", name); 
        System.out.printf("Your name starts with %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age); 
        System.out.printf("You are %f inches tall\n", height); 
        System.out.printf("Employed: %b\n", isEmployed); 

        // Inserting multiple variables 
        System.out.printf("%s is %d years old\n", name, age);

        // --- SECTION 2: PRECISION  ---
        double price1 = 9.991234;
        double price2 = 100.151234;
        double price3 = -54.123456;

        // Setting precision with .[number]f
        System.out.printf("%.1f\n", price1); // Displays 1 digit: 10.0 
        System.out.printf("%.2f\n", price2); // Displays 2 digits: 100.15 
        System.out.printf("%.3f\n", price3); // Displays 3 digits: -54.123 

        // --- SECTION 3: FLAGS  ---
        // '+' flag: Outputs a plus sign for positive values [00:08:50]
        System.out.printf("%+f\n", price1); 
        
        // ',' flag: Comma grouping separator for thousands place 
        System.out.printf("%,f\n", 10000.0); 

        // '(' flag: Encloses negative numbers in parentheses 
        System.out.printf("%(f\n", price3);

        // ' ' (space) flag: Displays a space for positive numbers, minus for negative 
        System.out.printf("% f\n", price1);

        // --- SECTION 4: WIDTH & ALIGNMENT ---
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        // '0' flag: Zero padding 
        System.out.printf("%04d\n", id1); // Output: 0001
        
        // Positive number: Right justify 
        System.out.printf("%4d\n", id2);
        
        // Negative number: Left justify 
        System.out.printf("%-4d\n", id3);
    }
}

