package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        // если не бет рабоать попробовать через палки и в один иф
        /*
        if ((character > 65) && (character < 69))
            if ((character > 69) && (character < 73))
                if ((character > 73) && (character < 79))
                   if ((character > 79) && (character < 85))
                       if ((character > 85) && (character < 89))
                           if (character == 90)
                               if ((character > 97) && (character < 101))
                                   if ((character > 101) && (character < 105))
                                       if ((character > 105) && (character < 111))
                                           if ((character > 111) && (character < 117))
                                               if ((character > 117) && (character < 121))
                                                   if (character == 122) {
                                                       System.out.println("Vowel");
                                                   } else if (character == 65 || character == 69 || character == 73 || character == 79 || character == 85 || character == 89 || character == 97 || character == 101 || character == 105 || character == 111 || character == 117 || character == 121) {
                                                       System.out.println("Consonant");
                                                   } else {
                                                       System.out.println("wrong alphabet!");
                                                   }

         */
        if (character == 'e' ||character == 'y' ||character == 'u' ||character == 'o' ||character == 'a' ||character == 'i') {
            System.out.println("Vowel");
        } else if (character == 'B') {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }

    }
}
