package cn.studyjams.s1.sj50.wendi.ui;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.HorizontalScrollView;

import cn.studyjams.s1.sj50.wendi.R;
import cn.studyjams.s1.sj50.wendi.view.TextViewVertical;

/**
 * Created by windog on 2016/4/26.
 */
public class FifthActivity extends AppCompatActivity {

    private HorizontalScrollView sv;
    private TextViewVertical tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_activity);
        this.setTitle("名作欣赏");

        tv = (TextViewVertical) findViewById(R.id.tv);
        sv = (HorizontalScrollView) findViewById(R.id.sv);

        //设置接口事件接收
        Handler handler = new Handler() {
            public void handleMessage(android.os.Message msg) {
                switch (msg.what) {
                    case TextViewVertical.LAYOUT_CHANGED:
                        //滚动到最右边
                        sv.scrollBy(tv.getTextWidth(), 0);
                        break;
                }
            }
        };
        tv.setHandler(handler);


        //设置文字内容
        String c = "   ︻青玉案·元夕︼\n\n" +
                "   东风夜放花千树。\n" +
                "   更吹落、星如雨。\n" +
                "   宝马雕车香满路。\n" +
                "   凤箫声动，玉壶光转，\n" +
                "   一夜鱼龙舞。 \n" +
                "   蛾儿雪柳黄金缕, \n" +
                "   笑语盈盈暗香去。\n" +
                "   众里寻他千百度。\n" +
                "   蓦然回首，那人却在，\n" +
                "   灯火阑珊处。\n";

        tv.setText(c);

    }

}
