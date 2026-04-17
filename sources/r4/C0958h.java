package r4;

import A4.i;
import K4.s;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.mtma.criminal.city.R;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import i4.C0597b;
import p4.C0921d;

/* renamed from: r4.h  reason: case insensitive filesystem */
public final class C0958h extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11238a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f11239b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f11240c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0958h(j jVar, View view, C0505b bVar, int i2) {
        super(view);
        this.f11238a = i2;
        this.f11240c = jVar;
        this.f11239b = bVar;
    }

    public final void onClick(View view) {
        j jVar = this.f11240c;
        C0505b bVar = this.f11239b;
        switch (this.f11238a) {
            case 0:
                super.onClick(view);
                bVar.dismiss();
                jVar.f11263w0 = false;
                return;
            case 1:
                super.onClick(view);
                j jVar2 = this.f11240c;
                if (!jVar2.f11263w0) {
                    jVar2.f11263w0 = true;
                    C0505b bVar2 = new C0505b(jVar2.f11245d0, R.layout.dialog_buy_item);
                    TextView textView = (TextView) bVar2.findViewById(R.id.dialog_buy_item_total_cost);
                    EditText editText = (EditText) bVar2.findViewById(R.id.dialog_buy_item_edit_text);
                    SeekBar seekBar = (SeekBar) bVar2.findViewById(R.id.dialog_buy_item_seekbar_view);
                    ImageView imageView = (ImageView) bVar2.findViewById(R.id.dialog_buy_item_close_button);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar2.findViewById(R.id.dialog_buy_item_buy_button);
                    ((TextView) bVar2.findViewById(R.id.dialog_buy_item_name)).setText(C0597b.f8613x2);
                    ((TextView) bVar2.findViewById(R.id.dialog_buy_item_description)).setText(C0597b.f8620y2);
                    ((ImageView) bVar2.findViewById(R.id.dialog_buy_item_image)).setImageResource(C0597b.f8627z2);
                    textView.setText(String.valueOf(5));
                    ((ImageView) bVar2.findViewById(R.id.dialog_buy_item_type_cost_image)).setImageResource(R.drawable.gold_icon);
                    editText.setText("1");
                    seekBar.setProgress((int) (100.0d * (1.0d / ((double) (o.getMoneyObject().getGold() / 5)))));
                    seekBar.setOnSeekBarChangeListener(new C0921d(editText, 1));
                    editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                    editText.addTextChangedListener(new s(jVar2, editText, seekBar, textView));
                    relativeLayout.setOnClickListener(new i(jVar2, relativeLayout, editText, bVar2, 10));
                    imageView.setOnClickListener(new C0958h(jVar2, imageView, bVar2, 0));
                    bVar2.show();
                }
                bVar.dismiss();
                jVar2.f11262v0 = false;
                return;
            default:
                super.onClick(view);
                bVar.dismiss();
                jVar.f11262v0 = false;
                return;
        }
    }
}
