package cn.jangit.programc.Activity.Component;

import android.content.Context;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.TextView;

/**
 * Created by jangitlau on 2017/5/21.
 */

public class BrushTextView extends TextView{
    public BrushTextView(Context context, Typeface customFont){
        super(context);
        this.setTypeface(customFont);

        this.getPaint().setFakeBoldText(true);
        this.setGravity(Gravity.CENTER);

    }

    public void setNumber(int _Num){
        String sNum=digitUppercase(_Num);
        this.setText(sNum);
        if(sNum.length()<=3){
            this.setTextSize(50-11*(sNum.length()-1));
        }else{
            this.setTextSize(15);
        }
    }

//    @Override
//    public void setText(CharSequence text, BufferType type) {
//        // TODO Auto-generated method stub
//        if ("".equals(text) || text == null || text.length() == 0) {
//            return;
//        }
//        int m = text.length();
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < m; i++) {
//            CharSequence index = text.toString().subSequence(i, i + 1);
//            sb.append(index + "\n");
//        }
//        super.setText(sb, type);
//    }

    public static String digitUppercase(int num) {
        //12345
        String mark[] = new String[] {"","拾","佰","仟","萬","拾","佰","仟","亿","拾","佰","仟","萬"};
        String numCn[] = new String[] {"零","壹","貳","叁","肆","伍","陸","柒","捌","玖"};

        char[] numArrRev = String.valueOf(num).toCharArray();

        StringBuffer container = new StringBuffer();
        for (int i = 0; i < numArrRev.length; i++) {
            Integer val = Integer.valueOf(String.valueOf(numArrRev[i]));
            String number = numCn[ val ];
            int x  = numArrRev.length -i -1;
            String sign =  mark[x];

            if( val == 0) {
                if( x % 4 !=0){// 删除单位
                    sign = "";
                }
                if(i < numArrRev.length-1){
                    Integer val1 = Integer.parseInt(String.valueOf(numArrRev[i+1]));
                    if( val==0 && val==val1 ){
                        number = "";
                    }else if ( val == 0 && ("万".equals(sign) || "亿".equals(sign))) {
                        number = "";
                    }
                }else if(i == numArrRev.length-1){
                    number = "";
                }
            }

            container.append(number + sign);
        }
        return container.toString();
    }

}
