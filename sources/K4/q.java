package K4;

import A4.h;
import A4.i;
import android.text.InputFilter;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.I;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import f.C0518i;
import j4.C0636m;

public final class q extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1600a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f1601b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(v vVar, View view, int i2) {
        super(view);
        this.f1600a = i2;
        this.f1601b = vVar;
    }

    public final void onClick(View view) {
        v vVar = this.f1601b;
        switch (this.f1600a) {
            case 0:
                super.onClick(view);
                int i2 = (o.getMoneyObject().getCash() > 1 ? 1 : (o.getMoneyObject().getCash() == 1 ? 0 : -1));
                v vVar2 = this.f1601b;
                if (i2 < 0) {
                    c.x0(vVar2.f1626d0);
                    return;
                } else if (o.getLocationObject().getCurrentPlace() == 3) {
                    a.n(MyApplication.f7090a, R.string.can_not_send_material_during_flight, vVar2.f1626d0, (String) null);
                    return;
                } else if (!vVar2.f1625N0) {
                    vVar2.f1625N0 = true;
                    C0505b bVar = new C0505b(vVar2.f1626d0, R.layout.dialog_send_money);
                    TextView textView = (TextView) bVar.findViewById(R.id.dialog_send_money_transfer_value);
                    EditText editText = (EditText) bVar.findViewById(R.id.dialog_send_money_edit_text);
                    SeekBar seekBar = (SeekBar) bVar.findViewById(R.id.dialog_send_money_seekbar);
                    ImageView imageView = (ImageView) bVar.findViewById(R.id.dialog_send_money_close_button);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_send_money_send_button);
                    textView.setText("0");
                    seekBar.setOnSeekBarChangeListener(new C0636m(editText, textView, 5));
                    editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(13)});
                    v vVar3 = vVar2;
                    editText.addTextChangedListener(new s(vVar3, textView, editText, seekBar, 0));
                    relativeLayout.setOnClickListener(new i(vVar3, relativeLayout, textView, bVar, 2));
                    imageView.setOnClickListener(new h(vVar2, imageView, bVar, 3));
                    bVar.show();
                    return;
                } else {
                    return;
                }
            case 1:
                super.onClick(view);
                if (vVar.f1633k0.getVisibility() == 0) {
                    vVar.f1633k0.setVisibility(8);
                    vVar.f1633k0.setAnimation(AnimationUtils.loadAnimation(vVar.f1626d0, R.anim.from_position_to_bottom));
                    return;
                }
                x1.i iVar = vVar.s0;
                if (iVar != null) {
                    vVar.f1640r0.u(iVar);
                    vVar.f1640r0 = null;
                    vVar.s0 = null;
                }
                I l6 = ((C0518i) view.getContext()).l();
                l6.getClass();
                C0269a aVar = new C0269a(l6);
                aVar.h(vVar);
                aVar.e(false);
                return;
            default:
                super.onClick(view);
                if (vVar.f1633k0.getVisibility() == 8) {
                    vVar.f1633k0.setVisibility(0);
                    vVar.f1633k0.setAnimation(AnimationUtils.loadAnimation(vVar.f1626d0, R.anim.from_bottom_to_position));
                    return;
                }
                vVar.f1633k0.setAnimation(AnimationUtils.loadAnimation(vVar.f1626d0, R.anim.from_position_to_bottom));
                vVar.f1633k0.setVisibility(8);
                return;
        }
    }
}
