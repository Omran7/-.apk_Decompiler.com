package W;

import I1.b;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

public final class f extends b {

    /* renamed from: p  reason: collision with root package name */
    public final TextView f3864p;

    /* renamed from: q  reason: collision with root package name */
    public final d f3865q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3866r = true;

    public f(TextView textView) {
        this.f3864p = textView;
        this.f3865q = new d(textView);
    }

    public final void C0(boolean z3) {
        if (z3) {
            S0();
        }
    }

    public final void D0(boolean z3) {
        this.f3866r = z3;
        S0();
        TextView textView = this.f3864p;
        textView.setFilters(I(textView.getFilters()));
    }

    public final InputFilter[] I(InputFilter[] inputFilterArr) {
        if (!this.f3866r) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof d) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                if (sparseArray.indexOfKey(i6) < 0) {
                    inputFilterArr2[i5] = inputFilterArr[i6];
                    i5++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i7 = 0;
        while (true) {
            d dVar = this.f3865q;
            if (i7 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            } else if (inputFilterArr[i7] == dVar) {
                return inputFilterArr;
            } else {
                i7++;
            }
        }
    }

    public final void S0() {
        TextView textView = this.f3864p;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f3866r) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f3872a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
