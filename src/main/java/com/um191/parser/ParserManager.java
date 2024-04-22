package com.um191.parser;

import com.um191.models.PointData;
import com.um191.models.RawLineData;

import java.util.ArrayList;
import java.util.Date;

public class ParserManager {
    private final ArrayList<String> rawData;
    private SatellitesParser satellitesParser;
    private ArrayList<PointData> points = new ArrayList<>();

    public ParserManager(ArrayList<String> lineData) {
        this.rawData = lineData;
        satellitesParser = new SatellitesParser();
    }

    public ArrayList<PointData> parsData (){

        for(String line : rawData){
            RawLineData lineData = parseLineData(line);
            System.out.println(lineData);
        }
        return points;
    }

    private RawLineData parseLineData(String line){
        RawLineData lineData = new RawLineData();

        satellitesParser.setLineData(line);
        int satellites = satellitesParser.getData();
        lineData.setSatellites(satellites);

        lineData.setLatitude(2.4);

        lineData.setLongitude(4.2);

        lineData.setDate(new Date());

        lineData.setRates(new int[]{1, 2, 3, 4});

//        Parser satelliteP = new SatellitesParser("12");
//        int res = satelliteP.<Integer>getData();
//        System.out.println("satellites: " + res);
//
//        Parser coordsP = new CoordsParser("46.44529342");
//        double resCoords = coordsP.<Double>getData();
//        System.out.println("Coordinates: " + resCoords);


        return lineData;
    }

} //ParserManager