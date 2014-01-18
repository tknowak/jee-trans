package org.jeetrans.pl;

import javax.ejb.Stateless;

@Stateless
public class ExamplesBean {

    public String sanityCheck() {
        return "Test OK";
    }
}
