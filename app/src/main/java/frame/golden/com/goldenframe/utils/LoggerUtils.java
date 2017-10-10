package frame.golden.com.goldenframe.utils;


import com.orhanobut.logger.Logger;

/**
 * Created by Jarnathin on 2017/9/29.
 */

public class LoggerUtils {

    boolean open=true;

    public void v(String Message) {
        if (open)
            Logger.v(Message);
    }

    public void w(String Message) {
        if (open)
            Logger.w(Message);
    }

    public void i(String Message) {
        if (open)
            Logger.i(Message);
    }

    public void e(String Message) {
        if (open)
            Logger.e(Message);
    }

    public void wtf(String Message) {
        if (open)
            Logger.wtf(Message);
    }

    public void json(String Message) {
        if (open)
            Logger.json(Message);
    }

    public void d(String Message) {
        if (open)
            Logger.d(Message);
    }

}
