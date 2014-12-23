package com.jim;

/**
 * JimQiao
 * 2014-12-23 16:29
 */
public class HelloServiceImpl implements HelloService {
    private ObscenityFilter obscenityFilter;

    @Override
    public String getHelloMessage(String toAddHello) {
        obscenityFilter.filter(toAddHello);
        return toAddHello;
    }

    public ObscenityFilter getObscenityFilter() {
        return obscenityFilter;
    }

    public void setObscenityFilter(ObscenityFilter obscenityFilter) {
        this.obscenityFilter = obscenityFilter;
    }
}
