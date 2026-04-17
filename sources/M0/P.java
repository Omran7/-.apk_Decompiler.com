package m0;

public final class P {

    /* renamed from: a  reason: collision with root package name */
    public int f9875a;

    /* renamed from: b  reason: collision with root package name */
    public int f9876b;

    /* renamed from: c  reason: collision with root package name */
    public int f9877c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f9878e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9879f;
    public boolean g;
    public boolean h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9880i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9881j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9882k;

    /* renamed from: l  reason: collision with root package name */
    public int f9883l;

    /* renamed from: m  reason: collision with root package name */
    public long f9884m;

    /* renamed from: n  reason: collision with root package name */
    public int f9885n;

    public final void a(int i2) {
        if ((this.d & i2) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.d));
        }
    }

    public final int b() {
        if (this.g) {
            return this.f9876b - this.f9877c;
        }
        return this.f9878e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f9875a + ", mData=null, mItemCount=" + this.f9878e + ", mIsMeasuring=" + this.f9880i + ", mPreviousLayoutItemCount=" + this.f9876b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f9877c + ", mStructureChanged=" + this.f9879f + ", mInPreLayout=" + this.g + ", mRunSimpleAnimations=" + this.f9881j + ", mRunPredictiveAnimations=" + this.f9882k + '}';
    }
}
