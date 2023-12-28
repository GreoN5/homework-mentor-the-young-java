package design_patterns.behavioral.iterator;

public interface IStationSelector {
    boolean hasNext();
    RadioStation next();
}
