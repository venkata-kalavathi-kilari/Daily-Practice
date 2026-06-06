class GfG {
    public static int findMean(ArrayList<Integer> arr) {

        double avg = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            avg += (arr.get(i) - avg) / (i + 1);
        }

        return (int)avg;
    }
