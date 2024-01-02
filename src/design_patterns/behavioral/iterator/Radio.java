package design_patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Radio implements IRadio {
    private static final double FIRST_DEFAULT_STATION_FREQUENCY = 94.7;
    private static final double SECOND_DEFAULT_STATION_FREQUENCY = 101.1;
    private static final double THIRD_DEFAULT_STATION_FREQUENCY = 102.3;

    private List<RadioStation> stations;

    public Radio() {
        stations = new ArrayList<>();

        addDefaultStations();
    }

    @Override
    public IStationSelector createIterator() {
        return new StationIterator(stations);
    }

    private void addDefaultStations() {
        stations.add(new RadioStation(FIRST_DEFAULT_STATION_FREQUENCY));
        stations.add(new RadioStation(SECOND_DEFAULT_STATION_FREQUENCY));
        stations.add(new RadioStation(THIRD_DEFAULT_STATION_FREQUENCY));
    }
}
