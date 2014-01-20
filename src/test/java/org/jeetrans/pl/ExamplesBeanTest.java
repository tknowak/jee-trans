package org.jeetrans.pl;

import org.junit.Assert;
import org.junit.Test;

public class ExamplesBeanTest {

    private ExamplesBean examplesBean = new ExamplesBean();

    @Test
    public void shouldReturnOkMessageForSanityCheck() {
        String sanityCheckMessage = examplesBean.sanityCheck();
        Assert.assertEquals("Test OK", sanityCheckMessage);
    }
}
