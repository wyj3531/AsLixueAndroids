package com.aibei.lixue.lixueandroids.thirdframes.rxjavaDemo;

import android.util.Log;

public class Translation2 {
    private static final String TAG = "Translation1";

    private int status;
    private Content content;
    private static class Content{
        private String from;
        private String to;
        private String vendor;
        private String out;
        private int err_no;
    }

    public String  show(){
        Log.d(TAG, "第二次翻译" + content.out);
        return "第二次翻译" + content.out;
    }

}
