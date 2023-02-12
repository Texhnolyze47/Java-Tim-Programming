package linkedlist.exercise;

public record Town(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name,distance);
    }
}
