public class LongestCommonPrefix {
    public static void main(String args[]) {
        String input[] = { "flower", "flow", "flight" };
        int counter = 0;
        double counter2 = 0;
        String word = "";
        double dummyvalue = 0;
        Character letter;
        while (counter < input[0].length()) {
            try {
                letter = input[0].charAt(counter);
                dummyvalue += letter;
                for (int i = 1; i < input.length; i++) {
                    if (input[i].charAt(counter) != letter) {
                        break;
                    } else {

                        dummyvalue += input[i].charAt(counter);
                    }
                }
            } catch (Exception e) {
                break;
            }
            counter2 = input[0].charAt(counter);
            if (!(dummyvalue / counter2 == input.length)) {
                break;
            } else {
                letter = ((char) counter2);
                word = word.concat(letter.toString());
            }
            counter++;
            dummyvalue = 0;
            counter2 = 0;
        }

        System.out.println("\"" + word + "\"");
    }
}
