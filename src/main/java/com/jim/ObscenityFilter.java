package com.jim;

import java.util.Set;

/**
 * JimQiao
 * 2014-12-23 16:27
 */
public class ObscenityFilter {
    private Set<String> obscenities;

    public void filter(String input) {
        if (obscenities.contains(input)) {
            throw new IllegalArgumentException("Obscenities such as '" + input + "' will not be tolerated!");
        }
    }

    public Set<String> getObscenities() {
        return obscenities;
    }

    public void setObscenities(Set<String> obscenities) {
        this.obscenities = obscenities;
    }
}
