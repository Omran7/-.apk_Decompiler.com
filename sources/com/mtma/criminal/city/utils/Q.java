package com.mtma.criminal.city.utils;

import K1.e;
import S3.r;
import b5.i;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import d5.o;
import i3.C0590f;
import i3.C0592h;
import i3.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import o3.d;
import v3.j;
import v3.k;

public abstract class Q {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList f7375a;

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList f7376b;

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f7377c;
    public static final ArrayList d = e();

    static {
        ArrayList arrayList = new ArrayList();
        d.h(R.string.medal_name_0, arrayList, R.string.medal_name_1, R.string.medal_name_2, R.string.medal_name_3);
        d.h(R.string.medal_name_4, arrayList, R.string.medal_name_5, R.string.medal_name_6, R.string.medal_name_7);
        d.h(R.string.medal_name_8, arrayList, R.string.medal_name_9, R.string.medal_name_10, R.string.medal_name_11);
        d.h(R.string.medal_name_12, arrayList, R.string.medal_name_13, R.string.medal_name_14, R.string.medal_name_15);
        d.h(R.string.medal_name_16, arrayList, R.string.medal_name_17, R.string.medal_name_18, R.string.medal_name_19);
        d.h(R.string.medal_name_20, arrayList, R.string.medal_name_21, R.string.medal_name_22, R.string.medal_name_23);
        d.h(R.string.medal_name_24, arrayList, R.string.medal_name_25, R.string.medal_name_26, R.string.medal_name_27);
        d.h(R.string.medal_name_28, arrayList, R.string.medal_name_29, R.string.medal_name_30, R.string.medal_name_31);
        d.h(R.string.medal_name_32, arrayList, R.string.medal_name_33, R.string.medal_name_34, R.string.medal_name_36);
        d.h(R.string.medal_name_35, arrayList, R.string.medal_name_37, R.string.medal_name_38, R.string.medal_name_39);
        d.h(R.string.medal_name_40, arrayList, R.string.medal_name_41, R.string.medal_name_42, R.string.medal_name_43);
        d.h(R.string.medal_name_44, arrayList, R.string.medal_name_45, R.string.medal_name_46, R.string.medal_name_47);
        d.h(R.string.medal_name_48, arrayList, R.string.medal_name_49, R.string.medal_name_50, R.string.medal_name_51);
        d.h(R.string.medal_name_52, arrayList, R.string.medal_name_53, R.string.medal_name_54, R.string.medal_name_55);
        d.h(R.string.medal_name_56, arrayList, R.string.medal_name_57, R.string.medal_name_58, R.string.medal_name_59);
        d.h(R.string.medal_name_60, arrayList, R.string.medal_name_61, R.string.medal_name_62, R.string.medal_name_63);
        d.h(R.string.medal_name_64, arrayList, R.string.medal_name_65, R.string.medal_name_66, R.string.medal_name_67);
        d.h(R.string.medal_name_68, arrayList, R.string.medal_name_69, R.string.medal_name_70, R.string.medal_name_71);
        d.h(R.string.medal_name_72, arrayList, R.string.medal_name_73, R.string.medal_name_74, R.string.medal_name_75);
        d.h(R.string.medal_name_76, arrayList, R.string.medal_name_77, R.string.medal_name_78, R.string.medal_name_79);
        d.h(R.string.medal_name_80, arrayList, R.string.medal_name_81, R.string.medal_name_82, R.string.medal_name_83);
        d.h(R.string.medal_name_84, arrayList, R.string.medal_name_85, R.string.medal_name_86, R.string.medal_name_87);
        d.h(R.string.medal_name_88, arrayList, R.string.medal_name_89, R.string.medal_name_90, R.string.medal_name_91);
        d.h(R.string.medal_name_92, arrayList, R.string.medal_name_93, R.string.medal_name_94, R.string.medal_name_95);
        d.h(R.string.medal_name_96, arrayList, R.string.medal_name_97, R.string.medal_name_98, R.string.medal_name_99);
        d.h(R.string.medal_name_100, arrayList, R.string.medal_name_101, R.string.medal_name_102, R.string.medal_name_103);
        d.h(R.string.medal_name_104, arrayList, R.string.medal_name_105, R.string.medal_name_106, R.string.medal_name_107);
        d.h(R.string.medal_name_108, arrayList, R.string.medal_name_109, R.string.medal_name_110, R.string.medal_name_111);
        d.h(R.string.medal_name_112, arrayList, R.string.medal_name_113, R.string.medal_name_114, R.string.medal_name_115);
        d.h(R.string.medal_name_116, arrayList, R.string.medal_name_117, R.string.medal_name_118, R.string.medal_name_119);
        d.h(R.string.medal_name_120, arrayList, R.string.medal_name_121, R.string.medal_name_122, R.string.medal_name_123);
        d.h(R.string.medal_name_124, arrayList, R.string.medal_name_125, R.string.medal_name_126, R.string.medal_name_127);
        d.h(R.string.medal_name_128, arrayList, R.string.medal_name_129, R.string.medal_name_130, R.string.medal_name_131);
        d.h(R.string.medal_name_132, arrayList, R.string.medal_name_133, R.string.medal_name_134, R.string.medal_name_135);
        d.h(R.string.medal_name_136, arrayList, R.string.medal_name_137, R.string.medal_name_138, R.string.medal_name_139);
        d.h(R.string.medal_name_140, arrayList, R.string.medal_name_141, R.string.medal_name_142, R.string.medal_name_143);
        d.h(R.string.medal_name_144, arrayList, R.string.medal_name_145, R.string.medal_name_146, R.string.medal_name_147);
        d.h(R.string.medal_name_148, arrayList, R.string.medal_name_149, R.string.medal_name_150, R.string.medal_name_151);
        d.h(R.string.medal_name_152, arrayList, R.string.medal_name_153, R.string.medal_name_154, R.string.medal_name_155);
        d.h(R.string.medal_name_156, arrayList, R.string.medal_name_157, R.string.medal_name_158, R.string.medal_name_159);
        f7375a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        d.h(R.string.medal_description_0, arrayList2, R.string.medal_description_1, R.string.medal_description_2, R.string.medal_description_3);
        d.h(R.string.medal_description_4, arrayList2, R.string.medal_description_5, R.string.medal_description_6, R.string.medal_description_7);
        d.h(R.string.medal_description_8, arrayList2, R.string.medal_description_9, R.string.medal_description_10, R.string.medal_description_11);
        d.h(R.string.medal_description_12, arrayList2, R.string.medal_description_13, R.string.medal_description_14, R.string.medal_description_15);
        d.h(R.string.medal_description_16, arrayList2, R.string.medal_description_17, R.string.medal_description_18, R.string.medal_description_19);
        d.h(R.string.medal_description_20, arrayList2, R.string.medal_description_21, R.string.medal_description_22, R.string.medal_description_23);
        d.h(R.string.medal_description_24, arrayList2, R.string.medal_description_25, R.string.medal_description_26, R.string.medal_description_27);
        d.h(R.string.medal_description_28, arrayList2, R.string.medal_description_29, R.string.medal_description_30, R.string.medal_description_31);
        d.h(R.string.medal_description_32, arrayList2, R.string.medal_description_33, R.string.medal_description_34, R.string.medal_description_36);
        d.h(R.string.medal_description_35, arrayList2, R.string.medal_description_37, R.string.medal_description_38, R.string.medal_description_39);
        d.h(R.string.medal_description_40, arrayList2, R.string.medal_description_41, R.string.medal_description_42, R.string.medal_description_43);
        d.h(R.string.medal_description_44, arrayList2, R.string.medal_description_45, R.string.medal_description_46, R.string.medal_description_47);
        d.h(R.string.medal_description_48, arrayList2, R.string.medal_description_49, R.string.medal_description_50, R.string.medal_description_51);
        d.h(R.string.medal_description_52, arrayList2, R.string.medal_description_53, R.string.medal_description_54, R.string.medal_description_55);
        d.h(R.string.medal_description_56, arrayList2, R.string.medal_description_57, R.string.medal_description_58, R.string.medal_description_59);
        d.h(R.string.medal_description_60, arrayList2, R.string.medal_description_61, R.string.medal_description_62, R.string.medal_description_63);
        d.h(R.string.medal_description_64, arrayList2, R.string.medal_description_65, R.string.medal_description_66, R.string.medal_description_67);
        d.h(R.string.medal_description_68, arrayList2, R.string.medal_description_69, R.string.medal_description_70, R.string.medal_description_71);
        d.h(R.string.medal_description_72, arrayList2, R.string.medal_description_73, R.string.medal_description_74, R.string.medal_description_75);
        d.h(R.string.medal_description_76, arrayList2, R.string.medal_description_77, R.string.medal_description_78, R.string.medal_description_79);
        d.h(R.string.medal_description_80, arrayList2, R.string.medal_description_81, R.string.medal_description_82, R.string.medal_description_83);
        d.h(R.string.medal_description_84, arrayList2, R.string.medal_description_85, R.string.medal_description_86, R.string.medal_description_87);
        d.h(R.string.medal_description_88, arrayList2, R.string.medal_description_89, R.string.medal_description_90, R.string.medal_description_91);
        d.h(R.string.medal_description_92, arrayList2, R.string.medal_description_93, R.string.medal_description_94, R.string.medal_description_95);
        d.h(R.string.medal_description_96, arrayList2, R.string.medal_description_97, R.string.medal_description_98, R.string.medal_description_99);
        d.h(R.string.medal_description_100, arrayList2, R.string.medal_description_101, R.string.medal_description_102, R.string.medal_description_103);
        d.h(R.string.medal_description_104, arrayList2, R.string.medal_description_105, R.string.medal_description_106, R.string.medal_description_107);
        d.h(R.string.medal_description_108, arrayList2, R.string.medal_description_109, R.string.medal_description_110, R.string.medal_description_111);
        d.h(R.string.medal_description_112, arrayList2, R.string.medal_description_113, R.string.medal_description_114, R.string.medal_description_115);
        d.h(R.string.medal_description_116, arrayList2, R.string.medal_description_117, R.string.medal_description_118, R.string.medal_description_119);
        d.h(R.string.medal_description_120, arrayList2, R.string.medal_description_121, R.string.medal_description_122, R.string.medal_description_123);
        d.h(R.string.medal_description_124, arrayList2, R.string.medal_description_125, R.string.medal_description_126, R.string.medal_description_127);
        d.h(R.string.medal_description_128, arrayList2, R.string.medal_description_129, R.string.medal_description_130, R.string.medal_description_131);
        d.h(R.string.medal_description_132, arrayList2, R.string.medal_description_133, R.string.medal_description_134, R.string.medal_description_135);
        d.h(R.string.medal_description_136, arrayList2, R.string.medal_description_137, R.string.medal_description_138, R.string.medal_description_139);
        d.h(R.string.medal_description_140, arrayList2, R.string.medal_description_141, R.string.medal_description_142, R.string.medal_description_143);
        d.h(R.string.medal_description_144, arrayList2, R.string.medal_description_145, R.string.medal_description_146, R.string.medal_description_147);
        d.h(R.string.medal_description_148, arrayList2, R.string.medal_description_149, R.string.medal_description_150, R.string.medal_description_151);
        d.h(R.string.medal_description_152, arrayList2, R.string.medal_description_153, R.string.medal_description_154, R.string.medal_description_155);
        d.h(R.string.medal_description_156, arrayList2, R.string.medal_description_157, R.string.medal_description_158, R.string.medal_description_159);
        f7376b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 10, 15, 20, 25, 30, 40, 50, 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{100, 500, 1000, 5000, 10000, 50000, 100000, 150000, 200000, 300000, 500000, 1000000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50000, 100000, 1000000, 50000000, 100000000})));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100, 365})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{10, 100, 500, 1000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{100, 1000, 10000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{10, 100, 1000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{10, 50, 500})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{10, 100, 500, 1000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{10, 50, 100})));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000, 50000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000, 50000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000, 50000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000, 50000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000, 50000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000, 50000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000, 50000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000, 50000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000, 50000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000, 50000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000, 50000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000, 10000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{20, 500, 1000})));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{25, 100, 500})));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(100)));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{300, 1000, 3000, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 20, 50})));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50000, 1000000, 10000000, 100000000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100, 500})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{1, 5, 10})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5, 50, 100})));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{10, 100, 1000, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{32, 64, 128})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{500, 5000, 10000, 50000, 100000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{100, 500, 1000, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{100, 500, 1000, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50000000, 500000000, 1000000000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{50, 500, 5000, 10000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5000, 10000, 50000, 500000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5000, 10000, 50000, 500000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5000, 10000, 50000, 500000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5000, 10000, 50000, 500000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{500, 5000, 10000, 50000, 100000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5000, 10000, 50000, 100000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5000, 50000, 100000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5000, 50000, 100000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5000, 50000, 100000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{1, 4, 11})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{1, 5, 20})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{1, 100, 500})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5000, 50000, 100000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5000, 50000, 100000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{5000, 50000, 100000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{10, 100, 1000, 10000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{10, 100, 1000, 10000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{10, 100, 1000, 10000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{10, 100, 1000, 5000, 10000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{10, 100, 500, 5000, 10000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{10, 50, 100, 500})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{10, 100, 1000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{10, 100, 1000, 5000, 10000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{10, 50, 100, 500, 1000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{500, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{500, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{500, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{500, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{500, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{500, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{500, 5000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{500, 5000})));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(5)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{10, 100, 500, 1000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{1000, 50000, 100000})));
        arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{100, 500, 1000, 5000})));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        arrayList3.add(new ArrayList(Collections.singletonList(1)));
        f7377c = arrayList3;
    }

    public static void a(int i2, String str, long j6) {
        r q6 = d.d(C0592h.b().e(), "players", str, "medalsObject", "allMedalsList").q("id");
        double d6 = (double) i2;
        q6.z();
        q6.y((String) null, new j(Double.valueOf(d6), k.f12295e)).e((String) null, d6).d(new G(i2, str, j6));
    }

    /* JADX WARNING: type inference failed for: r13v5, types: [java.lang.Object, com.mtma.criminal.city.utils.N, i3.q] */
    public static void b(int i2, String str, long j6) {
        boolean z3;
        i iVar;
        long j7 = c.f5744o;
        if (a.t(str)) {
            if (o.getMedalsObject() == null || o.getMedalsObject().getAllMedalsDetails() == null) {
                iVar = null;
            } else {
                iVar = o.getMedalsObject().getAllMedalsDetails().get(e.w(i2));
            }
            if (iVar != null) {
                long c3 = (long) c(i2, iVar.getLevel());
                if (!(i2 == 30 || i2 == 33 || i2 == 37 || i2 == 89 || i2 == 93 || i2 == 113)) {
                    if (c3 != -100) {
                        if (f(i2)) {
                            if (j6 < c3) {
                                return;
                            }
                        } else if (i2 == 10 || i2 == 132) {
                            if (((long) c.A(Long.valueOf(iVar.getUpdatedTimeInMilli()))) < c3) {
                                return;
                            }
                        } else if (i2 != 5) {
                            switch (i2) {
                                case 69:
                                case 70:
                                case 71:
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                case 76:
                                case 77:
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                    if (c.b0(iVar.getUpdatedTimeInMilli(), j7)) {
                                        return;
                                    }
                                    break;
                            }
                        } else if (c.b0(iVar.getUpdatedTimeInMilli(), j7)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        if (f(i2)) {
            a(i2, str, j6);
            return;
        }
        if (i2 == 10 || i2 == 132) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            C0590f E6 = d.d(C0592h.b().e(), "players", str, "medalsObject", "allMedalsDetails").E(e.w(i2));
            ? obj = new Object();
            obj.f7368b = str;
            obj.f7367a = i2;
            E6.d(obj);
        } else if (i2 != 5) {
            switch (i2) {
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                    d.d(C0592h.b().e(), "players", str, "medalsObject", "allMedalsDetails").E(e.w(i2)).d(new G(i2, 2, j7, str));
                    return;
                default:
                    d.d(C0592h.b().e(), "players", str, "medalsObject", "allMedalsDetails").E(e.w(i2)).d(new G(i2, 3, j6, str));
                    return;
            }
        } else {
            d.d(C0592h.b().e(), "players", str, "medalsObject", "allMedalsDetails").E(e.w(i2)).d(new G(i2, 1, j7, str));
        }
    }

    public static int c(int i2, int i5) {
        ArrayList arrayList = f7377c;
        if (((ArrayList) arrayList.get(i2)).size() > i5) {
            return ((Integer) ((ArrayList) arrayList.get(i2)).get(i5)).intValue();
        }
        return -100;
    }

    public static int d(int i2, int i5) {
        return ((Integer) ((ArrayList) d.get(i2)).get(i5 - 1)).intValue();
    }

    public static ArrayList e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_0_level_1), Integer.valueOf(R.drawable.medal_0_level_2), Integer.valueOf(R.drawable.medal_0_level_3), Integer.valueOf(R.drawable.medal_0_level_4), Integer.valueOf(R.drawable.medal_0_level_5), Integer.valueOf(R.drawable.medal_0_level_6), Integer.valueOf(R.drawable.medal_0_level_7), Integer.valueOf(R.drawable.medal_0_level_8), Integer.valueOf(R.drawable.medal_0_level_9), Integer.valueOf(R.drawable.medal_0_level_10), Integer.valueOf(R.drawable.medal_0_level_11), Integer.valueOf(R.drawable.medal_0_level_12), Integer.valueOf(R.drawable.medal_0_level_13), Integer.valueOf(R.drawable.medal_0_level_14), Integer.valueOf(R.drawable.medal_0_level_15), Integer.valueOf(R.drawable.medal_0_level_16), Integer.valueOf(R.drawable.medal_0_level_17), Integer.valueOf(R.drawable.medal_0_level_18), Integer.valueOf(R.drawable.medal_0_level_19), Integer.valueOf(R.drawable.medal_0_level_20)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_1_level_1), Integer.valueOf(R.drawable.medal_1_level_2), Integer.valueOf(R.drawable.medal_1_level_3), Integer.valueOf(R.drawable.medal_1_level_4), Integer.valueOf(R.drawable.medal_1_level_5), Integer.valueOf(R.drawable.medal_1_level_6), Integer.valueOf(R.drawable.medal_1_level_7), Integer.valueOf(R.drawable.medal_1_level_8), Integer.valueOf(R.drawable.medal_1_level_9), Integer.valueOf(R.drawable.medal_1_level_10), Integer.valueOf(R.drawable.medal_1_level_11), Integer.valueOf(R.drawable.medal_1_level_12)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_2_level_1), Integer.valueOf(R.drawable.medal_2_level_2), Integer.valueOf(R.drawable.medal_2_level_3), Integer.valueOf(R.drawable.medal_2_level_4), Integer.valueOf(R.drawable.medal_2_level_5)})));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_3_level_1))));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_4_level_1), Integer.valueOf(R.drawable.medal_4_level_2), Integer.valueOf(R.drawable.medal_4_level_3), Integer.valueOf(R.drawable.medal_4_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_5_level_1), Integer.valueOf(R.drawable.medal_5_level_2), Integer.valueOf(R.drawable.medal_5_level_3), Integer.valueOf(R.drawable.medal_5_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_6_level_1), Integer.valueOf(R.drawable.medal_6_level_2), Integer.valueOf(R.drawable.medal_6_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_7_level_1), Integer.valueOf(R.drawable.medal_7_level_2), Integer.valueOf(R.drawable.medal_7_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_8_level_1), Integer.valueOf(R.drawable.medal_8_level_2), Integer.valueOf(R.drawable.medal_8_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_9_level_1), Integer.valueOf(R.drawable.medal_9_level_2), Integer.valueOf(R.drawable.medal_9_level_3), Integer.valueOf(R.drawable.medal_9_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_10_level_1), Integer.valueOf(R.drawable.medal_10_level_2), Integer.valueOf(R.drawable.medal_10_level_3)})));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_11_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_12_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_13_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_14_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_15_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_16_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_17_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_18_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_19_level_1))));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_20_level_1), Integer.valueOf(R.drawable.medal_20_level_2), Integer.valueOf(R.drawable.medal_20_level_3), Integer.valueOf(R.drawable.medal_20_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_21_level_1), Integer.valueOf(R.drawable.medal_21_level_2), Integer.valueOf(R.drawable.medal_21_level_3), Integer.valueOf(R.drawable.medal_21_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_22_level_1), Integer.valueOf(R.drawable.medal_22_level_2), Integer.valueOf(R.drawable.medal_22_level_3), Integer.valueOf(R.drawable.medal_22_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_23_level_1), Integer.valueOf(R.drawable.medal_23_level_2), Integer.valueOf(R.drawable.medal_23_level_3), Integer.valueOf(R.drawable.medal_23_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_24_level_1), Integer.valueOf(R.drawable.medal_24_level_2), Integer.valueOf(R.drawable.medal_24_level_3), Integer.valueOf(R.drawable.medal_24_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_25_level_1), Integer.valueOf(R.drawable.medal_25_level_2), Integer.valueOf(R.drawable.medal_25_level_3), Integer.valueOf(R.drawable.medal_25_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_26_level_1), Integer.valueOf(R.drawable.medal_26_level_2), Integer.valueOf(R.drawable.medal_26_level_3), Integer.valueOf(R.drawable.medal_26_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_27_level_1), Integer.valueOf(R.drawable.medal_27_level_2), Integer.valueOf(R.drawable.medal_27_level_3), Integer.valueOf(R.drawable.medal_27_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_28_level_1), Integer.valueOf(R.drawable.medal_28_level_2), Integer.valueOf(R.drawable.medal_28_level_3), Integer.valueOf(R.drawable.medal_28_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_29_level_1), Integer.valueOf(R.drawable.medal_29_level_2), Integer.valueOf(R.drawable.medal_29_level_3), Integer.valueOf(R.drawable.medal_29_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_30_level_1), Integer.valueOf(R.drawable.medal_30_level_2), Integer.valueOf(R.drawable.medal_30_level_3), Integer.valueOf(R.drawable.medal_30_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_31_level_1), Integer.valueOf(R.drawable.medal_31_level_2), Integer.valueOf(R.drawable.medal_31_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_32_level_1), Integer.valueOf(R.drawable.medal_32_level_2), Integer.valueOf(R.drawable.medal_32_level_3), Integer.valueOf(R.drawable.medal_32_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_33_level_1), Integer.valueOf(R.drawable.medal_33_level_2), Integer.valueOf(R.drawable.medal_33_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_34_level_1), Integer.valueOf(R.drawable.medal_34_level_2), Integer.valueOf(R.drawable.medal_34_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_36_level_1), Integer.valueOf(R.drawable.medal_36_level_2), Integer.valueOf(R.drawable.medal_36_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_35_level_1), Integer.valueOf(R.drawable.medal_35_level_2), Integer.valueOf(R.drawable.medal_35_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_37_level_1), Integer.valueOf(R.drawable.medal_37_level_2), Integer.valueOf(R.drawable.medal_37_level_3)})));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_38_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_39_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_40_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_41_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_42_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_43_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_44_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_45_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_46_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_47_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_48_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_49_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_50_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_51_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_52_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_53_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_54_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_55_level_1))));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_56_level_1), Integer.valueOf(R.drawable.medal_56_level_2), Integer.valueOf(R.drawable.medal_56_level_3)})));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_57_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_58_level_1))));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_59_level_1), Integer.valueOf(R.drawable.medal_59_level_2), Integer.valueOf(R.drawable.medal_59_level_3), Integer.valueOf(R.drawable.medal_59_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_60_level_1), Integer.valueOf(R.drawable.medal_60_level_2), Integer.valueOf(R.drawable.medal_60_level_3)})));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_61_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_62_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_63_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_64_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_65_level_1))));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_66_level_1), Integer.valueOf(R.drawable.medal_66_level_2), Integer.valueOf(R.drawable.medal_66_level_3), Integer.valueOf(R.drawable.medal_66_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_67_level_1), Integer.valueOf(R.drawable.medal_67_level_2), Integer.valueOf(R.drawable.medal_67_level_3), Integer.valueOf(R.drawable.medal_67_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_68_level_1), Integer.valueOf(R.drawable.medal_68_level_2), Integer.valueOf(R.drawable.medal_68_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_69_level_1), Integer.valueOf(R.drawable.medal_69_level_2), Integer.valueOf(R.drawable.medal_69_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_70_level_1), Integer.valueOf(R.drawable.medal_70_level_2), Integer.valueOf(R.drawable.medal_70_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_71_level_1), Integer.valueOf(R.drawable.medal_71_level_2), Integer.valueOf(R.drawable.medal_71_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_72_level_1), Integer.valueOf(R.drawable.medal_72_level_2), Integer.valueOf(R.drawable.medal_72_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_73_level_1), Integer.valueOf(R.drawable.medal_73_level_2), Integer.valueOf(R.drawable.medal_73_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_74_level_1), Integer.valueOf(R.drawable.medal_74_level_2), Integer.valueOf(R.drawable.medal_74_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_75_level_1), Integer.valueOf(R.drawable.medal_75_level_2), Integer.valueOf(R.drawable.medal_75_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_76_level_1), Integer.valueOf(R.drawable.medal_76_level_2), Integer.valueOf(R.drawable.medal_76_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_77_level_1), Integer.valueOf(R.drawable.medal_77_level_2), Integer.valueOf(R.drawable.medal_77_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_78_level_1), Integer.valueOf(R.drawable.medal_78_level_2), Integer.valueOf(R.drawable.medal_78_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_79_level_1), Integer.valueOf(R.drawable.medal_79_level_2), Integer.valueOf(R.drawable.medal_79_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_80_level_1), Integer.valueOf(R.drawable.medal_80_level_2), Integer.valueOf(R.drawable.medal_80_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_81_level_1), Integer.valueOf(R.drawable.medal_81_level_2), Integer.valueOf(R.drawable.medal_81_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_82_level_1), Integer.valueOf(R.drawable.medal_82_level_2), Integer.valueOf(R.drawable.medal_82_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_83_level_1), Integer.valueOf(R.drawable.medal_83_level_2), Integer.valueOf(R.drawable.medal_83_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_84_level_1), Integer.valueOf(R.drawable.medal_84_level_2), Integer.valueOf(R.drawable.medal_84_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_85_level_1), Integer.valueOf(R.drawable.medal_85_level_2), Integer.valueOf(R.drawable.medal_85_level_3)})));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_86_level_1))));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_87_level_1), Integer.valueOf(R.drawable.medal_87_level_2), Integer.valueOf(R.drawable.medal_87_level_3), Integer.valueOf(R.drawable.medal_87_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_88_level_1), Integer.valueOf(R.drawable.medal_88_level_2), Integer.valueOf(R.drawable.medal_88_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_89_level_1), Integer.valueOf(R.drawable.medal_89_level_2), Integer.valueOf(R.drawable.medal_89_level_3), Integer.valueOf(R.drawable.medal_89_level_4), Integer.valueOf(R.drawable.medal_89_level_5)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_90_level_1), Integer.valueOf(R.drawable.medal_90_level_2), Integer.valueOf(R.drawable.medal_90_level_3), Integer.valueOf(R.drawable.medal_90_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_91_level_1), Integer.valueOf(R.drawable.medal_91_level_2), Integer.valueOf(R.drawable.medal_91_level_3), Integer.valueOf(R.drawable.medal_91_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_92_level_1), Integer.valueOf(R.drawable.medal_92_level_2), Integer.valueOf(R.drawable.medal_92_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_93_level_1), Integer.valueOf(R.drawable.medal_93_level_2), Integer.valueOf(R.drawable.medal_93_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_94_level_1), Integer.valueOf(R.drawable.medal_94_level_2), Integer.valueOf(R.drawable.medal_94_level_3), Integer.valueOf(R.drawable.medal_94_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_95_level_1), Integer.valueOf(R.drawable.medal_95_level_2), Integer.valueOf(R.drawable.medal_95_level_3), Integer.valueOf(R.drawable.medal_95_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_96_level_1), Integer.valueOf(R.drawable.medal_96_level_2), Integer.valueOf(R.drawable.medal_96_level_3), Integer.valueOf(R.drawable.medal_96_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_97_level_1), Integer.valueOf(R.drawable.medal_97_level_2), Integer.valueOf(R.drawable.medal_97_level_3), Integer.valueOf(R.drawable.medal_97_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_98_level_1), Integer.valueOf(R.drawable.medal_98_level_2), Integer.valueOf(R.drawable.medal_98_level_3), Integer.valueOf(R.drawable.medal_98_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_99_level_1), Integer.valueOf(R.drawable.medal_99_level_2), Integer.valueOf(R.drawable.medal_99_level_3), Integer.valueOf(R.drawable.medal_99_level_4), Integer.valueOf(R.drawable.medal_99_level_5)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_100_level_1), Integer.valueOf(R.drawable.medal_100_level_2), Integer.valueOf(R.drawable.medal_100_level_3), Integer.valueOf(R.drawable.medal_100_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_101_level_1), Integer.valueOf(R.drawable.medal_101_level_2), Integer.valueOf(R.drawable.medal_101_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_102_level_1), Integer.valueOf(R.drawable.medal_102_level_2), Integer.valueOf(R.drawable.medal_102_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_103_level_1), Integer.valueOf(R.drawable.medal_103_level_2), Integer.valueOf(R.drawable.medal_103_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_104_level_1), Integer.valueOf(R.drawable.medal_104_level_2), Integer.valueOf(R.drawable.medal_104_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_105_level_1), Integer.valueOf(R.drawable.medal_105_level_2), Integer.valueOf(R.drawable.medal_105_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_106_level_1), Integer.valueOf(R.drawable.medal_106_level_2), Integer.valueOf(R.drawable.medal_106_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_107_level_1), Integer.valueOf(R.drawable.medal_107_level_2), Integer.valueOf(R.drawable.medal_107_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_108_level_1), Integer.valueOf(R.drawable.medal_108_level_2), Integer.valueOf(R.drawable.medal_108_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_109_level_1), Integer.valueOf(R.drawable.medal_109_level_2), Integer.valueOf(R.drawable.medal_109_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_110_level_1), Integer.valueOf(R.drawable.medal_110_level_2), Integer.valueOf(R.drawable.medal_110_level_3), Integer.valueOf(R.drawable.medal_110_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_111_level_1), Integer.valueOf(R.drawable.medal_111_level_2), Integer.valueOf(R.drawable.medal_111_level_3), Integer.valueOf(R.drawable.medal_111_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_112_level_1), Integer.valueOf(R.drawable.medal_112_level_2), Integer.valueOf(R.drawable.medal_112_level_3), Integer.valueOf(R.drawable.medal_112_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_113_level_1), Integer.valueOf(R.drawable.medal_113_level_2), Integer.valueOf(R.drawable.medal_113_level_3), Integer.valueOf(R.drawable.medal_113_level_4), Integer.valueOf(R.drawable.medal_113_level_5)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_114_level_1), Integer.valueOf(R.drawable.medal_114_level_2), Integer.valueOf(R.drawable.medal_114_level_3), Integer.valueOf(R.drawable.medal_114_level_4), Integer.valueOf(R.drawable.medal_114_level_5)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_115_level_1), Integer.valueOf(R.drawable.medal_115_level_2), Integer.valueOf(R.drawable.medal_115_level_3), Integer.valueOf(R.drawable.medal_115_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_116_level_1), Integer.valueOf(R.drawable.medal_116_level_2), Integer.valueOf(R.drawable.medal_116_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_117_level_1), Integer.valueOf(R.drawable.medal_117_level_2), Integer.valueOf(R.drawable.medal_117_level_3), Integer.valueOf(R.drawable.medal_117_level_4), Integer.valueOf(R.drawable.medal_117_level_5)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_118_level_1), Integer.valueOf(R.drawable.medal_118_level_2), Integer.valueOf(R.drawable.medal_118_level_3), Integer.valueOf(R.drawable.medal_118_level_4), Integer.valueOf(R.drawable.medal_118_level_5)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_119_level_1), Integer.valueOf(R.drawable.medal_119_level_2)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_120_level_1), Integer.valueOf(R.drawable.medal_120_level_2)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_121_level_1), Integer.valueOf(R.drawable.medal_121_level_2)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_122_level_1), Integer.valueOf(R.drawable.medal_122_level_2)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_123_level_1), Integer.valueOf(R.drawable.medal_123_level_2)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_124_level_1), Integer.valueOf(R.drawable.medal_124_level_2)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_125_level_1), Integer.valueOf(R.drawable.medal_125_level_2)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_126_level_1), Integer.valueOf(R.drawable.medal_126_level_2)})));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_127_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_128_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_129_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_130_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_131_level_1))));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_132_level_1), Integer.valueOf(R.drawable.medal_132_level_2), Integer.valueOf(R.drawable.medal_132_level_3), Integer.valueOf(R.drawable.medal_132_level_4)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_133_level_1), Integer.valueOf(R.drawable.medal_133_level_2), Integer.valueOf(R.drawable.medal_133_level_3)})));
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.medal_134_level_1), Integer.valueOf(R.drawable.medal_134_level_2), Integer.valueOf(R.drawable.medal_134_level_3), Integer.valueOf(R.drawable.medal_134_level_4)})));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_135_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_136_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_137_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_138_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_139_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_140_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_141_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_142_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_143_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_144_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_145_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_146_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_147_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_148_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_149_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_150_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_151_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_152_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_153_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_154_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_155_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_156_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_157_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_158_level_1))));
        arrayList.add(new ArrayList(Collections.singletonList(Integer.valueOf(R.drawable.medal_159_level_1))));
        return arrayList;
    }

    public static boolean f(int i2) {
        return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 59 || i2 == 60 || i2 == 66 || i2 == 99 || i2 == 133 || i2 == 134;
    }

    public static void g(int i2, String str) {
        d.d(C0592h.b().e(), "players", str, "medalsObject", "allMedalsDetails").E(e.w(i2)).E("amount").I(0);
    }

    public static void h(int i2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("amount", 0);
        hashMap.put("updatedTimeInMilli", n.f8294a);
        d.d(C0592h.b().e(), "players", str, "medalsObject", "allMedalsDetails").E(e.w(i2)).J(hashMap);
    }
}
