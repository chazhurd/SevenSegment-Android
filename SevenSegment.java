package com.example.churdlab4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SevenSegment extends View {

    private int mStatus;
    int mCurrentValue;
    Boolean[]  mState;
    final static float[] mVertices = {30,30,40,20,110,20,120,30,110,40,40,40};
    private Paint mPolyPaint = new Paint();
    private static final float LOG_WIDTH = 150;
    private static final float LOG_HEIGHT = 250;
    public static int[][] mLookUpTable = new int[10][7];
    private int mWidth;
    private int mHeight;


    public SevenSegment(Context context) {
        super(context);
    }

    public SevenSegment(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    public void onDraw(Canvas canvas){


//            float mWidth = getWidth();
//            float mHeight = getHeight();


            canvas.scale(mWidth / LOG_WIDTH, mHeight / LOG_HEIGHT);
            canvas.drawRGB(0, 0, 0);
            Path myPath = new Path();
            myPath.moveTo(mVertices[0], mVertices[1]);
            myPath.lineTo(mVertices[2], mVertices[3]);
            myPath.lineTo(mVertices[4], mVertices[5]);
            myPath.lineTo(mVertices[6], mVertices[7]);
            myPath.lineTo(mVertices[8], mVertices[9]);
            myPath.lineTo(mVertices[10], mVertices[11]);
            myPath.close();



            if(mStatus == 0){
                //segment 0 (top)
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.drawPath(myPath, mPolyPaint);

                //segment 1( top left)
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(60, 1);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg 2 top right
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(150, 1);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg4 bottom left
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(60, 93);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg 2 bottom right
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(150, 93);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //bottom
                canvas.save();
                //canvas.scale(width / LOG_WIDTH, height / LOG_HEIGHT);
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(0, 184);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

            }
            if(mStatus == 1){

                //seg 2 top right
                canvas.save();
                //canvas.scale(width / LOG_WIDTH, height / LOG_HEIGHT);
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(150, 1);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg 2 bottom right
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(150, 93);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();



            }

            if(mStatus == 2){
                //segment 0 (top)
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.drawPath(myPath, mPolyPaint);
                //canvas.restore();


                //seg 2 top right
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(150, 1);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg3 middle
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(0, 92);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg4 bottom left
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(60, 93);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //bottom
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(0, 184);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();



            }
            if(mStatus == 3){
                //segment 0 (top)

                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.drawPath(myPath, mPolyPaint);
                //canvas.restore();

                //seg 2 top right
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(150, 1);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg3 middle
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(0, 92);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg 2 bottom right
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(150, 93);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //bottom
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(0, 184);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();
            }
            if(mStatus == 4){


                //canvas.rotate(90);
               // mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
               // canvas.drawPath(myPath, mPolyPaint);
               // canvas.restore();

                //segment 1( top left)
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(60, 1);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg 2 top right
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(150, 1);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg3 middle
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(0, 92);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();


                //seg 2 bottom right
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(150, 93);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();


            }
            if(mStatus == 5){
                //top
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.drawPath(myPath, mPolyPaint);
                //canvas.restore();

                //segment 1( top left)
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(60, 1);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();


                //seg3 middle
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(0, 92);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();



                //seg 2 bottom right
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(150, 93);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //bottom
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(0, 184);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();
            }
            if(mStatus == 6){

                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.drawPath(myPath, mPolyPaint);
                //canvas.restore();

                //segment 1( top left)
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(60, 1);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg3 middle
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(0, 92);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg4 bottom left
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(60, 93);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg 2 bottom right
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(150, 93);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //bottom
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(0, 184);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();
            }
            if(mStatus ==7){
                //segment 0 (top)
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.drawPath(myPath, mPolyPaint);
                //canvas.restore();


                //seg 2 top right
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(150, 1);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();


                //seg 2 bottom right
                canvas.save();
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(150, 93);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();



            }

            if(mStatus == 8) {


                //top
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.drawPath(myPath, mPolyPaint);
                //canvas.restore();

                //segment 1( top left)
                canvas.save();
               // canvas.scale(width / LOG_WIDTH, height / LOG_HEIGHT);
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(60, 1);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg 2 top right
                canvas.save();
                //canvas.scale(width / LOG_WIDTH, height / LOG_HEIGHT);
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(150, 1);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg3 middle
                canvas.save();
                //canvas.scale(width / LOG_WIDTH, height / LOG_HEIGHT);
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(0, 92);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg4 bottom left
                canvas.save();
                //canvas.scale(width / LOG_WIDTH, height / LOG_HEIGHT);
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(60, 93);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //seg 2 bottom right
                canvas.save();
                //canvas.scale(width / LOG_WIDTH, height / LOG_HEIGHT);
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(150, 93);
                canvas.rotate(90);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();

                //bottom
                canvas.save();
                //canvas.scale(width / LOG_WIDTH, height / LOG_HEIGHT);
                mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
                canvas.translate(0, 184);
                canvas.drawPath(myPath, mPolyPaint);
                canvas.restore();
            }
            if(mStatus == 9){
            //segment 0 (top)

            mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
            canvas.drawPath(myPath, mPolyPaint);
            //canvas.restore();

            //segment 1( top left)
            canvas.save();
            mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
            canvas.translate(60, 1);
            canvas.rotate(90);
            canvas.drawPath(myPath, mPolyPaint);
            canvas.restore();

            //seg 2 top right
            canvas.save();
            mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
            canvas.translate(150, 1);
            canvas.rotate(90);
            canvas.drawPath(myPath, mPolyPaint);
            canvas.restore();

            //seg3 middle
            canvas.save();
            mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
            canvas.translate(0, 92);
            canvas.drawPath(myPath, mPolyPaint);
            canvas.restore();


            //seg 2 bottom right
            canvas.save();
            mPolyPaint.setColor(Color.argb(255, 255, 0, 0));
            canvas.translate(150, 93);
            canvas.rotate(90);
            canvas.drawPath(myPath, mPolyPaint);
            canvas.restore();

        }
        if(mStatus == 10) {
            //segment 0 (top)
            mPolyPaint.setColor(Color.argb(105, 255, 0, 0));
            canvas.drawPath(myPath, mPolyPaint);
            //canvas.restore();

            //segment 1( top left)
            canvas.save();
            mPolyPaint.setColor(Color.argb(105, 255, 0, 0));
            canvas.translate(60, 1);
            canvas.rotate(90);
            canvas.drawPath(myPath, mPolyPaint);
            canvas.restore();

            //seg 2 top right
            canvas.save();
            mPolyPaint.setColor(Color.argb(105, 255, 0, 0));
            canvas.translate(150, 1);
            canvas.rotate(90);
            canvas.drawPath(myPath, mPolyPaint);
            canvas.restore();

            //seg3 middle
            canvas.save();
            mPolyPaint.setColor(Color.argb(105, 255, 0, 0));
            canvas.translate(0, 92);
            canvas.drawPath(myPath, mPolyPaint);
            canvas.restore();

            //seg4 bottom left
            canvas.save();
            mPolyPaint.setColor(Color.argb(105, 255, 0, 0));
            canvas.translate(60, 93);
            canvas.rotate(90);
            canvas.drawPath(myPath, mPolyPaint);
            canvas.restore();

            //seg 2 bottom right
            canvas.save();
            mPolyPaint.setColor(Color.argb(105, 255, 0, 0));
            canvas.translate(150, 93);
            canvas.rotate(90);
            canvas.drawPath(myPath, mPolyPaint);
            canvas.restore();

            //bottom
            canvas.save();
            mPolyPaint.setColor(Color.argb(105, 255, 0, 0));
            canvas.translate(0, 184);
            canvas.drawPath(myPath, mPolyPaint);
            canvas.restore();
        }

    }

    public int getStatus(){
        return this.mStatus;
    }
    public void setStatus(int status){
        this.mStatus = status;
    }

    @Override
    public void onSizeChanged(int a, int b, int c, int d)
    {
        super.onSizeChanged(a,b,c,d);
        mWidth = a;
        mHeight = b;

    }

    @Override
    public void onMeasure(int a, int b){
        int actualWidth = MeasureSpec.getSize(a);
        int actualHeight = MeasureSpec.getSize(b);

        //if all width is used  ratio is 3/5 logW/logH
        float desiredWidth = actualWidth;
        float desiredHeight = desiredWidth/(LOG_WIDTH/LOG_HEIGHT);

        if(desiredHeight>actualHeight){
            //flip
             desiredHeight = actualHeight;
             desiredWidth = desiredHeight*(LOG_WIDTH/LOG_HEIGHT);
        }

        setMeasuredDimension((int)desiredWidth, (int)desiredHeight);
        //use either height or width




    }


}
