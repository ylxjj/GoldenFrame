package frame.golden.com.goldenframe.ui;

import android.os.Bundle;
import android.util.Log;

import com.orhanobut.logger.Logger;

import frame.golden.com.goldenframe.R;
import frame.golden.com.goldenframe.utils.LoggerUtils;

public class MainActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MGLODEN","biaoji");
        LoggerUtils loggerUtils=new LoggerUtils();
        loggerUtils.e("TestMessage");
        loggerUtils.d("TestMessage");
        loggerUtils.w("TestMessage");
        loggerUtils.i("TestMessage");
        loggerUtils.v("TestMessage");
        loggerUtils.wtf("TestMessage");
        Logger.e("MMM","TestMessage");
        Log.e("MGLODEN","biaoji");
    }
}
