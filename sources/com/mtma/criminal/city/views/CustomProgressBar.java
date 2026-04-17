package com.mtma.criminal.city.views;

import A4.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mtma.criminal.city.R;

public class CustomProgressBar extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f7493c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f7494a;

    /* renamed from: b  reason: collision with root package name */
    public float f7495b = 0.0f;

    public CustomProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.view_custom_progress_bar, this, true);
        this.f7494a = (ImageView) findViewById(R.id.view_custom_progress_bar_full_image);
    }

    public void setProgress(float f6) {
        this.f7495b = Math.max(0.0f, Math.min(1.0f, f6));
        post(new a(this, 12));
    }
}
