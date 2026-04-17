package P4;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public final class n implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2258a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RadioGroup f2259b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ EditText f2260c;

    public /* synthetic */ n(RadioGroup radioGroup, EditText editText, int i2) {
        this.f2258a = i2;
        this.f2259b = radioGroup;
        this.f2260c = editText;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
        switch (this.f2258a) {
            case 0:
                View findViewById = this.f2259b.findViewById(i2);
                boolean equals = findViewById.getTag().equals("name");
                EditText editText = this.f2260c;
                if (equals) {
                    editText.setText("");
                    editText.setInputType(1);
                    return;
                } else if (findViewById.getTag().equals("id")) {
                    editText.setText("");
                    editText.setInputType(2);
                    return;
                } else {
                    return;
                }
            default:
                View findViewById2 = this.f2259b.findViewById(i2);
                boolean equals2 = findViewById2.getTag().equals("name");
                EditText editText2 = this.f2260c;
                if (equals2) {
                    editText2.setText("");
                    editText2.setInputType(1);
                    return;
                } else if (findViewById2.getTag().equals("id")) {
                    editText2.setText("");
                    editText2.setInputType(2);
                    return;
                } else {
                    return;
                }
        }
    }
}
