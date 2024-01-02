package design_patterns.behavioral.iterator;

import java.util.List;

public class StationIterator implements IStationSelector {
    private List<RadioStation> stations;
    private int currentPosition = 0;

    public StationIterator(List<RadioStation> stations) {
        this.stations = stations;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < stations.size();
    }

    @Override
    public RadioStation next() {
        return stations.get(currentPosition++);
    }
}
