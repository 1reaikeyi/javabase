package lIO_wenjian;

public class AutoClose implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("自动解除");
    }
}
