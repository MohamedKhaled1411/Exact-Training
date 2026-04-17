package Session4;

public class StringAnalyser
{
    public static void main (String[] args)
    {
        String sen = "One Man, Too noon";
        sen = sen.replaceAll("[,.]", "");

        String[] words = sen.split(" ");
        System.out.println("Total words: " + words.length);

        String noSpace = sen.replace(" ", "");
        System.out.println("Total Character: " + noSpace.length());

        String[] chars = noSpace.toLowerCase().split("");

        // 2D array to store all characters and their frequencies
        String[][] charCount = new String[chars.length][2];
        for (int i = 0; i < chars.length; i++)
        {
            charCount[i][0] = chars[i];
        }

        // Compare and store frequencies of all characters
        for (int i = 0; i < chars.length; i++)
        {
            int count = 0;
            for (int j = 0; j < chars.length; j++)
            {
                if (charCount[i][0].equals(charCount[j][0]))
                {
                    count++;
                }
            }
            charCount[i][1] = Integer.toString(count);
        }

        // Check for the character with the highest frequency
        String freq = "";
        String freqCount = "";
        for (int i = 0; i < charCount.length; i++)
        {
            for (int j = i+1; j < charCount.length; j++)
            {
                if (Integer.parseInt(charCount[i][1]) > Integer.parseInt(charCount[j][1]))
                {
                    freq = charCount[i][0];
                    freqCount = charCount [i][1];
                }
                else
                {
                    freq = charCount[j][0];
                    freqCount = charCount [j][1];
                }
            }
        }
        System.out.println("Character '" + freq + "' is the most frequent with count: " + freqCount);

        /* In case it's confusing 0.0, it's all about having an 2D array that contains all the character and their frequency,
        then it counts the frequencies of all characters and add it to the array.
        Now we compare each character, and it's frequency with other characters
        to see which one has the highest frequency */

        // Check for vowels and consonants
        int vowels = 0;
        int consonants = 0;
        for (String aChar : chars)
        {
            if (aChar.equals("a") ||  aChar.equals("e") || aChar.equals("i") ||  aChar.equals("o") || aChar.equals("u"))
            {
                vowels++;
            }
            else
            {
                consonants++;
            }
        }
        System.out.println("There are " + vowels + " vowels and " + consonants + " consonants");

        // Check for palindrome
        boolean pal = true;
        String palWord = "";
        for (int i = 0; i < words.length; i++)
        {
            for (int j = 0; j <= words[i].length()/2; j++)
            {
                if (words[i].charAt(j) != words[i].charAt(words[i].length() - j - 1))
                {
                    pal = false;
                    palWord = "Null";
                    break;
                }
                else
                {
                    pal = true;
                    palWord = words[i];
                }
            }
        }
        System.out.println("Is any word a palindrome: " + pal + " - " + palWord);
    }
}