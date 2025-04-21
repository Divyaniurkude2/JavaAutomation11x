package Tasks;

public class Task010_March21th_Count_Vowels {
    public static void main(String[] args) {

            //Ask User Input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string:");
//        String input1 = sc.nextLine();

            //End



            String input = "Divyani";
            int vowels = 0;
            int consonants = 0;

            input = input.toLowerCase();

            for (int i = 0; i < input.length() ; i++) {
                char ch = input.charAt(i);

                if(ch >= 'a' && ch <= 'z'){
                    if( ch == 'a' || ch == 'e' || ch== 'i' || ch == 'o' || ch == 'u'){
                        vowels ++;
                    } else {
                        consonants++;
                    }
                }
            }

            System.out.println("Input :" + input);
            System.out.println("Vowels :" + vowels);
            System.out.println("Consonants :" + consonants);
            // sc.close();



    }
}
