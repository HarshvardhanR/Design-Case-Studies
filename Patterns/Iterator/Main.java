package Iterator;

public class Main {
    public static void main(String[] args) {
        ChannelCollection collection = new ChannelCollectionImpl();
        collection.addChannel(new Channel(98.5, "Rock FM"));
        collection.addChannel(new Channel(101.2, "Jazz FM"));
        collection.addChannel(new Channel(104.3, "News FM"));

        Iterator<Channel> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
