package yeseul.kr.hs.emirim.framelayouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout[] Linears = new LinearLayout[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button[] buts = new Button[3];
        for(int i = 0; i < buts.length; i++){
            buts[i] = (Button)findViewById(R.id.but1+i);
            buts[i].setOnClickListener(butHandler);
            Linears[i] = (LinearLayout)findViewById(R.id.Line1+i); //이벤트 발생 안하기 때문에 리스너, 핸들러 설정이 필요 없음
            //멤버변수는 class 안에서만 선언하면 됨. 위 아래 상관X
        }
    }

    View.OnClickListener butHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.but1:
                    Linears[0].setVisibility(View.VISIBLE);
                    Linears[1].setVisibility(View.INVISIBLE);
                    Linears[2].setVisibility(View.INVISIBLE);
                    break;
                case R.id.but2:
                    Linears[0].setVisibility(View.INVISIBLE);
                    Linears[1].setVisibility(View.VISIBLE);
                    Linears[2].setVisibility(View.INVISIBLE);
                    break;
                case R.id.but3:
                    Linears[0].setVisibility(View.INVISIBLE);
                    Linears[1].setVisibility(View.INVISIBLE);
                    Linears[2].setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}
