package com.demo_by_abhinav.calmsleep.Utils.AVLoading;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;

import android.util.AttributeSet;
import android.view.View;

import com.demo_by_abhinav.calmsleep.R;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallBeatIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallClipRotateIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallClipRotateMultipleIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallClipRotatePulseIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallGridBeatIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallGridPulseIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallPulseIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallPulseRiseIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallPulseSyncIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallRotateIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallScaleIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallScaleMultipleIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallScaleRippleIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallScaleRippleMultipleIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallSpinFadeLoaderIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallTrianglePathIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallZigZagDeflectIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BallZigZagIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.BaseIndicatorController;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.CubeTransitionIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.LineScaleIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.LineScalePartyIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.LineScalePulseOutIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.LineScalePulseOutRapidIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.LineSpinFadeLoaderIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.PacmanIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.SemiCircleSpinIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.SquareSpinIndicator;
import com.demo_by_abhinav.calmsleep.Utils.AVLoading.indicator.TriangleSkewSpinIndicator;

import androidx.annotation.IntDef;

/**
 *
 *
 .BallPulse,
 .BallGridPulse,
 .BallClipRotate,
 .BallClipRotatePulse,
 .SquareSpin,
 .BallClipRotateMultiple,
 .BallPulseRise,
 .BallRotate,
 .CubeTransition,
 .BallZigZag,
 .BallZigZagDeflect,
 .BallTrianglePath,
 .BallScale,
 .LineScale,
 .LineScaleParty,
 .BallScaleMultiple,
 .BallPulseSync,
 .BallBeat,
 .LineScalePulseOut,
 .LineScalePulseOutRapid,
 .BallScaleRipple,
 .BallScaleRippleMultiple,
 .BallSpinFadeLoader,
 .LineSpinFadeLoader,
 .TriangleSkewSpin,
 .Pacman,
 .BallGridBeat,
 .SemiCircleSpin
 *
 */
public class AVLoadingIndicatorView extends View{


    //indicators
    public static final int BallPulse=0;
    public static final int BallGridPulse=1;
    public static final int BallClipRotate=2;
    public static final int BallClipRotatePulse=3;
    public static final int SquareSpin=4;
    public static final int BallClipRotateMultiple=5;
    public static final int BallPulseRise=6;
    public static final int BallRotate=7;
    public static final int CubeTransition=8;
    public static final int BallZigZag=9;
    public static final int BallZigZagDeflect=10;
    public static final int BallTrianglePath=11;
    public static final int BallScale=12;
    public static final int LineScale=13;
    public static final int LineScaleParty=14;
    public static final int BallScaleMultiple=15;
    public static final int BallPulseSync=16;
    public static final int BallBeat=17;
    public static final int LineScalePulseOut=18;
    public static final int LineScalePulseOutRapid=19;
    public static final int BallScaleRipple=20;
    public static final int BallScaleRippleMultiple=21;
    public static final int BallSpinFadeLoader=22;
    public static final int LineSpinFadeLoader=23;
    public static final int TriangleSkewSpin=24;
    public static final int Pacman=25;
    public static final int BallGridBeat=26;
    public static final int SemiCircleSpin=27;


    @IntDef(flag = true,
            value = {
                    BallPulse,
                    BallGridPulse,
                    BallClipRotate,
                    BallClipRotatePulse,
                    SquareSpin,
                    BallClipRotateMultiple,
                    BallPulseRise,
                    BallRotate,
                    CubeTransition,
                    BallZigZag,
                    BallZigZagDeflect,
                    BallTrianglePath,
                    BallScale,
                    LineScale,
                    LineScaleParty,
                    BallScaleMultiple,
                    BallPulseSync,
                    BallBeat,
                    LineScalePulseOut,
                    LineScalePulseOutRapid,
                    BallScaleRipple,
                    BallScaleRippleMultiple,
                    BallSpinFadeLoader,
                    LineSpinFadeLoader,
                    TriangleSkewSpin,
                    Pacman,
                    BallGridBeat,
                    SemiCircleSpin
            })
    public @interface Indicator{}

    //Sizes (with defaults in DP)
    public static final int DEFAULT_SIZE=80;

    //attrs
    int mIndicatorId;
    int mIndicatorColor;

    Paint mPaint;

    BaseIndicatorController mIndicatorController;

    private boolean mHasAnimation;


