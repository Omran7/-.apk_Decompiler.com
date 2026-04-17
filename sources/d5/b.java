package D5;

import java.util.List;
import java.util.Map;

public interface b extends a {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    g getReturnType();

    List getTypeParameters();

    h getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();
}
