package com.example.jsjwudi.myapplication;

/**
 * Created by JSJwudi on 2018/8/2.
 */
public class Test {

    private static volatile Test instance;

    private Test() {
    }

    public static Test getInstance() {
        if (instance == null) {
            synchronized (Test.class) {
                if (instance == null) {
                    instance = new Test();
                }
            }
        }
        return instance;
    }

    private DownloadListener downloadListener;

    public void bad() {
        if (downloadListener != null) {
            downloadListener.download();
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        this.downloadListener = downloadListener;
    }

    public interface DownloadListener {
        void download();

        void dasd();
    }
}
