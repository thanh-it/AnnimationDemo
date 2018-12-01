package duan.it.thanh.annimationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {
    private ImageView ivH;
    private ImageView ivP;
    private ImageView ivS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ivH = (ImageView) findViewById(R.id.iv_h);
        ivP = (ImageView) findViewById(R.id.iv_p);
        ivS = (ImageView) findViewById(R.id.iv_s);
        Animation animation = AnimationUtils.loadAnimation(Main3Activity.this,R.anim.hclock);
        ivH.startAnimation(animation);
        Animation animation2 = AnimationUtils.loadAnimation(Main3Activity.this,R.anim.pclock);
        ivP.startAnimation(animation2);
        Animation animation3 = AnimationUtils.loadAnimation(Main3Activity.this,R.anim.sclock);
        ivS.startAnimation(animation3);

    }
}
