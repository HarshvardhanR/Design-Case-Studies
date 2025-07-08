package Iterator;

public interface ChannelCollection {
    void addChannel(Channel channel);
    void removeChannel(Channel channel);
    Iterator<Channel> iterator();
}
