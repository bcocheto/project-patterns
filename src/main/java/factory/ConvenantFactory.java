package factory;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public class ConvenantFactory {

    public static @NotNull Convenant getConvenant(String convenant) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factory.Convenant" + convenant);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Convenant not found");
        }
        if (!(objeto instanceof Convenant)) {
            throw new IllegalArgumentException("Invalid convenant");
        }
        return (Convenant) objeto;
    }

}
