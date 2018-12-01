package duan.it.thanh.annimationdemo;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private ImageView ivView;
    private Button btnObject;
    private Button btnProperty;
    private LinearLayout toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivView = (ImageView) findViewById(R.id.iv_view);
        btnObject = (Button) findViewById(R.id.btnObject);
        btnProperty = (Button) findViewById(R.id.btnProperty);
        final boolean isShow = false;
        Button bai2 = findViewById(R.id.btn2);
        bai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
        btnObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(ivView,"scaleX",0f,1f);
                objectAnimator.setDuration(3000);
                objectAnimator.setRepeatMode(ObjectAnimator.RESTART);
                objectAnimator.setRepeatCount(3);
                objectAnimator.start();
                ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(ivView,"scaleY",0f,1f);
                objectAnimator1.setDuration(3000);
                objectAnimator1.setRepeatMode(ObjectAnimator.RESTART);
                objectAnimator1.setRepeatCount(3);
                objectAnimator1.start();
                ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(ivView,"rotation",0,360);
                objectAnimator2.setDuration(3000);
                objectAnimator2.setRepeatMode(ObjectAnimator.RESTART);
                objectAnimator2.setRepeatCount(3);
                objectAnimator2.start();



            }
        });
        btnProperty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);
                animation.setDuration(3000);
                ivView.startAnimation(animation);
            }
        });
    }
}
