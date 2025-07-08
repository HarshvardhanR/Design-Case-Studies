package Iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {
    private List<Channel> channels = new ArrayList<>();

    @Override
    public void addChannel(Channel channel) {
        channels.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        channels.remove(channel);
    }

    @Override
    public Iterator<Channel> iterator() {
        return new ChannelIterator(channels);
    }
}
