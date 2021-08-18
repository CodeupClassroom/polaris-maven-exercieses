package maven;


import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Give us a word: ");
        String usersWord = input.nextLine();
        System.out.printf("You Entered: %s\n",usersWord);
        String isWordANumberMessage;
        if (StringUtils.isNumeric(usersWord)){
            isWordANumberMessage = "is a number";
        }else{
            isWordANumberMessage = "is not a number";
        }
        System.out.printf("\"%s\" %s\n",usersWord,isWordANumberMessage);
        System.out.printf("Flipped Case: %s\n",StringUtils.swapCase(usersWord));
        System.out.printf("Reversed: %s\n",StringUtils.reverse(usersWord));
    }

}
