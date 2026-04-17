package j4;

import A4.h;
import K4.j;
import R2.b;
import Y4.C0247d;
import Y4.D;
import Y4.q;
import Y4.s;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.b0;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;

public final class r extends ArrayAdapter {
    public static final /* synthetic */ int d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9082a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f9083b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f9084c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Context context, ArrayList arrayList, int i2) {
        super(context, 0, arrayList);
        this.f9082a = i2;
        switch (i2) {
            case 1:
                super(context, 0, arrayList);
                this.f9084c = new ArrayList();
                this.f9083b = context;
                return;
            default:
                this.f9083b = context;
                this.f9084c = arrayList;
                return;
        }
    }

    public static void a(r rVar, int i2) {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = rVar.f9084c;
            if (i5 >= arrayList.size()) {
                o.getPrizeObject().getLevelRewardsCollectState().set(i2, Boolean.TRUE);
                ((q) rVar.getItem(i2)).f4415b = true;
                rVar.notifyDataSetChanged();
                b.w(false);
                b.M0(R.raw.add_new_item);
                v0.e(rVar.f9083b, rVar.getContext().getString(R.string.toast_successfully));
                b0.b();
                return;
            } else if (((Boolean) arrayList.get(i5)).booleanValue()) {
                i5++;
            } else {
                return;
            }
        }
    }

    public int getItemViewType(int i2) {
        switch (this.f9082a) {
            case 0:
                return ((s) this.f9084c.get(i2)).f4426f;
            default:
                return super.getItemViewType(i2);
        }
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        int i5;
        switch (this.f9082a) {
            case 0:
                Context context = this.f9083b;
                if (view == null) {
                    if (getItemViewType(i2) == 0) {
                        view = LayoutInflater.from(context).inflate(R.layout.item_chat_current_playre, viewGroup, false);
                    } else {
                        view = LayoutInflater.from(context).inflate(R.layout.item_chat_other_player, viewGroup, false);
                    }
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.item_chat_profile_pic);
                TextView textView = (TextView) view.findViewById(R.id.item_chat_time);
                TextView textView2 = (TextView) view.findViewById(R.id.item_chat_name);
                TextView textView3 = (TextView) view.findViewById(R.id.item_chat_tag);
                TextView textView4 = (TextView) view.findViewById(R.id.item_chat_content);
                s sVar = (s) getItem(i2);
                textView2.setText(sVar.f4423b);
                String str = sVar.f4424c;
                if (str == null || str.equals("not_in_gang")) {
                    textView3.setText("");
                } else {
                    textView3.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.text_between_square_brackets, new Object[]{str}));
                }
                textView.setText(c.X(sVar.f4428j));
                textView4.setText(sVar.d);
                I1.b.v(imageView, sVar.f4425e);
                if (sVar.g) {
                    imageView.setBackgroundResource(R.drawable.profile_pic_frame_vip);
                } else {
                    imageView.setBackgroundResource(R.drawable.profile_pic_frame_default);
                }
                String str2 = sVar.f4422a;
                if (str2.equals("@System") || str2.equals("@System_Administration")) {
                    textView2.setTextColor(context.getResources().getColor(R.color.system_text, context.getTheme()));
                    textView3.setTextColor(context.getResources().getColor(R.color.system_text, context.getTheme()));
                    textView.setTextColor(context.getResources().getColor(R.color.system_text, context.getTheme()));
                    a.i(context, context.getResources(), R.color.system_text, textView4);
                } else if (str2.equals("@gang")) {
                    textView2.setTextColor(context.getResources().getColor(R.color.gang_text, context.getTheme()));
                    textView3.setTextColor(context.getResources().getColor(R.color.gang_text, context.getTheme()));
                    textView.setTextColor(context.getResources().getColor(R.color.white, context.getTheme()));
                    a.i(context, context.getResources(), R.color.white, textView4);
                } else if (sVar.f4427i) {
                    textView2.setTextColor(context.getResources().getColor(R.color.admin_test, context.getTheme()));
                    textView3.setTextColor(context.getResources().getColor(R.color.admin_test, context.getTheme()));
                    textView.setTextColor(context.getResources().getColor(R.color.white, context.getTheme()));
                    a.i(context, context.getResources(), R.color.white, textView4);
                } else {
                    textView2.setTextColor(context.getResources().getColor(R.color.white, context.getTheme()));
                    textView3.setTextColor(context.getResources().getColor(R.color.white, context.getTheme()));
                    textView.setTextColor(context.getResources().getColor(R.color.white, context.getTheme()));
                    a.i(context, context.getResources(), R.color.white, textView4);
                }
                imageView.setOnClickListener(new h(this, imageView, sVar, 14));
                return view;
            default:
                Context context2 = this.f9083b;
                if (view == null) {
                    view = LayoutInflater.from(context2).inflate(R.layout.item_level_prize, viewGroup, false);
                }
                TextView textView5 = (TextView) view.findViewById(R.id.item_level_prize_button_text);
                ImageView imageView2 = (ImageView) view.findViewById(R.id.item_level_prize_button_image);
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.item_level_prize_button);
                HListView hListView = (HListView) view.findViewById(R.id.item_level_prize_horizontal_list_view);
                q qVar = (q) getItem(i2);
                ((TextView) view.findViewById(R.id.item_level_prize_title)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.reach_to_level, new Object[]{Integer.valueOf(qVar.f4414a)}));
                if (qVar.f4415b) {
                    textView5.setText(R.string.button_collected);
                } else {
                    textView5.setText(R.string.button_collect);
                }
                if (qVar.f4415b || o.getMainStatesObject().getLevel() < qVar.f4414a) {
                    imageView2.setImageResource(R.drawable.button_gray);
                } else {
                    imageView2.setImageResource(R.drawable.button_blue);
                }
                ArrayList arrayList = new ArrayList();
                int i6 = 0;
                while (true) {
                    ArrayList arrayList2 = qVar.f4416c;
                    if (i6 < arrayList2.size()) {
                        if (((Integer) arrayList2.get(i6)).intValue() == -100) {
                            i5 = R.drawable.money_buy_gold_4;
                        } else if (((Integer) arrayList2.get(i6)).intValue() == -101) {
                            i5 = R.drawable.money_buy_cash_1;
                        } else if (((Integer) arrayList2.get(i6)).intValue() == -102) {
                            i5 = R.drawable.money_check;
                        } else {
                            i5 = D.s(((Integer) arrayList2.get(i6)).intValue(), 0, 1).d;
                        }
                        arrayList.add(new C0247d(((Integer) arrayList2.get(i6)).intValue(), i5, ((Integer) qVar.d.get(i6)).intValue()));
                        i6++;
                    } else {
                        hListView.setAdapter((ListAdapter) new C0614b(context2, arrayList, 6));
                        relativeLayout.setOnClickListener(new j((ArrayAdapter) this, relativeLayout, (Object) qVar, i2, 9));
                        return view;
                    }
                }
                break;
        }
    }

    public int getViewTypeCount() {
        switch (this.f9082a) {
            case 0:
                return 2;
            default:
                return super.getViewTypeCount();
        }
    }
}
