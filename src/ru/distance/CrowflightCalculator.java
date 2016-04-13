package ru.distance;

/**
 * Created by Abilis on 13.04.2016.
 */
public class CrowflightCalculator {

    private static final int EARTH_RADIUS = 6372795;


    public static int calculateCrowflight(double latitude1, double longitude1, double latitude2, double longitude2) {

        //переводим координаты в радианы
        double lat1Rad = latitude1 * Math.PI / 180;
        double lat2Rad = latitude2 * Math.PI / 180;
        double lon1Rad = longitude1 * Math.PI / 180;
        double lon2Rad = longitude2 * Math.PI / 180;

        //вычисляем косинусы и синусы широт и разницы долгот
        double cosLat1 = Math.cos(lat1Rad);
        double cosLat2 = Math.cos(lat2Rad);
        double sinLat1 = Math.sin(lat1Rad);
        double sinLat2 = Math.sin(lat2Rad);

        double deltaLon = lon2Rad - lon1Rad;
        double cosDelta = Math.cos(deltaLon);
        double sinDelta = Math.sin(deltaLon);


        //вычисляем длину большого круга
        double y = Math.sqrt(Math.pow(cosLat2 * sinDelta, 2) + Math.pow(cosLat1 * sinLat2 - sinLat1 * cosLat2 * cosDelta, 2));
        double x = sinLat1 * sinLat2 + cosLat1 * cosLat2 * cosDelta;

        //вычисляем угловую разницу и финальное расстояние в метрах
        double aD = Math.atan2(y, x);

        int distanse = (int) (aD * EARTH_RADIUS);


        return distanse;
    }

}
