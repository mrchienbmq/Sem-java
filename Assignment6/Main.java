package Assignment6;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Main {
    public static void main(String[] args){
        News news = new News() {
            @Override
            public void Display() {
                super.Display();
            }
        };
        news.Display();


        int[] RateList = new int[3];
        RateList[0] = 1;
        RateList[1] = 2;
        RateList[2] = 3;

    }

}