    public AVLoadingIndicatorView(Context context) {
        super(context);
        init(null, 0);
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, defStyleAttr);
    }


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public AVLoadingIndicatorView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs, defStyleAttr);
    }

    private void init(AttributeSet attrs, int defStyle) {
        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.AVLoadingIndicatorView);
        mIndicatorId=a.getInt(R.styleable.AVLoadingIndicatorView_indicator, BallClipRotatePulse);
        mIndicatorColor=a.getColor(R.styleable.AVLoadingIndicatorView_indicator_color, Color.GREEN);
        a.recycle();
        mPaint=new Paint();
        mPaint.setColor(mIndicatorColor);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        applyIndicator();
    }

    private void applyIndicator(){
        switch (mIndicatorId){
            case BallPulse:
                mIndicatorController=new BallPulseIndicator();
                break;
            case BallGridPulse:
                mIndicatorController=new BallGridPulseIndicator();
                break;
            case BallClipRotate:
                mIndicatorController=new BallClipRotateIndicator();
                break;
            case BallClipRotatePulse:
                mIndicatorController=new BallClipRotatePulseIndicator();
                break;
            case SquareSpin:
                mIndicatorController=new SquareSpinIndicator();
                break;
            case BallClipRotateMultiple:
                mIndicatorController=new BallClipRotateMultipleIndicator();
                break;
            case BallPulseRise:
                mIndicatorController=new BallPulseRiseIndicator();
                break;
            case BallRotate:
                mIndicatorController=new BallRotateIndicator();
                break;
            case CubeTransition:
                mIndicatorController=new CubeTransitionIndicator();
                break;
            case BallZigZag:
                mIndicatorController=new BallZigZagIndicator();
                break;
            case BallZigZagDeflect:
                mIndicatorController=new BallZigZagDeflectIndicator();
                break;
            case BallTrianglePath:
                mIndicatorController=new BallTrianglePathIndicator();
                break;
            case BallScale:
                mIndicatorController=new BallScaleIndicator();
                break;
            case LineScale:
                mIndicatorController=new LineScaleIndicator();
                break;
            case LineScaleParty:
                mIndicatorController=new LineScalePartyIndicator();
                break;
            case BallScaleMultiple:
                mIndicatorController=new BallScaleMultipleIndicator();
                break;
            case BallPulseSync:
                mIndicatorController=new BallPulseSyncIndicator();
                break;
            case BallBeat:
                mIndicatorController=new BallBeatIndicator();
                break;
            case LineScalePulseOut:
                mIndicatorController=new LineScalePulseOutIndicator();
                break;
            case LineScalePulseOutRapid:
                mIndicatorController=new LineScalePulseOutRapidIndicator();
                break;
            case BallScaleRipple:
                mIndicatorController=new BallScaleRippleIndicator();
                break;
            case BallScaleRippleMultiple:
                mIndicatorController=new BallScaleRippleMultipleIndicator();
                break;
            case BallSpinFadeLoader:
                mIndicatorController=new BallSpinFadeLoaderIndicator();
                break;
            case LineSpinFadeLoader:
                mIndicatorController=new LineSpinFadeLoaderIndicator();
                break;
            case TriangleSkewSpin:
                mIndicatorController=new TriangleSkewSpinIndicator();
                break;
            case Pacman:
                mIndicatorController=new PacmanIndicator();
                break;
            case BallGridBeat:
                mIndicatorController=new BallGridBeatIndicator();
                break;
            case SemiCircleSpin:
                mIndicatorController=new SemiCircleSpinIndicator();
                break;
        }
        mIndicatorController.setTarget(this);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width  = measureDimension(dp2px(DEFAULT_SIZE), widthMeasureSpec);
        int height = measureDimension(dp2px(DEFAULT_SIZE), heightMeasureSpec);
        setMeasuredDimension(width, height);
    }

    private int measureDimension(int defaultSize,int measureSpec){
        int result = defaultSize;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);
        if (specMode == MeasureSpec.EXACTLY) {
            result = specSize;
        } else if (specMode == MeasureSpec.AT_MOST) {
            result = Math.min(defaultSize, specSize);
        } else {
            result = defaultSize;
        }
        return result;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawIndicator(canvas);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (!mHasAnimation){
            mHasAnimation=true;
            applyAnimation();
        }
    }

    @Override
    public void setVisibility(int v) {
        if (getVisibility() != v) {
            super.setVisibility(v);
            if (v == GONE || v == INVISIBLE) {
                mIndicatorController.setAnimationStatus(BaseIndicatorController.AnimStatus.END);
            } else {
                mIndicatorController.setAnimationStatus(BaseIndicatorController.AnimStatus.START);
            }
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (mHasAnimation) {
            mIndicatorController.setAnimationStatus(BaseIndicatorController.AnimStatus.START);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mIndicatorController.setAnimationStatus(BaseIndicatorController.AnimStatus.CANCEL);
    }

    void drawIndicator(Canvas canvas){
        mIndicatorController.draw(canvas,mPaint);
    }

    void applyAnimation(){
        mIndicatorController.initAnimation();
    }

    private int dp2px(int dpValue) {
        return (int) getContext().getResources().getDisplayMetrics().density * dpValue;
    }
}
