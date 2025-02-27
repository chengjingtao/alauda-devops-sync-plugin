// package io.alauda.jenkins.devops.sync;
//
// import com.gargoylesoftware.htmlunit.html.*;
// import org.junit.Rule;
// import org.junit.Test;
// import org.jvnet.hudson.test.JenkinsRule;
// import org.xml.sax.SAXException;
//
// import java.io.IOException;
//
// import static org.junit.Assert.*;
//
// public class GlobalPluginConfigurationTest {
//    @Rule
//    public JenkinsRule j = new JenkinsRule();
//
//    @Test
//    public void basicTest() throws IOException, SAXException {
//        JenkinsRule.WebClient wc = j.createWebClient();
//
//        HtmlPage page = wc.goTo("configure");
//
//        // elements exists check
//        assertNotNull(page.getElementByName("_.server"));
//        assertNotNull(page.getElementByName("_.credentialsId"));
//        assertNotNull(page.getElementByName("_.jenkinsService"));
//        assertNotNull(page.getElementByName("_.enabled"));
//
//        assertTrue(AlaudaSyncGlobalConfiguration.get().isEnabled());
//
//        AlaudaSyncGlobalConfiguration config = AlaudaSyncGlobalConfiguration.get();
//        assertNotNull(config);
//        assertNotNull(config.getDisplayName());
//        assertNotNull(config.getNamespaces());
//
//        config.reWatchAllNamespace("fake-ns");
//        assertTrue(config.isEnabled());
//
//        // Constructor TODO connect test is wrong
////        config = new GlobalPluginConfiguration(false, "fake-server", "hello", null, null, null,
// null);
////        FormValidation formValidation = config.doVerifyConnect("", "");
////        assertNotNull(formValidation);
////        assertEquals(FormValidation.Kind.OK, formValidation.kind);
//    }
//
//    @Test
//    public void saveTest() throws IOException, SAXException {
//        JenkinsRule.WebClient wc = j.createWebClient();
//
//        {
//            HtmlPage page = wc.goTo("configure");
//            String jenkinsService = "alauda";
//
//            HtmlCheckBoxInput elementEnabled = page.getElementByName("_.enabled");
//            elementEnabled.setChecked(true);
//            HtmlTextInput elementService = page.getElementByName("_.jenkinsService");
//            elementService.setValueAttribute(jenkinsService);
//            HtmlForm form = page.getFormByName("config");
//            HtmlFormUtil.submit(form);
//
//            assertTrue(AlaudaSyncGlobalConfiguration.get().isEnabled());
//            assertEquals(AlaudaSyncGlobalConfiguration.get().getJenkinsService(), jenkinsService);
//        }
//
//        {
//            HtmlPage page = wc.goTo("configure");
//
//            HtmlCheckBoxInput elementEnabled = page.getElementByName("_.enabled");
//            elementEnabled.setChecked(false);
//            HtmlForm form = page.getFormByName("config");
//            HtmlFormUtil.submit(form);
//
//            assertFalse(AlaudaSyncGlobalConfiguration.get().isEnabled());
//        }
//    }
// }
