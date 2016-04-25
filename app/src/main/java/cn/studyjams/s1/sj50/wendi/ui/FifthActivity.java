package cn.studyjams.s1.sj50.wendi.ui;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.Toast;

import cn.studyjams.s1.sj50.wendi.R;
import cn.studyjams.s1.sj50.wendi.view.TextViewVertical;

public class FifthActivity extends AppCompatActivity {

    private HorizontalScrollView sv;
    private TextViewVertical tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_activity);

        tv = (TextViewVertical) findViewById(R.id.tv);
        sv = (HorizontalScrollView) findViewById(R.id.sv);

        //设置接口事件接收
        Handler handler = new Handler() {
            public void handleMessage(android.os.Message msg) {
                switch (msg.what) {
                    case TextViewVertical.LAYOUT_CHANGED:
                        sv.scrollBy(tv.getTextWidth(), 0);//滚动到最右边
                        break;
                }
            }
        };
        tv.setHandler(handler);//将Handler绑定到TextViewVertical



        //创建并设置字体（这里只是为了效果好看一些，但为了让网友们更容易下载，字体库并没有一同打包
        //如果需要体验下效果的朋友可以自行在网络上搜索stxingkai.ttf并放入assets/fonts/中）
        //Typeface face= Typeface.createFromAsset(getAssets(), "/assets/xingkai.ttf");
        //tv.setTypeface(face);

        //设置文字内容
        String a = "迢迢牵牛星，皎皎河汉女。\n" +
                "纤纤擢素手，札札弄机杼。\n" +
                "终日不成章，泣涕零如雨。\n" +
                "河汉清且浅，相去复几许。\n" +
                "盈盈一水间，脉脉不得语。";

        String c = "   ︻青玉案·元夕︼\n\n"+
                "   东风夜放花千树。\n" +
                "   更吹落、星如雨。\n" +
                "   宝马雕车香满路。\n" +
                "   凤箫声动，玉壶光转，\n"+
                "   一夜鱼龙舞。 \n" +
                "   蛾儿雪柳黄金缕, \n"+
                "   笑语盈盈暗香去。\n" +
                "   众里寻他千百度。\n" +
                "   蓦然回首，那人却在，\n"+
                "   灯火阑珊处。\n";

        String b = "︽︾测试\n这是一段测试文字，主要是为了测试竖直排版TextView的显示效果。" +
                "为了能更好的体验感受，我特意增加了比较接近书法的字体和颜色，如果有什么改进的建议请发邮件到我的邮箱吧。" +
                "\n竖直排版的TextView需要配合HorizontalScrollView使用才能有更佳的效果。当然，如果你有时间的话，也可以给这个类" +
                "加上滚动的功能。" + "\n " + "测试\n这是一段测试文字，主要是为了测试竖直排版TextView的显示效果。" +
                "为了能更好的体验感受，我特意增加了比较接近书法的字体和颜色，如果有什么改进的建议请发邮件到我的邮箱吧。" +
                "\n竖直排版的TextView需要配合HorizontalScrollView使用才能有更佳的效果。当然，如果你有时间的话，也可以给这个类" +
                "加上滚动的功能。";

        tv.setText(c);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FifthActivity.this,"hha ",Toast.LENGTH_LONG).show();
            }
        });
    }

}
