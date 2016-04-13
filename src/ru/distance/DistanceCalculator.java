package ru.distance;

/**
 * Created by Abilis on 13.04.2016.
 */
public class DistanceCalculator {


    public static void main(String[] args) {

        double lat1Point1 = 77.1539;
        double lon1Point1 = -139.390;
        double lat2Point1 = -77.1804;
        double lon2Point1 = -139.55;

        double lat1Point2 = 77.1539;
        double lon1Point2 = 120.398;
        double lat2Point2 = 77.1804;
        double lon2Point2 = 129.55;

        double lat1Point3 = 77.1539;
        double lon1Point3 = -120.398;
        double lat2Point3 = 77.1804;
        double lon2Point3 = 129.55;

        int distance1 = CrowflightCalculator.calculateCrowflight(lat1Point1, lon1Point1, lat2Point1, lon2Point1);
        int distance2 = CrowflightCalculator.calculateCrowflight(lat1Point2, lon1Point2, lat2Point2, lon2Point2);
        int distance3 = CrowflightCalculator.calculateCrowflight(lat1Point3, lon1Point3, lat2Point3, lon2Point3);

        System.out.println(distance1);
        System.out.println(distance2);
        System.out.println(distance3);

    }

}
