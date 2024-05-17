package com.AlHassanElectronics.Software.facade;

import java.util.Locale;
import java.util.Set;

public interface IContext {
    public Locale getLocale();
    public boolean containsVariable(final String name);
    public Set<String> getVariableNames();
    public Object getVariable(final String name);
}
