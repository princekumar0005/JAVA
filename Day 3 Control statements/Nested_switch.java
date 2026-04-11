public class Nested_switch {
    public static void main(String[] args) {
        int j = 5;
        int k = 1;

        switch (j) {
            case 4:
                System.out.println("j is four");
                break;
            case 5:
                System.out.println("j is five");
                // Nested switch inside case 5
                switch (k) {
                    case 1:
                        System.out.println("k is one");
                        break;
                    case 2:
                        System.out.println("k is two");
                        break;
                }
                break;
            default:
                System.out.println("j is not four or five");
                break;
        }
    }
}

