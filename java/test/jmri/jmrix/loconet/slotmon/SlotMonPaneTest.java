package jmri.jmrix.loconet.slotmon;

import jmri.jmrix.loconet.LnTrafficController;
import jmri.jmrix.loconet.LocoNetInterfaceScaffold;
import jmri.jmrix.loconet.LocoNetSystemConnectionMemo;
import jmri.jmrix.loconet.SlotManager;
import jmri.util.JUnitUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Paul Bender Copyright (C) 2017	
 */
public class SlotMonPaneTest {

    @Test
    public void testCTor() {
        SlotMonPane t = new SlotMonPane();
        Assert.assertNotNull("exists",t);
    }

    @Test
    public void testGetHelpTarget() {
        SlotMonPane t = new SlotMonPane();
        Assert.assertEquals("help target","package.jmri.jmrix.loconet.slotmon.SlotMonFrame",t.getHelpTarget());
    }

    @Test
    public void testGetTitle() {
        SlotMonPane t = new SlotMonPane();
        Assert.assertEquals("title","Monitor Slots",t.getTitle());
    }

    @Test
    public void testInitComponents() {
        SlotMonPane t = new SlotMonPane();
        LnTrafficController lnis = new LocoNetInterfaceScaffold();
        SlotManager slotmanager = new SlotManager(lnis);
        LocoNetSystemConnectionMemo memo = new LocoNetSystemConnectionMemo(lnis,slotmanager);
        // we are just making sure that initComponents doesn't cause an exception.
        t.initComponents(memo);
    }

    // The minimal setup for log4J
    @Before
    public void setUp() {
        JUnitUtil.setUp();
    }

    @After
    public void tearDown() {
        JUnitUtil.tearDown();
    }

    // private final static Logger log = LoggerFactory.getLogger(SlotMonPaneTest.class);

}
