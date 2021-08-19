package maven;

public class CodeupCrypt {


    public static double version;


    public static String hashPassword(String string) {
        String hashed = "";
        for (char character : string.toCharArray()){
            switch (character) {
                case 'a':
                case 'A':
                    hashed += 4;
                    break;
                case 'e':
                case 'E':
                    hashed += 3;
                    break;
                case 'i':
                case 'I':
                    hashed += 1;
                    break;
                case 'o':
                case 'O':
                    hashed += 0;
                    break;
                case 'u':
                case 'U':
                    hashed += 9;
                    break;
                default:
                    hashed += character;
            }
        }
        return hashed;
    }

//    It should have a method called checkPassword that compares two string parameters to
//    make sure they match with a valid hash.


    public static boolean checkPassword(String password, String hashed) {
        return hashed.equals(hashPassword(password));
    }


}
