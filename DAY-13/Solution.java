public class GfG {
    static boolean isSumOfConsecutive(int n)
  {
        for (int i = 1; i < n; i++)
        {
            int sum = 0;

            
            for (int j = i; j < n; j++)
            {
                sum += j;
                if (sum == n && j > i)
                {
                    return true;
                }
                if (sum > n)
                {
                    break;
                }
            }
        }

        return false;
    }
