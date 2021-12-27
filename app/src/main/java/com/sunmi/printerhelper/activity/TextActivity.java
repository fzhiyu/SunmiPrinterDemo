package com.sunmi.printerhelper.activity;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.sunmi.printerhelper.R;
import com.sunmi.printerhelper.utils.SunmiPrintHelper;
/**
 * Example of printing text
 */
public class TextActivity extends BaseActivity {
    //Font usage variables
    private String testFont;
    private boolean isBold, isUnderLine;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
//        setMyTitle(R.string.text_title);
//        setBack();

        testFont = null;
        isBold = false;
        isUnderLine = false;
    }

    public void onClick(View view) {
        String content = "mEditText.getText().toString()";

//        float size = Integer.parseInt(mTextView2.getText().toString());
        float size = 12;

        SunmiPrintHelper.getInstance().printText(content, size, isBold, isUnderLine, testFont);
        SunmiPrintHelper.getInstance().feedPaper();
    }
}
