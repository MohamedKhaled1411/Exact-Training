package Lab4;

public class ArrayStatistics
{
    public static void main (String[] args)
    {
        int[] scores = {72, 88, 95, 61, 84, 79, 92, 55, 68, 90};

        int minimum = minimum(scores);
        int maximum = maximum(scores);
        float average = average(scores);
        int countAbove80 = countAbove80(scores);

        System.out.printf("Array Report%nMinimum: %d%nMaximum: %d%nAverage: %.2f%nItems above 80: %d",
                minimum, maximum, average, countAbove80);
    }

    public static int minimum(int[] scores)
    {
        int min = scores[0];

        for (int i = 0; i < scores.length; i++)
        {
            if (scores[i] < min)
                min = scores[i];
        }
        return min;
    }

    public static int maximum(int[] scores)
    {
        int max = scores[0];

        for (int score : scores)
        {
            if (score > max)
            {
                max = score;
            }
        }
        return max;
    }

    public static float average(int[] scores)
    {
        int sum = 0;

        for (int score : scores)
        {
            sum += score;
        }

        return (float) sum / scores.length;
    }

    public static int countAbove80(int[] scores)
    {
        int count = 0;

        for (int score : scores)
        {
            if(score > 80)
            {
                count++;
            }
        }
        return count;
    }
}
