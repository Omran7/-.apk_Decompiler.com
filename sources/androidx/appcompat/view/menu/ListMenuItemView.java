package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import c1.i;
import com.mtma.criminal.city.R;
import e.C0476a;
import j.m;
import j.x;

public class ListMenuItemView extends LinearLayout implements x, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    public m f4694a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f4695b;

    /* renamed from: c  reason: collision with root package name */
    public RadioButton f4696c;
    public TextView d;

    /* renamed from: e  reason: collision with root package name */
    public CheckBox f4697e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f4698f;

    /* renamed from: p  reason: collision with root package name */
    public ImageView f4699p;

    /* renamed from: q  reason: collision with root package name */
    public ImageView f4700q;

    /* renamed from: r  reason: collision with root package name */
    public LinearLayout f4701r;

    /* renamed from: s  reason: collision with root package name */
    public final Drawable f4702s;

    /* renamed from: t  reason: collision with root package name */
    public final int f4703t;

    /* renamed from: u  reason: collision with root package name */
    public final Context f4704u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4705v;

    /* renamed from: w  reason: collision with root package name */
    public final Drawable f4706w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f4707x;

    /* renamed from: y  reason: collision with root package name */
    public LayoutInflater f4708y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4709z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i A6 = i.A(getContext(), attributeSet, C0476a.f7546r, R.attr.listMenuViewStyle);
        this.f4702s = A6.n(5);
        TypedArray typedArray = (TypedArray) A6.f5606c;
        this.f4703t = typedArray.getResourceId(1, -1);
        this.f4705v = typedArray.getBoolean(7, false);
        this.f4704u = context;
        this.f4706w = A6.n(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f4707x = obtainStyledAttributes.hasValue(0);
        A6.G();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f4708y == null) {
            this.f4708y = LayoutInflater.from(getContext());
        }
        return this.f4708y;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        int i2;
        ImageView imageView = this.f4699p;
        if (imageView != null) {
            if (z3) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4700q;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4700q.getLayoutParams();
            rect.top = this.f4700q.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r0 == false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(j.m r11) {
        /*
            r10 = this;
            r10.f4694a = r11
            boolean r0 = r11.isVisible()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x000d
            r0 = r2
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.f8759e
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            j.k r0 = r11.f8768w
            boolean r0 = r0.o()
            r3 = 1
            if (r0 == 0) goto L_0x0037
            j.k r0 = r11.f8768w
            boolean r0 = r0.n()
            if (r0 == 0) goto L_0x0031
            char r0 = r11.f8764s
            goto L_0x0033
        L_0x0031:
            char r0 = r11.f8762q
        L_0x0033:
            if (r0 == 0) goto L_0x0037
            r0 = r3
            goto L_0x0038
        L_0x0037:
            r0 = r2
        L_0x0038:
            j.k r4 = r11.f8768w
            r4.n()
            if (r0 == 0) goto L_0x005e
            j.m r0 = r10.f4694a
            j.k r4 = r0.f8768w
            boolean r4 = r4.o()
            if (r4 == 0) goto L_0x005a
            j.k r4 = r0.f8768w
            boolean r4 = r4.n()
            if (r4 == 0) goto L_0x0054
            char r0 = r0.f8764s
            goto L_0x0056
        L_0x0054:
            char r0 = r0.f8762q
        L_0x0056:
            if (r0 == 0) goto L_0x005a
            r0 = r3
            goto L_0x005b
        L_0x005a:
            r0 = r2
        L_0x005b:
            if (r0 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r2 = r1
        L_0x005f:
            if (r2 != 0) goto L_0x011d
            android.widget.TextView r0 = r10.f4698f
            j.m r4 = r10.f4694a
            j.k r5 = r4.f8768w
            boolean r5 = r5.n()
            if (r5 == 0) goto L_0x0070
            char r5 = r4.f8764s
            goto L_0x0072
        L_0x0070:
            char r5 = r4.f8762q
        L_0x0072:
            if (r5 != 0) goto L_0x0078
            java.lang.String r1 = ""
            goto L_0x011a
        L_0x0078:
            j.k r6 = r4.f8768w
            android.content.Context r7 = r6.f8726a
            android.content.res.Resources r7 = r7.getResources()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r9 = r6.f8726a
            android.view.ViewConfiguration r9 = android.view.ViewConfiguration.get(r9)
            boolean r9 = r9.hasPermanentMenuKey()
            if (r9 == 0) goto L_0x009b
            r9 = 2131886097(0x7f120011, float:1.9406763E38)
            java.lang.String r9 = r7.getString(r9)
            r8.append(r9)
        L_0x009b:
            boolean r6 = r6.n()
            if (r6 == 0) goto L_0x00a4
            int r4 = r4.f8765t
            goto L_0x00a6
        L_0x00a4:
            int r4 = r4.f8763r
        L_0x00a6:
            r6 = 2131886093(0x7f12000d, float:1.9406755E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 65536(0x10000, float:9.18355E-41)
            j.m.c(r4, r9, r6, r8)
            r6 = 2131886089(0x7f120009, float:1.9406747E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 4096(0x1000, float:5.74E-42)
            j.m.c(r4, r9, r6, r8)
            r6 = 2131886088(0x7f120008, float:1.9406745E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 2
            j.m.c(r4, r9, r6, r8)
            r6 = 2131886094(0x7f12000e, float:1.9406757E38)
            java.lang.String r6 = r7.getString(r6)
            j.m.c(r4, r3, r6, r8)
            r3 = 2131886096(0x7f120010, float:1.9406761E38)
            java.lang.String r3 = r7.getString(r3)
            r6 = 4
            j.m.c(r4, r6, r3, r8)
            r3 = 2131886092(0x7f12000c, float:1.9406753E38)
            java.lang.String r3 = r7.getString(r3)
            j.m.c(r4, r1, r3, r8)
            if (r5 == r1) goto L_0x010c
            r1 = 10
            if (r5 == r1) goto L_0x0101
            r1 = 32
            if (r5 == r1) goto L_0x00f6
            r8.append(r5)
            goto L_0x0116
        L_0x00f6:
            r1 = 2131886095(0x7f12000f, float:1.940676E38)
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
            goto L_0x0116
        L_0x0101:
            r1 = 2131886091(0x7f12000b, float:1.9406751E38)
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
            goto L_0x0116
        L_0x010c:
            r1 = 2131886090(0x7f12000a, float:1.940675E38)
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
        L_0x0116:
            java.lang.String r1 = r8.toString()
        L_0x011a:
            r0.setText(r1)
        L_0x011d:
            android.widget.TextView r0 = r10.f4698f
            int r0 = r0.getVisibility()
            if (r0 == r2) goto L_0x012a
            android.widget.TextView r0 = r10.f4698f
            r0.setVisibility(r2)
        L_0x012a:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.f8771z
            r10.setContentDescription(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(j.m):void");
    }

    public m getItemData() {
        return this.f4694a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f4702s);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i2 = this.f4703t;
        if (i2 != -1) {
            textView.setTextAppearance(this.f4704u, i2);
        }
        this.f4698f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f4699p = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f4706w);
        }
        this.f4700q = (ImageView) findViewById(R.id.group_divider);
        this.f4701r = (LinearLayout) findViewById(R.id.content);
    }

    public final void onMeasure(int i2, int i5) {
        if (this.f4695b != null && this.f4705v) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4695b.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i2, i5);
    }

    public void setCheckable(boolean z3) {
        View view;
        CompoundButton compoundButton;
        if (z3 || this.f4696c != null || this.f4697e != null) {
            if ((this.f4694a.f8750G & 4) != 0) {
                if (this.f4696c == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
                    this.f4696c = radioButton;
                    LinearLayout linearLayout = this.f4701r;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f4696c;
                view = this.f4697e;
            } else {
                if (this.f4697e == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                    this.f4697e = checkBox;
                    LinearLayout linearLayout2 = this.f4701r;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f4697e;
                view = this.f4696c;
            }
            if (z3) {
                compoundButton.setChecked(this.f4694a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f4697e;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f4696c;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f4694a.f8750G & 4) != 0) {
            if (this.f4696c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
                this.f4696c = radioButton;
                LinearLayout linearLayout = this.f4701r;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4696c;
        } else {
            if (this.f4697e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                this.f4697e = checkBox;
                LinearLayout linearLayout2 = this.f4701r;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4697e;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f4709z = z3;
        this.f4705v = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        int i2;
        ImageView imageView = this.f4700q;
        if (imageView != null) {
            if (this.f4707x || !z3) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4694a.f8768w.getClass();
        boolean z3 = this.f4709z;
        if (z3 || this.f4705v) {
            ImageView imageView = this.f4695b;
            if (imageView != null || drawable != null || this.f4705v) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    this.f4695b = imageView2;
                    LinearLayout linearLayout = this.f4701r;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f4705v) {
                    ImageView imageView3 = this.f4695b;
                    if (!z3) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f4695b.getVisibility() != 0) {
                        this.f4695b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f4695b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.d.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        } else if (this.d.getVisibility() != 8) {
            this.d.setVisibility(8);
        }
    }
}
