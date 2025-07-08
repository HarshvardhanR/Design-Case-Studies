package Iterator;

import java.util.List;

public class ChannelIterator implements Iterator<Channel> {
    private List<Channel> channels;
    private int position = 0;

    public ChannelIterator(List<Channel> channels) {
        this.channels = channels;
    }

    @Override
    public boolean hasNext() {
        return position < channels.size();
    }

    @Override
    public Channel next() {
        return channels.get(position++);
    }
}
