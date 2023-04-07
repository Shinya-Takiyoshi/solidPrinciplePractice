package interfaceSegregation.badInterface;

public interface Vehicle {
    /**
     * 運転を開始する
     */
    void start();
    /**
     * 運転を停止する
     */
    void stop();
    /**
     * 飛行する
     */
    void fly() throws Exception;
}
