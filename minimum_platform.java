import java.util.Arrays;

public class minimum_platform {
    public static void main(String[] args) {
        int arrival[] = {900, 940, 950, 1100, 1500, 1800};
        int departure[] = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arrival.length;
        int minimumPlatform = find(arrival, departure);
        System.err.println(minimumPlatform);
    }

    public static int find(int arrival[], int departure[]) {
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int platform = 0;
        int maxPlatformNeeded = 0;
        int departureIndex = 0, arrivalIndex = 0;

        while (arrivalIndex < arrival.length && departureIndex < departure.length) {
            if (arrival[arrivalIndex] < departure[departureIndex]) {
                platform++;
                maxPlatformNeeded = Math.max(maxPlatformNeeded, platform);
                arrivalIndex++;
            } else {
                platform--;
                departureIndex++;
            }
        }
        return maxPlatformNeeded;
    }
}
