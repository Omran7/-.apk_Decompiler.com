package W;

import S3.z;
import T1.B;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.f;
import androidx.emoji2.text.j;
import java.nio.ByteBuffer;

public final class b extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f3856a;

    /* renamed from: b  reason: collision with root package name */
    public final B f3857b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i2;
        B b6 = new B(26);
        this.f3856a = editText;
        this.f3857b = b6;
        if (j.f4933k != null) {
            j a6 = j.a();
            if (a6.b() == 1 && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                f fVar = a6.f4937e;
                fVar.getClass();
                Bundle bundle = editorInfo.extras;
                V.b bVar = (V.b) ((z) fVar.f4928c).f2711b;
                int a7 = bVar.a(4);
                if (a7 != 0) {
                    i2 = ((ByteBuffer) bVar.d).getInt(a7 + bVar.f1342a);
                } else {
                    i2 = 0;
                }
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i2);
                Bundle bundle2 = editorInfo.extras;
                ((j) fVar.f4927b).getClass();
                bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
            }
        }
    }

    public final boolean deleteSurroundingText(int i2, int i5) {
        Editable editableText = this.f3856a.getEditableText();
        this.f3857b.getClass();
        if (B.a(this, editableText, i2, i5, false) || super.deleteSurroundingText(i2, i5)) {
            return true;
        }
        return false;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i2, int i5) {
        Editable editableText = this.f3856a.getEditableText();
        this.f3857b.getClass();
        if (B.a(this, editableText, i2, i5, true) || super.deleteSurroundingTextInCodePoints(i2, i5)) {
            return true;
        }
        return false;
    }
}
