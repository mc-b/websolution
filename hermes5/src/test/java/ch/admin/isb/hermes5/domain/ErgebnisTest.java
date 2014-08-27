/*----------------------------------------------------------------------------------------------
 * Copyright 2014 Federal IT Steering Unit FITSU Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *---------------------------------------------------------------------------------------------*/
package ch.admin.isb.hermes5.domain;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class ErgebnisTest {

    private Ergebnis ergebnis;

    @Before
    public void setUp() throws Exception {
        ergebnis = SzenarioBuilder.ergebnis("abc", "vorlage1.docx|<a href=\"http://www.hermes.admin.ch\">HERMES</a>");
    }

    @Test
    public void testGetWebAttachmentUrls() {
       List<Localizable> webAttachmentUrls = ergebnis.getWebAttachmentUrls();
       assertEquals(1, webAttachmentUrls.size());
    }

    @Test
    public void testGetTemplateAttachmentUrls() {
        List<String> templates = ergebnis.getTemplateAttachmentUrls();
        assertEquals(1, templates.size());
        assertEquals("vorlage1.docx", templates.get(0));
    }

}
